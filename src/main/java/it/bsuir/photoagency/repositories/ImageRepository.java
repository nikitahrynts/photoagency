package it.bsuir.photoagency.repositories;

import it.bsuir.photoagency.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
