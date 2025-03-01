package com.ucsdextandroid1.kotlinlist

import com.google.gson.annotations.SerializedName

class Models {

        data class SearchResults(
            @SerializedName("results")
            val songs: List<SongItem> = emptyList()

        )
      data class SongItem(
              @SerializedName("trackId") val trackId: Long = 0,
              @SerializedName("trackName") val trackName: String? = null,
              @SerializedName("artistName") val artistName: String? = null,
              @SerializedName("collectionName") val albumName: String? = null,
              @SerializedName("artworkUrl100") val artworkUrl: String? = null,
              @SerializedName("previewUrl") val previewUrl: String? = null,
              @SerializedName("trackTimeMillis") val trackTime: Long = 0)


    }


