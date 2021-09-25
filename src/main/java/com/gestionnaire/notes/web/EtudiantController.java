package com.gestionnaire.notes.web;

import com.gestionnaire.notes.dao.EtudiantRepository;
import com.gestionnaire.notes.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/Etudiant")
public class EtudiantController {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @RequestMapping(value = "/Index")
    public String Index(Model model,
                        @RequestParam(name = "page", defaultValue = "0")int p,
                        @RequestParam(name = "motCle", defaultValue = "") String mc){
        Page<Etudiant> pageEtudiants=etudiantRepository.chercherEtudiants("%"+mc+"%", PageRequest.of(p, 10));
        int pagesCount = pageEtudiants.getTotalPages();

        int[] pages = new int[pagesCount];
        for (int i=0; i<pagesCount; i++) pages[i]=i;
        model.addAttribute("pages", pages);
        model.addAttribute("pageEtudiants", pageEtudiants);
        model.addAttribute("pageCourrante", p);
        model.addAttribute("motCle", mc);

        return "etudiants";

    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String formEtudiant(Model model){
        model.addAttribute("etudiant", new Etudiant());
        return "FormEtudiant";
    }
    @RequestMapping(value = "/SaveEtudiant", method = RequestMethod.POST)
    public String save(@Valid Etudiant et, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "FormEtudiant";
        }
        etudiantRepository.save(et);
        return "redirect:Index";
    }
    @RequestMapping(value = "/supprimer")
    public String supprimer(Long id){
        etudiantRepository.delete(etudiantRepository.getById(id));
        return "redirect:Index";
    }
    @RequestMapping(value = "/edit")
    public String edit(Long id, Model model){
        Etudiant et = etudiantRepository.getById(id);
        model.addAttribute("etudiant", et);
        return "EditEtudiant";
    }

}
