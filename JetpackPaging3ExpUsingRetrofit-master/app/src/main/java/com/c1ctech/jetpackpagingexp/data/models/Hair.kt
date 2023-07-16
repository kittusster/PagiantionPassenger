package com.c1ctech.jetpackpagingexp.data.models

import com.google.gson.annotations.SerializedName


data class Hair (

  @SerializedName("color" ) var color : String? = null,
  @SerializedName("type"  ) var type  : String? = null

)