package com.hp.moviesappmvvm.views.HomeScreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;

import com.hp.moviesappmvvm.R;
import com.hp.moviesappmvvm.models.MovieSearchModel;

import java.util.List;

public class HomeScreen extends AppCompatActivity {

    HomescreenViewmodel homescreenViewmodel;
    MovieSearchModel movieSearchModel;
List<MovieSearchModel.SearchBean> movielist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        homescreenViewmodel= ViewModelProviders.of(this).get(HomescreenViewmodel.class);
        homescreenViewmodel.initMoviesVM("spiderman");
        homescreenViewmodel.getMoviesData().observe(this, new Observer<MovieSearchModel>() {
            @Override
            public void onChanged(MovieSearchModel movieSearchModel) {

                movielist=movieSearchModel.getSearch();
                for(int i=0;i<movielist.size();i++)
                {
                    Log.e("MOVIES",movielist.get(i).getTitle()+"\n"+
                            movielist.get(i).getPoster()
                    );
                }

            }
        });




    }
}
