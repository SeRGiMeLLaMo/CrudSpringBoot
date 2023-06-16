package com.sergio.CrudSpringBoot.controler;



import com.sergio.CrudSpringBoot.interfaceService.IpersonaService;
import com.sergio.CrudSpringBoot.modelo.Persona;
import com.sergio.CrudSpringBoot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private PersonaService service;

    public Controlador(PersonaService service) {
        this.service = service;
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Persona>personas=service.listar();
        model.addAttribute("personas", personas);
        return "index";

    }



    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("persona", new Persona());
        return "form";
    }
    @PostMapping("/save")
    public RedirectView save(Persona p, Model model) {
        service.save(p);
        return new RedirectView("/listar");
    }






    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        Optional<Persona> persona=service.listarId(id);
        model.addAttribute ("persona", persona);

     return "form";
  }


    @GetMapping("/eliminar/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);

        return "redirect:/listar";
    }



}
