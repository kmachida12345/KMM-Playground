package com.github.kmachida12345.kmm_playground

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.firestore.firestore
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MyFirestoreClient {
    suspend fun addPost(post: Post) {
        Firebase.firestore.collection("posts").add(post)
    }

    suspend fun getAllPosts() {
        Firebase.firestore.collection("posts").snapshots.collect {
            it.documents.forEach {
                val hoge: Post = it.data()
                println("hoge ${hoge}")
            }
        }
    }
}