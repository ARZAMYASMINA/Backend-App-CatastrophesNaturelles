package a.fstt.catastrophes_naturelles.Services;

import a.fstt.catastrophes_naturelles.persistence.Aide;
import a.fstt.catastrophes_naturelles.persistence.assistence;

import java.util.List;

public interface aideServices {
    Aide saveAide(Aide aide);
    void deleteAide(long aideId);
    List<Aide> getAllAide();
    Aide getOneAide(Long id);
}
