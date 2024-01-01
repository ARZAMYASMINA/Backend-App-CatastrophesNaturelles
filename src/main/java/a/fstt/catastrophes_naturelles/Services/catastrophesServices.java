package a.fstt.catastrophes_naturelles.Services;

import a.fstt.catastrophes_naturelles.persistence.catastrophes;

import java.util.List;

public interface catastrophesServices {
    catastrophes saveCatastrophe(catastrophes catastrophes);
    void deleteCatastrophe(long id);
    List<catastrophes> getAllCatastrophe();
    catastrophes getOneCatastrophe(Long id);
}
