/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package developperetudiant;

/**
 *
 * @author ACER
 */
public class EtudiantAlternance extends Etudiant{
    private int salaire;
   public EtudiantAlternance(){} 
public EtudiantAlternance(int id ,String nom ,String prenom ,float moyenne,int salaire){
        super(id,nom,prenom,moyenne);
        this.salaire=salaire;
}
    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void ajouterUneAbsence() {
        salaire=salaire-50;
         System.out.println("il ya une absence d'etudiantAlternance: salaire= "+salaire);
        }

    @Override
    public  String toString() {
        return super.toString()+"EtudiantAlternance{" + "salaire=" + salaire + '}';
    }
    
  
}
