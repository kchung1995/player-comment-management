package com.tistory.katfun.playercommentmanagement.comment

import com.tistory.katfun.playercommentmanagement.comment.repository.CommentRepository
import com.tistory.katfun.playercommentmanagement.domain.entity.PlayerComments
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CommentService(
    private val commentRepository: CommentRepository
) {
    @Transactional(readOnly = true)
    fun comments(playerCommendIds: List<Long>?): List<PlayerComments> {
        return when {
            playerCommendIds.isNullOrEmpty() -> commentRepository.findAll()
            else -> commentRepository.findByPlayerCommentsIdIn(playerCommendIds)
        }
    }
}
