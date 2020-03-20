package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieListMapper {

    public List<MovieDto> mapToDto(List<Movie> movies) {
        List<MovieDto> moviesDto = new ArrayList<>();

        for(Movie movie: movies) {
            MovieDto movieDto = new MovieDto();

            movieDto.setMovieId(movie.getMovieId());
            movieDto.setTitle(movie.getTitle());
            movieDto.setImage(movie.getImage());
            movieDto.setYear(movie.getYear());

            moviesDto.add(movieDto);

        }

        return moviesDto;
    }
}
