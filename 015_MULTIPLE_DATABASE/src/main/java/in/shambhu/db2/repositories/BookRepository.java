package in.shambhu.db2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.shambhu.db2.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
