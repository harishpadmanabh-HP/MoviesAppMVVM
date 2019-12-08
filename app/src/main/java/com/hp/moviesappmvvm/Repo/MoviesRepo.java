package com.hp.moviesappmvvm.Repo;

import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.hp.moviesappmvvm.Retro.RetroConfig;
import com.hp.moviesappmvvm.models.MovieSearchModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MoviesRepo {
    private static MoviesRepo moviesRepo;
    public static MoviesRepo getInstance()
    {
        if(moviesRepo == null)
        {
            moviesRepo=new MoviesRepo();
        }
    return  moviesRepo;
    }

    RetroConfig retroConfig=new RetroConfig();

    public MutableLiveData<MovieSearchModel> getMovies(String searchquerry,String apikey)
    {
        final MutableLiveData<MovieSearchModel> moviesData=new MutableLiveData<>();

        retroConfig.getApi().searchMovies(searchquerry,apikey).enqueue(new Callback<MovieSearchModel>() {
            @Override
            public void onResponse(Call<MovieSearchModel> call, Response<MovieSearchModel> response) {

                moviesData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<MovieSearchModel> call, Throwable t) {
               // Toast.makeText(, "Failed "+t, Toast.LENGTH_LONG).show();

                Log.e("onFailure", String.valueOf(t));
            }
        });
        return  moviesData;


    }

}
