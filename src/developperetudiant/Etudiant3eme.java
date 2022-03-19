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
public class Etudiant3eme extends Etudiant{
    private String branche;

    public Etudiant3eme(){}
    public Etudiant3eme(int id ,String nom ,String prenom ,float moyenne,String branche){
        super(id,nom,prenom,moyenne);
        this.branche=branche;
    }
    
   
    @Override
    public void ajouterUneAbsence(){
        moyenne-=0.5f; 
        System.out.println("il ya une absence Etudant3eme: moyenne= "+moyenne); 
    }

    @Override
    public String toString() {
        return super.toString()+"Etudiant3eme{" + "branche=" + branche + '}';
    }
    
    
}
