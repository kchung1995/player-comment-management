package com.tistory.katfun.playercommentmanagement.domain.entity

import javax.persistence.*

@Entity
@Table(name = "player_comments")
class PlayerComments(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_comments_id")
    val id: Long,

    @Column
    val name: String,

    @Column
    val nickname: String,

    @Column
    val team: String,

    @Column(name = "latest_win")
    val latestWin: String?,

    @Column(name = "win_count")
    val winCount: Int,

    @Column(columnDefinition = "text")
    val comments: String,
)