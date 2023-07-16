package com.c1ctech.jetpackpagingexp.data.models

import com.google.gson.annotations.SerializedName


data class ExampleJson2KtKotlin (

  @SerializedName("users" ) var users : ArrayList<Users> = arrayListOf(),
  @SerializedName("total" ) var total : Int?             = null,
  @SerializedName("skip"  ) var skip  : Int?             = null,
  @SerializedName("limit" ) var limit : Int?             = null

)