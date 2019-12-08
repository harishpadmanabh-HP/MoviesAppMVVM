package com.hp.moviesappmvvm.Retro;

import com.hp.moviesappmvvm.models.MovieSearchModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Apis {


    @GET("?")
    Call<MovieSearchModel> searchMovies(@Query("s") String searchQuerry,
                                        @Query("apikey") String apikey);

}
