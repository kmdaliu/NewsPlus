package com.avery.newsplus.api.model

import com.google.gson.annotations.SerializedName

data class Comment(
    @SerializedName("reply_id")
    val replyId: String,
    val replier: String,
    @SerializedName("reply_time")
    val replyTime: Long,
    @SerializedName("reply_cnt")
    val replyContent: String
)