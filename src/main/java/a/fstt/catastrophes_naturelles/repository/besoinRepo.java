package a.fstt.catastrophes_naturelles.repository;

import a.fstt.catastrophes_naturelles.persistence.Besoin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface besoinRepo extends JpaRepository<Besoin, Long> {
}
