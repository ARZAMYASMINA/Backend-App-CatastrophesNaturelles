package a.fstt.catastrophes_naturelles.Services;

import a.fstt.catastrophes_naturelles.persistence.Logistique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import a.fstt.catastrophes_naturelles.repository.logistiqueRepo;

import java.util.List;
@Service
public class logistiqueService implements logistiqueServices{
    @Autowired
    private logistiqueRepo logistiqueRepo;
    @Override
    public Logistique saveLogistique(Logistique logistique) {
        return logistiqueRepo.save(logistique);
    }

    @Override
    public void deleteLogistique(long logistiqueId) {
        logistiqueRepo.deleteById(logistiqueId);
    }

    @Override
    public List<Logistique> getAllLogistique() {
        return logistiqueRepo.findAll();
    }

    @Override
    public Logistique getOneLogistique(Long id) {
        return logistiqueRepo.findById(id).get();
    }
}
