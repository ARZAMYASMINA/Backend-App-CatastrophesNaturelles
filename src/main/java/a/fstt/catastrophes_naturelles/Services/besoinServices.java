package a.fstt.catastrophes_naturelles.Services;

import a.fstt.catastrophes_naturelles.persistence.Besoin;

import java.util.List;

public interface besoinServices {
    Besoin saveBesoin(Besoin besoin);
    void deleteBesoin(long besoinId);
    List<Besoin> getAllBesoin();
    Besoin getOneBesoin(Long id);

}
