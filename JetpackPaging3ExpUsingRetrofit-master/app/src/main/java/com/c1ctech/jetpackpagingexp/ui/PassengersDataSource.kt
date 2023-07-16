package com.c1ctech.jetpackpagingexp.ui

import androidx.paging.PagingSource
import com.c1ctech.jetpackpagingexp.data.MyApi
import com.c1ctech.jetpackpagingexp.data.models.Users
import com.c1ctech.jetpackpagingexp.data.models.ExampleJson2KtKotlin

class PassengersDataSource(private val api: MyApi) : PagingSource<Int, Users>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Users> {
        return try {
            val nextPageNumber = params.key ?: 0
            val response: ExampleJson2KtKotlin = api.getPassengersData(nextPageNumber)

            LoadResult.Page(
                data = response.users,
                prevKey = if (nextPageNumber > 0) nextPageNumber - 1 else null,
                nextKey = if (nextPageNumber < 20) nextPageNumber + 1 else null

            //20 i declared as total pages
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}