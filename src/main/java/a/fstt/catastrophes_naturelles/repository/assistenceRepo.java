package a.fstt.catastrophes_naturelles.repository;
import a.fstt.catastrophes_naturelles.persistence.assistence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface assistenceRepo extends JpaRepository<assistence, Long> {
}
