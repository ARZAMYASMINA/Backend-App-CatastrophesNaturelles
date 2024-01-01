package a.fstt.catastrophes_naturelles.Services;

import a.fstt.catastrophes_naturelles.persistence.Aide;
import a.fstt.catastrophes_naturelles.repository.aideRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class aideService implements aideServices{

    @Autowired
    private aideRepo aideRepo;

    @Override
    public Aide saveAide(Aide aide) {
        return aideRepo.save(aide);
    }

    @Override
    public void deleteAide(long aideId) {
        aideRepo.deleteById(aideId);

    }

    @Override
    public List<Aide> getAllAide() {
        return aideRepo.findAll();
    }

    @Override
    public Aide getOneAide(Long id) {
        return aideRepo.findById(id).get();
    }
}
