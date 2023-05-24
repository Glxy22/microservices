package Streams;

public  class Movie {

    private String title;
    private int likes;

    public Movie(String title, int likes){
        this.likes=likes;
        this.title=title;


    }
    public String getTitle() {
        return title;
    }
    public Integer getLikes(){
        return this.likes;
    }


}
