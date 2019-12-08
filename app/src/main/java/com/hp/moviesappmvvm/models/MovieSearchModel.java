package com.hp.moviesappmvvm.models;

import java.util.List;

public class MovieSearchModel {

    /**
     * Search : [{"Title":"Kushi","Year":"2000","imdbID":"tt0361818","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BNGUxNTkxMDAtOGM4Mi00MmJmLWEwYWItZTg2NDllZjM3YTE1XkEyXkFqcGdeQXVyODE0NjUxNzY@._V1_SX300.jpg"},{"Title":"Kushi Kushiga","Year":"2004","imdbID":"tt1606265","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BZTA1NjI5ZDUtNWMwNS00ZmNkLTk5MDQtYzIzZmE3MWI4OWU5XkEyXkFqcGdeQXVyNTM3MDMyMDQ@._V1_SX300.jpg"},{"Title":"Khuda Kushi","Year":"2010","imdbID":"tt1644622","Type":"movie","Poster":"N/A"},{"Title":"Kushi Mil Gayi","Year":"2005","imdbID":"tt4885256","Type":"movie","Poster":"N/A"},{"Title":"Vojo Kushi","Year":"1969","imdbID":"tt0351964","Type":"movie","Poster":"N/A"}]
     * totalResults : 5
     * Response : True
     */

    private String totalResults;
    private String Response;
    private List<SearchBean> Search;

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String Response) {
        this.Response = Response;
    }

    public List<SearchBean> getSearch() {
        return Search;
    }

    public void setSearch(List<SearchBean> Search) {
        this.Search = Search;
    }

    public static class SearchBean {
        /**
         * Title : Kushi
         * Year : 2000
         * imdbID : tt0361818
         * Type : movie
         * Poster : https://m.media-amazon.com/images/M/MV5BNGUxNTkxMDAtOGM4Mi00MmJmLWEwYWItZTg2NDllZjM3YTE1XkEyXkFqcGdeQXVyODE0NjUxNzY@._V1_SX300.jpg
         */

        private String Title;
        private String Year;
        private String imdbID;
        private String Type;
        private String Poster;

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getYear() {
            return Year;
        }

        public void setYear(String Year) {
            this.Year = Year;
        }

        public String getImdbID() {
            return imdbID;
        }

        public void setImdbID(String imdbID) {
            this.imdbID = imdbID;
        }

        public String getType() {
            return Type;
        }

        public void setType(String Type) {
            this.Type = Type;
        }

        public String getPoster() {
            return Poster;
        }

        public void setPoster(String Poster) {
            this.Poster = Poster;
        }
    }
}
