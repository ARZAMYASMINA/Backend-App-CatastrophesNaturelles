package a.fstt.catastrophes_naturelles.Controller;

import a.fstt.catastrophes_naturelles.Services.logistiqueService;
import a.fstt.catastrophes_naturelles.persistence.Logistique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/logistique")
public class LogistiqueController {

    @Autowired
    private logistiqueService logistiqueService;

    @GetMapping("/add")
    public String addLogistiqueForm(Model model) {
        model.addAttribute("logistique", new Logistique());
        return "addLogistique";
    }

    @PostMapping("/save")
    public String saveLogistique(Logistique logistique) {
        logistiqueService.saveLogistique(logistique);
        return "redirect:/logistique/all";
    }

    @GetMapping("/all")
    public String listLogistiques(Model model) {
        List<Logistique> logistiqueList = logistiqueService.getAllLogistique();
        model.addAttribute("listLogistiques", logistiqueList);
        return "listLogistiques";
    }

    @GetMapping("/delete/{id}")
    public String deleteLogistique(Model model, @PathVariable(value = "id") Long id) {
        logistiqueService.deleteLogistique(id);
        return "redirect:/logistique/all";
    }

    @GetMapping("/update/{id}")
    public String updateLogistiqueForm(Model model, @PathVariable(value = "id") Long id) {
        Logistique logistique = logistiqueService.getOneLogistique(id);
        model.addAttribute("logistique", logistique);
        return "addLogistique";
    }
}
