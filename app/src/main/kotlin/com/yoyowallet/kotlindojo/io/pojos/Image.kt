package com.yoyowallet.kotlindojo.io.pojos

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Image {

  @SerializedName("height")
  @Expose
  var height: Int? = null
  @SerializedName("url")
  @Expose
  var url: String? = null
  @SerializedName("width")
  @Expose
  var width: Int? = null

}
