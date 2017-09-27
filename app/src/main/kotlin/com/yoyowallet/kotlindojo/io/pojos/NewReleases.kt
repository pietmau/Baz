package com.yoyowallet.kotlindojo.io.pojos

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NewReleases(
    @SerializedName("albums")
    @Expose
    var albums: Albums? = null
)

