package pl.edu.pwsztar.service.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;
import pl.edu.pwsztar.domain.mapper.EntityMapper;
import pl.edu.pwsztar.domain.mapper.MovieListMapper;
import pl.edu.pwsztar.domain.repository.MovieRepository;
import pl.edu.pwsztar.service.MovieService;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieServiceImpl.class);

    private final MovieRepository movieRepository;
    private final MovieListMapper movieListMapper;
    private final EntityMapper entityMapper;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository,
                            MovieListMapper movieListMapper, EntityMapper entityMapper) {

        this.movieRepository = movieRepository;
        this.movieListMapper = movieListMapper;
        this.entityMapper = entityMapper;
    }

    @Override
    public List<MovieDto> findAll() {
            List<Movie> movies = movieRepository.findAll();
            return movieListMapper.mapToDto(movies);
    }
    public MovieDto createMovie(CreateMovieDto createMovieDto){
        //final Movie movie = new Movie(createMovieDto.getTitle(), createMovieDto.getImage(),createMovieDto.getYear());
        final Movie movie = entityMapper.mapToEnity(createMovieDto);
        final Movie savedMovie = movieRepository.save(movie);

        return new MovieDto(savedMovie.getMovieId(), savedMovie.getTitle(), savedMovie.getImage(), savedMovie.getYear());
    }

    public void deleteMovie(long id){
        movieRepository.deleteById(id);
    }


}
