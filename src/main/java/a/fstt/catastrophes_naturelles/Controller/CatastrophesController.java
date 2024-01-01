package a.fstt.catastrophes_naturelles.Controller;

import a.fstt.catastrophes_naturelles.Services.catastrophesService;
import a.fstt.catastrophes_naturelles.persistence.catastrophes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/catastrophes")
public class CatastrophesController {

    @Autowired
    private catastrophesService catastrophesService;

    @GetMapping("/add")
    public String addCatastropheForm(Model model) {
        model.addAttribute("catastrophe", new catastrophes());
        return "addCatastrophe";
    }

    @PostMapping("/save")
    public String saveCatastrophe(catastrophes catastrophes) {
        catastrophesService.saveCatastrophe(catastrophes);
        return "redirect:/catastrophes/all";
    }

    @GetMapping("/all")
    public String listCatastrophes(Model model) {
        List<catastrophes> catastropheList = catastrophesService.getAllCatastrophe();
        model.addAttribute("listCatastrophes", catastropheList);
        return "listCatastrophes";
    }

    @GetMapping("/delete/{id}")
    public String deleteCatastrophe(Model model, @PathVariable(value = "id") Long id) {
        catastrophesService.deleteCatastrophe(id);
        return "redirect:/catastrophes/all";
    }

    @GetMapping("/update/{id}")
    public String updateCatastropheForm(Model model, @PathVariable(value = "id") Long id) {
        catastrophes catastrophe = catastrophesService.getOneCatastrophe(id);
        model.addAttribute("catastrophe", catastrophe);
        return "addCatastrophe";
    }
}
