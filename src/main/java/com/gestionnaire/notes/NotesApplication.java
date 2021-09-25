package com.gestionnaire.notes;

import com.gestionnaire.notes.dao.EtudiantRepository;
import com.gestionnaire.notes.dao.MatiereRepository;
import com.gestionnaire.notes.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

@SpringBootApplication
public class NotesApplication  {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = SpringApplication.run(NotesApplication.class, args);
		EtudiantRepository etudiantRepository =
				ctx.getBean(EtudiantRepository.class);
		/*MatiereRepository matiereRepository = ctx.getBean(MatiereRepository.class);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		etudiantRepository.save(
				new Etudiant("Mbappé", "Kylian", df.parse("1988-11-10"),
						"kylian@gmail.com"));
		etudiantRepository.save(
				new Etudiant("Griezman", "Antoine", df.parse("1988-11-10"),
						"antoine@gmail.com"));
		etudiantRepository.save(
				new Etudiant("Benzema", "Karim", df.parse("1988-11-10"),
						"karim@gmail.com"));

		Page<Etudiant> etds = etudiantRepository.chercherEtudiants("%d%", PageRequest.of(0, 3));
		etds.forEach(e-> System.out.println(e.getNom()));

		matiereRepository.save( new Matiere("SVT", 16));
		matiereRepository.save( new Matiere("Anglais", 12));
		matiereRepository.save( new Matiere("Mathematiques", 19));
		matiereRepository.save( new Matiere("Francais", 14));
		Page<Matiere> matiereList = matiereRepository.chercherMatieres("%a%", PageRequest.of(0, 5));
		matiereList.forEach(m-> System.out.println(m.getNomMatiere()));*/

        System.out.println();
        System.out.println("Matières------------------------------------Notes-----------------------------");
        System.out.println("____________________________________écrit_|_oral_|_moyenne__|___moyenne classe");

        Notes notesGenerale = new Notes();
        Notes francais = new Notes();
        francais.setNoteEcrit(18);
        francais.getNoteEcrit();
        francais.setNoteOral(19);
        francais.getNoteOral();

        Notes anglais = new Notes();
        anglais.setNoteEcrit(12);
        anglais.getNoteEcrit();
        anglais.setNoteOral(14);
        anglais.getNoteOral();

        Notes math = new Notes();
        math.setNoteEcrit(15);
        math.getNoteEcrit();
        math.setNoteOral(17);
        math.getNoteOral();

        Notes ephs = new Notes();
        ephs.setNoteEcrit(12);
        ephs.getNoteEcrit();
        ephs.setNoteOral(10);
        ephs.getNoteOral();





        /*notes.afficherResultatNotes();
        System.out.println(notes.afficherMoyenneMatiere());*/

        Sujets sujets = new Sujets();
        System.out.println(sujets.getNomSujets()[0]+ "_____________________________" + francais.getNoteEcrit() + "___|__"+ francais.getNoteOral()+"__|__"+ francais.afficherMoyenneMatiere());
        System.out.println(sujets.getNomSujets()[1]+ "______________________________" + anglais.getNoteEcrit() + "___|__"+ anglais.getNoteOral()+"__|__"+ anglais.afficherMoyenneMatiere());
        System.out.println(sujets.getNomSujets()[2]+ "_________________________________" + math.getNoteEcrit() + "___|__"+ math.getNoteOral()+"__|__"+ math.afficherMoyenneMatiere());
        System.out.println(sujets.getNomSujets()[8]+ "_______" + ephs.getNoteEcrit() +"___|__"+ ephs.getNoteOral()+"__|__"+ ephs.afficherMoyenneMatiere());
        //System.out.println(sujets.getNomSujets().length);
        System.out.println("------------------------------------------------------------------------------");
        //System.out.println("Moyenne generale"+ sujets.moyenne());

       /* System.out.println(sujets.getNomSujets()[1]+ "..................."+ anglais.getNoteMatiere());
        System.out.println(sujets.getNomSujets()[0]+ ".................."+ francais.getNoteMatiere());*/


       /* Matiere francais = new Matiere();
        francais.setNomMatiere("Français-----");
        francais.getNomMatiere();
        francais.setNoteMatiere(14);
        francais.getNoteMatiere();
        francais.afficherResultat();

        Matiere anglais = new Matiere();
        anglais.setNomMatiere("Anglais------");
        anglais.getNomMatiere();
        anglais.setNoteMatiere(14);
        anglais.getNoteMatiere();
        anglais.afficherResultat();


		Matiere math = new Matiere();
        math.setNomMatiere("Mathematiques");
        math.getNomMatiere();
        math.setNoteMatiere(18);
        math.getNoteMatiere();
        math.afficherResultat();*/

        System.out.println("-------------------------------");
		/*System.out.println("Moyenne = "+(francais.getNoteMatiere()+ math.getNoteMatiere()+ anglais.getNoteMatiere())/3);

        Sujets sujets = new Sujets();
        //sujets.getNomSujets();
        System.out.println("Note d'un étudiant par matières:");
        System.out.println("Sujet: ...................Note:");
        System.out.println("_______________________________");
        System.out.println(sujets.getNomSujets()[2]+ "......................"+ math.getNoteMatiere());
        System.out.println(sujets.getNomSujets()[1]+ "..................."+ anglais.getNoteMatiere());
        System.out.println(sujets.getNomSujets()[0]+ ".................."+ francais.getNoteMatiere());
        System.out.println("_______________________________");
        System.out.println("Moyenne Etudiant par Matière:");
        //System.out.println(Arrays.toString(new String[]{sujets.getNomSujets()[1]}));
        sujets.afficherResultat();
        System.out.println(sujets);*/



       /* Marks[] e1 = new Marks[8];
        for (int i=0; i<2; i++) {
            System.out.println("Enter the data of student with id:");
            e1[i] = new Marks();
            e1[i].getDetails();
            e1[i].printAverage();
        }*/

	}

	}

