package com.gestionnaire.notes.web;

import com.gestionnaire.notes.dao.EtudiantRepository;
import com.gestionnaire.notes.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/Etudiant")
public class EtudiantController {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @RequestMapping(value = "/Index")
    public String Index(Model model){
        List<Etudiant> etds=etudiantRepository.findAll();
        model.addAttribute("etudiants", etds);
        return "etudiants";

    }

}
