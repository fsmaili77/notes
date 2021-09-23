package com.gestionnaire.notes;

import com.gestionnaire.notes.dao.EtudiantRepository;
import com.gestionnaire.notes.dao.MatiereRepository;
import com.gestionnaire.notes.entities.Etudiant;
import com.gestionnaire.notes.entities.Marks;
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
		/*EtudiantRepository etudiantRepository =
				ctx.getBean(EtudiantRepository.class);
		MatiereRepository matiereRepository = ctx.getBean(MatiereRepository.class);
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

		Page<Etudiant> etds = etudiantRepository.chercherEtudiants("%d%", PageRequest.of(0, 3));
		etds.forEach(e-> System.out.println(e.getNom()));

		matiereRepository.save( new Matiere("SVT", 16));
		matiereRepository.save( new Matiere("Anglais", 12));
		matiereRepository.save( new Matiere("Mathematiques", 19));
		matiereRepository.save( new Matiere("Francais", 14));
		Page<Matiere> matiereList = matiereRepository.chercherMatieres("%a%", PageRequest.of(0, 5));
		matiereList.forEach(m-> System.out.println(m.getNomMatiere()));*/

		Matiere matiere1 = new Matiere();
		matiere1.setIdMatiere(1L);
		matiere1.getIdMatiere();
		matiere1.setNomMatiere("Français");
		matiere1.getNomMatiere();
		matiere1.setNoteMatiere(14);
		matiere1.getNoteMatiere();

		Matiere matiere2 = new Matiere();

		matiere2.setIdMatiere(2L);
		matiere2.getIdMatiere();
		matiere2.setNomMatiere("Mathematiques");
		matiere2.getNomMatiere();
		matiere2.setNoteMatiere(18);
		matiere2.getNoteMatiere();


		System.out.println();
		System.out.println(matiere1);
		System.out.println(matiere2);
		System.out.println("Moyenne = "+(matiere1.getNoteMatiere()+ matiere2.getNoteMatiere())/2);

        Marks[] e1 = new Marks[8];
        for (int i=0; i<2; i++) {
            System.out.println("Enter the data of student with id:");
            e1[i] = new Marks();
            e1[i].getDetails();
            e1[i].printAverage();
        }
        /*System.out.println("Roll number details");
        for(int i=0; i<2; i++){
            e1[i].printRollNum();
        }*/


	}

	}

