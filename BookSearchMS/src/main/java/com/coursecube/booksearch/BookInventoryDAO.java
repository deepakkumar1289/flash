package com.coursecube.booksearch;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookInventoryDAO extends JpaRepository<BookInventory,Integer> {

}
