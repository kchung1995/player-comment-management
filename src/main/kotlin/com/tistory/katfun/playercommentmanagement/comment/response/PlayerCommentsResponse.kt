package com.tistory.katfun.playercommentmanagement.comment.response

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.tistory.katfun.playercommentmanagement.domain.entity.PlayerComments
import java.time.LocalDateTime

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class PlayerCommentsResponse(
    val playerCommentsId: Long,
    val name: String,
    val nickname: String,
    val team: String,
    val latestWin: String?,
    val winCount: Int,
    val comments: List<Comment>
) {
    companion object {
        fun from(comment: PlayerComments): PlayerCommentsResponse {
            with(comment) {
                return PlayerCommentsResponse(
                    playerCommentsId,
                    name,
                    nickname,
                    team,
                    latestWin,
                    winCount,
                    comments = Comment.from(comments)
                )
            }
        }
    }
}

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class Comment(
    val name: String,
    val singleComment: String,
    val scorePersonal: Int,
    val scoreTeamplay: Int,
    val scorePotential: Int,
    val isNextRound: Boolean,
    val commentDate: LocalDateTime
) {
    companion object {
        fun from(comments: String): List<Comment> {
            return jsonToComments(comments)
                .map {
                    Comment(
                        it.name,
                        it.singleComment,
                        it.scorePersonal,
                        it.scoreTeamplay,
                        it.scorePotential,
                        it.isNextRound,
                        it.commentDate
                    )
                }
        }

        private fun jsonToComments(comments: String): List<Comment> {
            val mapper = jacksonObjectMapper()
            return mapper.readValue(
                comments,
                mapper.registerModule(JavaTimeModule()).typeFactory.constructCollectionType(
                    List::class.java,
                    Comment::class.java
                )
            )
        }
    }
}
