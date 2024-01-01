package a.fstt.catastrophes_naturelles.repository;

import a.fstt.catastrophes_naturelles.persistence.Volontariat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface volontariatRepo extends JpaRepository<Volontariat, Long> {
}
