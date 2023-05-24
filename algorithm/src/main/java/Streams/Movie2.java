package Streams;

public class Movie2 {


        private String title;
        private int likes;
        private Genre genre;
        public Movie2(String title,int likes, Genre genre){
            this.likes=likes;
            this.title=title;

            this.genre = genre;
        }
        public String getTitle() {
            return title;
        }
        public Integer getLikes(){
            return this.likes;
        }

        public Genre getGenre() {
            return genre;
        }
    }


