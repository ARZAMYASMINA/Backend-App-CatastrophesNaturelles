package a.fstt.catastrophes_naturelles.Services;

import a.fstt.catastrophes_naturelles.persistence.assistence;
import a.fstt.catastrophes_naturelles.repository.assistenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class assistenceService implements assistenceServices{

    @Autowired
    private assistenceRepo assistanceRepository;

    public assistence saveassistence(assistence assistance) {
        return assistanceRepository.save(assistance);
    }

    @Override
    public void deleteAssistence(long assistanceId) {
        assistanceRepository.deleteById(assistanceId);
    }

    public List<assistence> getAllassistence() {
        return assistanceRepository.findAll();
    }

    @Override
    public assistence getOneAssistence(Long id) {
        return assistanceRepository.findById(id).get();
    }

}
