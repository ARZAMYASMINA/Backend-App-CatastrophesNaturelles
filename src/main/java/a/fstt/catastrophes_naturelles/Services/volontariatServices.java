package a.fstt.catastrophes_naturelles.Services;

import a.fstt.catastrophes_naturelles.persistence.Volontariat;

import java.util.List;

public interface volontariatServices {
    Volontariat saveVolontariat(Volontariat volontariat);
    void deleteVolontariat(long volontariatId);
    List<Volontariat> getAllVolontariat();
    Volontariat getOneVolontariat(Long id);
}
