package a.fstt.catastrophes_naturelles.Services;

import a.fstt.catastrophes_naturelles.persistence.assistence;

import java.util.List;

public interface assistenceServices {
    assistence saveassistence(assistence assistance);
    void deleteAssistence(long assistanceId);
    List<assistence> getAllassistence();
    assistence getOneAssistence(Long id);

}
