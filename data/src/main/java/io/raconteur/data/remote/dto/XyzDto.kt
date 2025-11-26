package io.raconteur.data.remote.dto

import io.raconteur.domain.model.XyzData

data class XyzDto(
    val id: String,
    val title: String,
    val content: String
) {
    fun toDomain() = XyzData(id, title, content)
}

