package com.movied.movieworkshop;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="movieproj")
public class Movies {
		public Movies() {
		}
		@Id
		@Column(name="id")
		private int id;
		@Column(name="imdbId")
		private String imdbId;
		@Column(name="title")
		private String title;
		@Column(name="releaseDate")
		private String releaseDate;
		@Column(name="trailerLink")
		private String trailerLink;
		@Column(name="genres")
		private String genres;
		@Column(name="poster")
		private String poster;
		@Column(name="backdrops")
		private String backdrops;
		@Column(name="reviewIds")
		@ElementCollection
		private List<String> reviewIds;
		

		
		public Movies(int id, String imdbId, String title, String releaseDate, String trailerLink, String genres, String poster,
				String backdrops,List<String> reviewIds) {
			super();
			this.id = id;
			this.imdbId = imdbId;
			this.title = title;
			this.releaseDate = releaseDate;
			this.trailerLink = trailerLink;
			this.genres = genres;
			this.poster = poster;
			this.backdrops = backdrops;
			this.reviewIds=reviewIds;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getImdbId() {
			return imdbId;
		}
		public void setImdbId(String imdbId) {
			this.imdbId = imdbId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getReleaseDate() {
			return releaseDate;
		}
		public void setReleaseDate(String releaseDate) {
			this.releaseDate = releaseDate;
		}
		public String getTrailerLink() {
			return trailerLink;
		}
		public void setTrailerLink(String trailerLink) {
			this.trailerLink = trailerLink;
		}
		public String getGenres() {
			return genres;
		}
		public void setGenres(String genres) {
			this.genres = genres;
		}
		
		public String getPoster() {
			return poster;
		}
		public void setPoster(String poster) {
			this.poster = poster;
		}
		public String getBackdrops() {
			return backdrops;
		}
		public void setBackdrops(String backdrops) {
			this.backdrops = backdrops;
		}
		public List<String> getreviewIds() {
			return reviewIds;
		}
		public void setreviewIds(List<String> reviewIds) {
			this.reviewIds = reviewIds;
		}
		
		
}
		
		
