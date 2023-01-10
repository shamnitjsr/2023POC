package in.shambhu.db1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.shambhu.db1.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
