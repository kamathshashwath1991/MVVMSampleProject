package com.example.kamathshashwath.mvvmsampleproject.ui.quotes

import android.arch.lifecycle.ViewModel
import com.example.kamathshashwath.mvvmsampleproject.data.Quote
import com.example.kamathshashwath.mvvmsampleproject.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel(){

    fun getQuotes()= quoteRepository.getQuotes()
    fun addQuotes(quote: Quote)= quoteRepository.addQuote(quote)
}