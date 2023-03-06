package com.cleanarch.dictionary.feature.dictionary.domain.usecase

import com.cleanarch.dictionary.core.util.Resource
import com.cleanarch.dictionary.feature.dictionary.domain.model.WordInfo
import com.cleanarch.dictionary.feature.dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfo(
    private val repository: WordInfoRepository
) {

    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if(word.isBlank()) {
            return flow {  }
        }
        return repository.getWordInfo(word)
    }
}