package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class MovieDto implements Serializable {

    private Long movieId;
    private String title;
    private String image;
    private Integer year;

    public MovieDto() {
    }

    public MovieDto(Long movieId, String title, String image, Integer year) {
        this.movieId = movieId;
        this.title = title;
        this.image = image;
        this.year = year;
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getYear() {return year;}

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setYear(Integer year) {this.year= year;}
}
