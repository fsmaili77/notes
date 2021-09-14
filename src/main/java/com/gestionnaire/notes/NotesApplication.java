package com.gestionnaire.notes;

import com.gestionnaire.notes.dao.EtudiantRepository;
import com.gestionnaire.notes.entities.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class NotesApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = SpringApplication.run(NotesApplication.class, args);
		EtudiantRepository etudiantRepository =
				ctx.getBean(EtudiantRepository.class);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		etudiantRepository.save(
				new Etudiant("Ahmed", "Med", df.parse("1988-11-10"),
						"ahmed@gmail.com"));
		etudiantRepository.save(
				new Etudiant("Muhamed", "Med", df.parse("1988-11-10"),
						"med@gmail.com"));
		etudiantRepository.save(
				new Etudiant("Ibrahim", "Med", df.parse("1988-11-10"),
						"ibrahim@gmail.com"));

		Page<Etudiant> etds = etudiantRepository.chercherEtudiantsNom("%d%", PageRequest.of(0, 3));
		etds.forEach(e-> System.out.println(e.getNom()));
	}

}
