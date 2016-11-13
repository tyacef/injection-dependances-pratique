package fr.mrmint;

/**
 * Created by Younes on 13/11/2016.
 */
public class Injected {
    private Etudiant etudiant;

    public String sayHello(){
        return "Hello " + etudiant.getNomEtudiant();
    }


    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}
