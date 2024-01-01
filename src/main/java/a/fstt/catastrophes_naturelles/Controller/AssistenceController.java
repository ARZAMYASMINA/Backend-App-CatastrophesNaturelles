package a.fstt.catastrophes_naturelles.Controller;

import a.fstt.catastrophes_naturelles.Services.assistenceService;
import a.fstt.catastrophes_naturelles.Services.besoinService;
import a.fstt.catastrophes_naturelles.persistence.assistence;
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
@RequestMapping("/assistence")
public class AssistenceController {

    @Autowired
    private assistenceService assistenceService;

    @Autowired
    private besoinService besoinService;

    @GetMapping("/add")
    public String addAssistenceForm(Model model) {
        model.addAttribute("assistence", new assistence());
        model.addAttribute("besoins", besoinService.getAllBesoin()); // Récupérer la liste des besoins
        return "addAssistence";
    }

    @PostMapping("/save")
    public String saveAssistence(assistence assistence) {
        assistenceService.saveassistence(assistence);
        return "redirect:/assistence/all";
    }

    @GetMapping("/all")
    public String listAssistences(Model model) {
        List<assistence> assistenceList = assistenceService.getAllassistence();
        model.addAttribute("listAssistences", assistenceList);
        return "listAssistences";
    }

    @GetMapping("/delete/{id}")
    public String deleteAssistence(Model model, @PathVariable(value = "id") Long id) {
        assistenceService.deleteAssistence(id);
        return "redirect:/assistence/all";
    }

    @GetMapping("/update/{id}")
    public String updateAssistenceForm(Model model, @PathVariable(value = "id") Long id) {
        assistence assistence = assistenceService.getOneAssistence(id);
        model.addAttribute("assistence", assistence);
        model.addAttribute("besoins", besoinService.getAllBesoin()); // Récupérer la liste des besoins
        return "addAssistence";
    }
}
