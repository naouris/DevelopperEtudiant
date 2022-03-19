/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package developperetudiant;

import java.util.Objects;

/**
 *
 * @author ACER
 */
public abstract  class Etudiant {
    protected int id;
    protected String nom;
    protected String prenom;
    protected float moyenne;
    
     public Etudiant(){}
    public Etudiant(int id ,String nom ,String prenom ,float moyenne){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.moyenne=moyenne;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }

 

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", moyenne=" + moyenne + '}';
    }
    
    
public abstract void ajouterUneAbsence();

  

 
 

   
}
