package com.movied.movieworkshop;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="movieprojreview")
public class Review {
		public Review() {
		}
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private int revid;
		
		private String reviews;
		
		
		public Review(int revid, String reviews) {
			super();
			this.revid = revid;
			this.reviews = reviews;
		}
		public int getRevid() {
			return revid;
		}

		public void setRevid(int revid) {
			this.revid = revid;
		}

		public String getReviews() {
			return reviews;
		}

		public void setReviews( String reviews) {
			this.reviews = reviews;
		}
}
		
		
