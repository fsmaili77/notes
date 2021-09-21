package com.gestionnaire.notes;

import com.gestionnaire.notes.dao.EtudiantRepository;
import com.gestionnaire.notes.dao.MatiereRepository;
import com.gestionnaire.notes.entities.Matiere;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class NotesApplication  {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = SpringApplication.run(NotesApplication.class, args);
		EtudiantRepository etudiantRepository =
				ctx.getBean(EtudiantRepository.class);
		MatiereRepository matiereRepository = ctx.getBean(MatiereRepository.class);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		/*etudiantRepository.save(
				new Etudiant("Ahmed", "Med", df.parse("1988-11-10"),
						"ahmed@gmail.com"));
		etudiantRepository.save(
				new Etudiant("Muhamed", "Med", df.parse("1988-11-10"),
						"med@gmail.com"));
		etudiantRepository.save(
				new Etudiant("Ibrahim", "Med", df.parse("1988-11-10"),
						"ibrahim@gmail.com"));

		Page<Etudiant> etds = etudiantRepository.chercherEtudiants("%d%", PageRequest.of(0, 3));
		etds.forEach(e-> System.out.println(e.getNom()));*/

		matiereRepository.save( new Matiere("SVT"));
		matiereRepository.save( new Matiere("Anglais"));
		matiereRepository.save( new Matiere("Mathematiques"));
		matiereRepository.save( new Matiere("Francais"));
		Page<Matiere> matiereList = matiereRepository.chercherMatieres("%a%", PageRequest.of(0, 2));
		matiereList.forEach(m-> System.out.println(m.getNomMatiere()));
	}





	}

