package a.fstt.catastrophes_naturelles.repository;

import a.fstt.catastrophes_naturelles.persistence.Aide;
import org.springframework.data.jpa.repository.JpaRepository;

public interface aideRepo extends JpaRepository<Aide, Long> {
}
