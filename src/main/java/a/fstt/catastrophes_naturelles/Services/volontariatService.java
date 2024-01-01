package a.fstt.catastrophes_naturelles.Services;

import a.fstt.catastrophes_naturelles.persistence.Volontariat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import a.fstt.catastrophes_naturelles.repository.volontariatRepo;

import java.util.List;
@Service
public class volontariatService implements volontariatServices{
    @Autowired
    private volontariatRepo volontariatRepo;
    @Override
    public Volontariat saveVolontariat(Volontariat volontariat) {
        return volontariatRepo.save(volontariat);
    }

    @Override
    public void deleteVolontariat(long volontariatId) {
        volontariatRepo.deleteById(volontariatId);

    }

    @Override
    public List<Volontariat> getAllVolontariat() {
        return volontariatRepo.findAll();
    }

    @Override
    public Volontariat getOneVolontariat(Long id) {
        return volontariatRepo.findById(id).get();
    }
}
