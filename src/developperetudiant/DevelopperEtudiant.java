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
public class DevelopperEtudiant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EtudiantExisteException {
        // TODO code application logic here
      Etudiant3eme Etu1=new Etudiant3eme(5551,"Ahmed", "oueslati", 15.5f, "sience");
      Etudiant3eme Etu2=new Etudiant3eme(5551,"Ah", "jbeli", 15.5f, "sience");
         System.out.println(Etu1);
         System.out.println(Etu2);

      EtudiantAlternance Al=new EtudiantAlternance(55874,"nawres", "oueslati", 16.5f,1200);
       System.out.println(Al);
  // Al.toString();
       

       Ecole e1=new Ecole("chekir");
       Ecole e2=new Ecole("labib");
         

          e1.ajouterEtudiant(Al);
          e1.ajouterEtudiant(Etu2);
        //  e1.ajouterEtudiant(Etu1);
          
     e1.changerEcole(Etu2, e2);

        System.out.println(e1.toString());
         // System.out.println(e2);
         e1.changerEcole(Etu2, e2);

        Etu1.ajouterUneAbsence();
        Al.ajouterUneAbsence();
        e1.suprimerEtu(Al);
        
         System.out.println(e1.getMoyenneDes3A());
         System.out.println(e1.moyenneSalaireAlternants());
            System.out.println(e1);    
            System.out.println(e2);    

       
    }
    
}
