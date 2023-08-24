package com.iremguzel.eBook.dao;


import com.iremguzel.eBook.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
/*@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Tüm isteklere açık */
public interface BooksRepository extends JpaRepository<Books, Long> {
}