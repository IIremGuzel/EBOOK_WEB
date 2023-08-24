package com.iremguzel.eBook.dao;


import com.iremguzel.eBook.entity.BooksCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
/*@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Tüm isteklere açık */
@RepositoryRestResource(collectionResourceRel = "booksCategory", path = "books-category")
public interface BooksCategoryRepository extends JpaRepository<BooksCategory, Long> {
}




