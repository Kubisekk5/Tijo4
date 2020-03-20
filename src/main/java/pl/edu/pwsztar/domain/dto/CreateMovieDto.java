package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class CreateMovieDto implements Serializable {
    private String title;
    private String image;
    private Integer year;

    public CreateMovieDto() {
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "CreateMovieDto{" +
                "title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", year=" + year +
                '}';
    }
}
