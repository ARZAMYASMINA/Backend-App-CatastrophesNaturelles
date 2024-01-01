package a.fstt.catastrophes_naturelles.Controller;

import a.fstt.catastrophes_naturelles.Services.aideService;
import a.fstt.catastrophes_naturelles.persistence.Aide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/aide")
public class AideController {

    @Autowired
    private aideService aideService;

    @GetMapping("/add")
    public String addAideForm(Model model) {
        model.addAttribute("aide", new Aide());
        return "addAide";
    }

    @PostMapping("/save")
    public String saveAide(Aide aide) {
        aideService.saveAide(aide);
        return "redirect:/aide/all";
    }

    @GetMapping("/all")
    public String listAides(Model model) {
        List<Aide> aideList = aideService.getAllAide();
        model.addAttribute("listAides", aideList);
        return "listAides";
    }

    @GetMapping("/delete/{id}")
    public String deleteAide(Model model, @PathVariable(value = "id") Long id) {
        aideService.deleteAide(id);
        return "redirect:/aide/all";
    }

    @GetMapping("/update/{id}")
    public String updateAideForm(Model model, @PathVariable(value = "id") Long id) {
        Aide aide = aideService.getOneAide(id);
        model.addAttribute("aide", aide);
        return "addAide";
    }
}
