package com.yoyowallet.kotlindojo.io.webservice

import com.yoyowallet.kotlindojo.io.pojos.NewReleases
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface SpotifyService {

    /**
     * Get a list of Spotify featured playlists (shown, for example, on a Spotify player’s “Browse” tab).
     *
     * @param options  Optional parameters. For list of supported parameters see
     *                 <a href="https://developer.spotify.com/web-api/get-list-featured-playlists/">endpoint documentation</a>
     * @return A callback containing object with the featured playlists
     * @see <a href="https://developer.spotify.com/web-api/get-list-featured-playlists/">Get a List of Featured Playlists</a>
     */
    @GET("v1//browse/featured-playlists")
    fun getFeaturedPlaylists(@QueryMap options: Map<String, Any>?): Call<Unit>

    /**
     * Get a list of new album releases featured in Spotify (shown, for example, on a Spotify player’s “Browse” tab).
     *
     * @param options Optional parameters. For list of supported parameters see
     *                <a href="https://developer.spotify.com/web-api/get-list-new-releases/">endpoint documentation</a>
     * @return A callback containing object with the new album releases
     * @see <a href="https://developer.spotify.com/web-api/get-list-new-releases/">Get a List of New Releases</a>
     */
    @GET("v1/browse/new-releases")
    fun getNewReleases(): Call<NewReleases>

    /**
     * Retrieve Spotify categories. Categories used to tag items in
     * Spotify (on, for example, the Spotify player’s “Browse” tab).
     *
     * @param options Optional parameters.
     * @return A callback containing categories.
     * @see <a href="https://developer.spotify.com/web-api/get-list-categories/">Get a List of Categories</a>
     */
    @GET("v1//browse/categories")
    fun getCategories(@QueryMap options: Map<String, Any>?): Call<Unit>

    /**
     * Retrieve a Spotify category.
     *
     * @param categoryId The category's ID.
     * @param options    Optional parameters.
     * @return A callback containing a Spotify category.
     * @see <a href="https://developer.spotify.com/web-api/get-category/">Get a Spotify Category</a>
     */
    @GET("v1//browse/categories/{category_id}")
    fun getCategory(@Path("category_id") categoryId: String, @QueryMap options: Map<String, Any>?): Call<Unit>

    /**
     * Retrieve playlists for a Spotify Category.
     *
     * @param categoryId The category's ID.
     * @param options    Optional parameters.
     * @return A callback containing playlists for a Spotify Category.
     * @see <a href="https://developer.spotify.com/web-api/get-categorys-playlists/">Get playlists for a Spotify Category</a>
     */
    @GET("v1//browse/categories/{category_id}/playlists")
    fun getPlaylistsCategory(@Path("category_id") categoryId: String, @QueryMap options: Map<String, Any>?): Call<Unit>
}