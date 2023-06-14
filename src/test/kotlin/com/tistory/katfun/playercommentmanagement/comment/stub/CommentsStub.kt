package com.tistory.katfun.playercommentmanagement.comment.stub

import com.tistory.katfun.playercommentmanagement.comment.response.Comment
import java.time.LocalDateTime

object CommentsStub {
    private val FIRST_NAME = "침착맨"
    private val FIRST_SINGLE_COMMENT = "대체 불가능한 차세대 유망주"
    private val FIRST_SCORE_PERSONAL = 10
    private val FIRST_SCORE_TEAMPLAY = 8
    private val FIRST_SCORE_POTENTIAL = 10
    private val FIRST_IS_NEXT_ROUND = true
    private val FIRST_COMMENT_DATE = "2022-08-02T14:00:00"

    private val SECOND_NAME = "주호민"
    private val SECOND_NAME_SINGLE_COMMENT = "아직은 지켜봐야 하는 단계"
    private val SECOND_NAME_SCORE_PERSONAL = 9
    private val SECOND_NAME_SCORE_TEAMPLAY = 10
    private val SECOND_NAME_SCORE_POTENTIAL = 9
    private val SECOND_IS_NEXT_ROUND = false
    private val SECOND_COMMENT_DATE = "2022-08-04T19:00:00"

    val COMMENTS_OBJECT_STUB = listOf(
        Comment(
            FIRST_NAME,
            FIRST_SINGLE_COMMENT,
            FIRST_SCORE_PERSONAL,
            FIRST_SCORE_TEAMPLAY,
            FIRST_SCORE_POTENTIAL,
            FIRST_IS_NEXT_ROUND,
            LocalDateTime.parse(FIRST_COMMENT_DATE)
        ),
        Comment(
            SECOND_NAME,
            SECOND_NAME_SINGLE_COMMENT,
            SECOND_NAME_SCORE_PERSONAL,
            SECOND_NAME_SCORE_TEAMPLAY,
            SECOND_NAME_SCORE_POTENTIAL,
            SECOND_IS_NEXT_ROUND,
            LocalDateTime.parse(SECOND_COMMENT_DATE)
        )
    )

    val COMMENTS_JSON_STUB = """
        [
            {
                "name" : "$FIRST_NAME",
                "single_comment" : "$FIRST_SINGLE_COMMENT",
                "score_personal" : $FIRST_SCORE_PERSONAL,
                "score_teamplay" : $FIRST_SCORE_TEAMPLAY,
                "score_potential" : $FIRST_SCORE_POTENTIAL,
                "is_next_round" : $FIRST_IS_NEXT_ROUND,
                "comment_date" : "$FIRST_COMMENT_DATE"
            },
            {
                "name" : "$SECOND_NAME",
                "single_comment" : "$SECOND_NAME_SINGLE_COMMENT",
                "score_personal" : $SECOND_NAME_SCORE_PERSONAL,
                "score_teamplay" : $SECOND_NAME_SCORE_TEAMPLAY,
                "score_potential" : $SECOND_NAME_SCORE_POTENTIAL,
                "is_next_round" : $SECOND_IS_NEXT_ROUND,
                "comment_date" : "$SECOND_COMMENT_DATE"
            }
        ]
    """.trimIndent()
}
