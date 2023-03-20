package com.example.newsapp.data.api

import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsService: NewsService){
    suspend fun getNews(contryCode: String, pageNumber: Int) =
        newsService.getHeadlines(countryCode = contryCode, page = pageNumber)
}