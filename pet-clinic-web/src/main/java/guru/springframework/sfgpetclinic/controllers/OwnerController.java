package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.service.OwnerService;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
	super();
	this.ownerService = ownerService;
    }

    @RequestMapping({ "/owners", "/owners/", "/owners/index", "/owners/index.html" })
    public String listOwners(Model model) {

	model.addAttribute("owners", ownerService.findAll());

	return "owners/index";
    }

}