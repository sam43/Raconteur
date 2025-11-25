package io.raconteur.data.remote.dto

import io.raconteur.domain.model.Story

data class StoryDto(
    val id: String,
    val title: String,
    val content: String
) {
    fun toDomain() = Story(id, title, content)
}

