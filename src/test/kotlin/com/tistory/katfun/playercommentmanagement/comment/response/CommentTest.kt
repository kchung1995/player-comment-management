package com.tistory.katfun.playercommentmanagement.comment.response

import com.tistory.katfun.playercommentmanagement.comment.stub.CommentsStub.COMMENTS_JSON_STUB
import com.tistory.katfun.playercommentmanagement.comment.stub.CommentsStub.COMMENTS_OBJECT_STUB
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CommentTest {
    @Test
    fun `JSON을 객체로 변환한 내용은 Comment와 같다`() {
        // given
        val comments = COMMENTS_OBJECT_STUB
        val jsonComments = COMMENTS_JSON_STUB

        // when
        val converted = Comment.from(jsonComments)

        // then
        assertThat(converted.size).isEqualTo(comments.size)
        assertThat(converted[0]).isEqualTo(comments[0])
        assertThat(converted[1]).isEqualTo(comments[1])
    }
}
