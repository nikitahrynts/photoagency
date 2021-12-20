package it.bsuir.photoagency.repositories;

import it.bsuir.photoagency.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
