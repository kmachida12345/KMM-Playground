package com.github.kmachida12345.kmm_playground.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.kmachida12345.kmm_playground.Greeting
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.github.kmachida12345.kmm_playground.MyFirestoreClient
import com.github.kmachida12345.kmm_playground.Post
import kotlinx.coroutines.launch

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        lifecycleScope.launch {
            MyFirestoreClient().addPost(Post(System.currentTimeMillis()))
            MyFirestoreClient().getAllPosts()
        }
    }
}
