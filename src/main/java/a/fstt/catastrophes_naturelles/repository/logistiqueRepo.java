package a.fstt.catastrophes_naturelles.repository;

import a.fstt.catastrophes_naturelles.persistence.Logistique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface logistiqueRepo extends JpaRepository<Logistique, Long> {
}
