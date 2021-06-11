package com.github.kmachida12345.kmm_playground

import kotlinx.serialization.Serializable

@Serializable
data class Post(
    val timestamp: Long = 0L
) {
}