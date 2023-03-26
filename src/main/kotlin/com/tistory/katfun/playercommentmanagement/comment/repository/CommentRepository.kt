package com.tistory.katfun.playercommentmanagement.comment.repository

import com.tistory.katfun.playercommentmanagement.domain.entity.PlayerComments
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository : JpaRepository<PlayerComments, Long> {
    fun findByPlayerCommentsIdIn(playerIds: List<Long>): List<PlayerComments>
}