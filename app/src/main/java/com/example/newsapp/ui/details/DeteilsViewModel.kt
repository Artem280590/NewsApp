package com.example.newsapp.ui.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.data.api.NewsRepository
import com.example.newsapp.models.Article
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(private val repository: NewsRepository): ViewModel() {

    fun saveFavoriteArticle(article: Article) = viewModelScope.launch(Dispatchers.IO){
        repository.addToFavorite(article = article)
    }

    fun deleteFavoriteArticle(article: Article) = viewModelScope.launch(Dispatchers.IO){
        repository.deleteFromFavorite(article = article)
    }
}