package a.fstt.catastrophes_naturelles.Services;

import a.fstt.catastrophes_naturelles.persistence.Besoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import a.fstt.catastrophes_naturelles.repository.besoinRepo;

import java.util.Collections;
import java.util.List;
@Service
public class besoinService implements besoinServices{
    @Autowired
    private besoinRepo besoinRepo;
    @Override
    public Besoin saveBesoin(Besoin besoin) {
        return besoinRepo.save(besoin);
    }

    @Override
    public void deleteBesoin(long besoinId) {
        besoinRepo.deleteById(besoinId);
    }

    @Override
    public List<Besoin> getAllBesoin() {
        return besoinRepo.findAll();
    }

    @Override
    public Besoin getOneBesoin(Long id) {
        return besoinRepo.findById(id).get();
    }
}
