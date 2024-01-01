package a.fstt.catastrophes_naturelles.Services;

import a.fstt.catastrophes_naturelles.persistence.catastrophes;
import a.fstt.catastrophes_naturelles.repository.catastropheRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class catastrophesService implements catastrophesServices{

    @Autowired
    private catastropheRepo catastropheRepo; // Injection du repository


    @Override
    public catastrophes saveCatastrophe(catastrophes catastrophes) {
        return catastropheRepo.save(catastrophes);
    }

    @Override
    public void deleteCatastrophe(long id) {
        catastropheRepo.deleteById(id);

    }

    @Override
    public List<catastrophes> getAllCatastrophe() {
        return catastropheRepo.findAll();
    }

    @Override
    public catastrophes getOneCatastrophe(Long id) {
        return catastropheRepo.findById(id).get();
    }
}
