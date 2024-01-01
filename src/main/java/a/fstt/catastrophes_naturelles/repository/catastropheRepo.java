package a.fstt.catastrophes_naturelles.repository;
import a.fstt.catastrophes_naturelles.persistence.catastrophes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface catastropheRepo extends JpaRepository<catastrophes, Long> {
}
