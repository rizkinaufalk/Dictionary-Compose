package com.cleanarch.dictionary.feature.dictionary.domain.repository

import com.cleanarch.dictionary.core.util.Resource
import com.cleanarch.dictionary.feature.dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>

}