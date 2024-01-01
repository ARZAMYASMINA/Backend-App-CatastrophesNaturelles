package a.fstt.catastrophes_naturelles.Controller;

import a.fstt.catastrophes_naturelles.Services.besoinService;
import a.fstt.catastrophes_naturelles.persistence.Besoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/besoin")
public class BesoinController {

    @Autowired
    private besoinService besoinService;

    @GetMapping("/add")
    public String addBesoinForm(Model model) {
        model.addAttribute("besoin", new Besoin());
        return "addBesoin";
    }

    @PostMapping("/save")
    public String saveBesoin(Besoin besoin) {
        besoinService.saveBesoin(besoin);
        return "redirect:/besoin/all";
    }

    @GetMapping("/all")
    public String listBesoins(Model model) {
        List<Besoin> besoinList = besoinService.getAllBesoin();
        model.addAttribute("listBesoins", besoinList);
        return "listBesoins";
    }

    @GetMapping("/delete/{id}")
    public String deleteBesoin(Model model, @PathVariable(value = "id") Long id) {
        besoinService.deleteBesoin(id);
        return "redirect:/besoin/all";
    }

    @GetMapping("/update/{id}")
    public String updateBesoinForm(Model model, @PathVariable(value = "id") Long id) {
        Besoin besoin = besoinService.getOneBesoin(id);
        model.addAttribute("besoin", besoin);
        return "addBesoin";
    }
}
