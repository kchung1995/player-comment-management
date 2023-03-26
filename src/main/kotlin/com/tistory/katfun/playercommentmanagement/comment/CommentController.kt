package com.tistory.katfun.playercommentmanagement.comment

import com.tistory.katfun.playercommentmanagement.comment.response.PlayerCommentsResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController
class CommentController(
    private val commentService: CommentService
) {
    @GetMapping("/comments")
    fun playerComments(
        @RequestParam("playerId", required = false) playerId: List<Long>?,
    ): List<PlayerCommentsResponse> {
        return commentService.comments(playerId)
            .map { PlayerCommentsResponse.from(it) }
    }
}