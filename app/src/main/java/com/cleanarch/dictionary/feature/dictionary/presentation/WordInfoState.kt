package com.cleanarch.dictionary.feature.dictionary.presentation

import com.cleanarch.dictionary.feature.dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
