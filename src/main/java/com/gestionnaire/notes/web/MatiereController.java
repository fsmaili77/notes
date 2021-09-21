package com.gestionnaire.notes.web;

import com.gestionnaire.notes.dao.MatiereRepository;
import com.gestionnaire.notes.entities.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/Matiere")
public class MatiereController {

    @Autowired
    private MatiereRepository matiereRepository;

    @RequestMapping(value = "/Index")
    public String Index(Model model){
        List<Matiere> matiereList=matiereRepository.findAll();
        model.addAttribute("templateBulletin", matiereList);
        return "templateBulletin";
    }


}
