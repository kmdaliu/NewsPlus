package com.avery.newsplus.comment.datasource

import androidx.paging.DataSource
import com.avery.newsplus.api.model.Comment
import com.avery.newsplus.comment.repository.CommentRepository
import kotlinx.coroutines.CoroutineScope

class CommentDatasourceFactory(
    private val coroutineScope: CoroutineScope,
    private val newsId: String,
    private val repository: CommentRepository
) : DataSource.Factory<Int, Comment>() {

    override fun create(): DataSource<Int, Comment> = CommentDataSource(
        coroutineScope,
        newsId,
        repository
    )

}