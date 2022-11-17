package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.service.VetService;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
	super();
	this.vetService = vetService;
    }

    @RequestMapping({ "/vets", "vets/index", "/vets/index.html" })
    public String listvets(Model model) {

	model.addAttribute("vets", vetService.findAll());

	return "vets/index";
    }
}
