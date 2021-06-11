package com.github.kmachida12345.kmm_playground

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.firestore.firestore

class MyFirestoreClient {
    suspend fun addPost(post: Post) {
        Firebase.firestore.collection("posts").add(post)
    }
}