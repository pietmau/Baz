package com.yoyowallet.kotlindojo.io.pojos

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ExternalUrls {

  @SerializedName("spotify")
  @Expose
  var spotify: String? = null

}
