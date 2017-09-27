package com.yoyowallet.kotlindojo.ui

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.yoyowallet.kotlindojo.R
import com.yoyowallet.kotlindojo.io.SpotifyApi
import com.yoyowallet.kotlindojo.io.pojos.NewReleases
import org.jetbrains.anko.custom.async
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class NewReleasesActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_new_releases)
    val toolbar = findViewById(R.id.toolbar) as Toolbar
    setSupportActionBar(toolbar)

    val fab = findViewById(R.id.fab) as FloatingActionButton

    fab.setOnClickListener({

      SpotifyApi.service.getNewReleases().enqueue(object : retrofit2.Callback<NewReleases> {
        override fun onResponse(call: Call<NewReleases>?, response: Response<NewReleases>?) {

        }

        override fun onFailure(call: Call<NewReleases>?, t: Throwable?) {

        }
      })


    })
  }
}
