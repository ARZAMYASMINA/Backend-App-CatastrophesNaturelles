package a.fstt.catastrophes_naturelles.Controller;

import a.fstt.catastrophes_naturelles.Services.volontariatService;
import a.fstt.catastrophes_naturelles.persistence.Volontariat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/volontariat")
public class VolontariatController {

    @Autowired
    private volontariatService volontariatService;

    @GetMapping("/add")
    public String addVolontariatForm(Model model) {
        model.addAttribute("volontariat", new Volontariat());
        return "addVolontariat";
    }

    @PostMapping("/save")
    public String saveVolontariat(Volontariat volontariat) {
        volontariatService.saveVolontariat(volontariat);
        return "redirect:/volontariat/all";
    }

    @GetMapping("/all")
    public String listVolontariats(Model model) {
        List<Volontariat> volontariatList = volontariatService.getAllVolontariat();
        model.addAttribute("listVolontariats", volontariatList);
        return "listVolontariats";
    }

    @GetMapping("/delete/{id}")
    public String deleteVolontariat(Model model, @PathVariable(value = "id") Long id) {
        volontariatService.deleteVolontariat(id);
        return "redirect:/volontariat/all";
    }

    @GetMapping("/update/{id}")
    public String updateVolontariatForm(Model model, @PathVariable(value = "id") Long id) {
        Volontariat volontariat = volontariatService.getOneVolontariat(id);
        model.addAttribute("volontariat", volontariat);
        return "addVolontariat";
    }
}
