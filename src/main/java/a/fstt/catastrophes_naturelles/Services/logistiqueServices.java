package a.fstt.catastrophes_naturelles.Services;

import a.fstt.catastrophes_naturelles.persistence.Logistique;
import a.fstt.catastrophes_naturelles.persistence.assistence;

import java.util.List;

public interface logistiqueServices {
    Logistique saveLogistique(Logistique logistique);
    void deleteLogistique(long logistiqueId);
    List<Logistique> getAllLogistique();
    Logistique getOneLogistique(Long id);
}
