package com.cleanarch.dictionary.feature.dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.cleanarch.dictionary.feature.dictionary.domain.model.Meaning
import com.cleanarch.dictionary.feature.dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    @PrimaryKey val id: Int? = null,
    val word: String,
    val phonetic: String,
    val meanings: List<Meaning>
) {
    fun toWordInfo(): WordInfo{
        return WordInfo(
            meanings = meanings,
            word = word,
            phonetic = phonetic
        )
    }
}
