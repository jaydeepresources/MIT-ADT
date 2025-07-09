package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "movies")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "movie_id")
	private int movieId;

	@Column(name = "movie_name")
	private String movieName;

	@Column(name = "movie_length")
	private int movieLength;

	@Column(name = "movie_language")
	private String movieLanguage;

	@Column(name = "movie_genre")
	private String movieGenre;

	@OneToMany(mappedBy = "movie")
	List<Review> reviews;
	
	public Movie() {

	}

	public Movie(int movieId, String movieName, int movieLength, String movieLanguage, String movieGenre) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieLength = movieLength;
		this.movieLanguage = movieLanguage;
		this.movieGenre = movieGenre;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieLength=" + movieLength
				+ ", movieLanguage=" + movieLanguage + ", movieGenre=" + movieGenre + "]";
	}

}