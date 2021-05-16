package com.coursecube.booksearch;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRatingDAO extends JpaRepository<BookRating,Integer> {
}
