package com.hp.moviesappmvvm.views.HomeScreen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.hp.moviesappmvvm.NetworkConfigs.Configs;
import com.hp.moviesappmvvm.Repo.MoviesRepo;
import com.hp.moviesappmvvm.models.MovieSearchModel;

public class HomescreenViewmodel extends ViewModel {

 private    MutableLiveData<MovieSearchModel> movieSearchModelMutableLiveData;
    MoviesRepo moviesRepo;

    public void initMoviesVM(String searchquerry)
    {
        if(movieSearchModelMutableLiveData!=null)
            return;

        moviesRepo=MoviesRepo.getInstance();
        movieSearchModelMutableLiveData=moviesRepo.getMovies(searchquerry, Configs.APIKEY);
    }

    LiveData<MovieSearchModel> getMoviesData(){
        return movieSearchModelMutableLiveData;
    }




}
