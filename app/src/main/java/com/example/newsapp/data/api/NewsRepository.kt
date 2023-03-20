package com.example.newsapp.data.api

import retrofit2.http.Query
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsService: NewsService){
    suspend fun getNews(contryCode: String, pageNumber: Int) =
        newsService.getHeadlines(countryCode = contryCode, page = pageNumber)

    suspend fun getSearchNews(query: String, pageNumber: Int) =
        newsService.getEverything(query = query, page = pageNumber)
}