
package developperetudiant;

//import com.oracle.webservices.internal.api.databinding.DatabindingModeFeature;

/**
 *
 * @author ACER
 */
public class Ecole {
    private String nom;
    public int nbEtudiant=0;
public Etudiant E[]=new Etudiant [500];
public float a=0;
    public float w=0;

public Ecole(String nom){
    this.nom=nom;
}
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
      public int RechercherEtudiant (Etudiant e){
        for (int i = 0; i <nbEtudiant; i++) {
            if (E[i].equals(e))
               return 1;  
        }
               return -1;       
    }   
            public boolean chercherEtudiant (Etudiant e){
                  for (int i = 0; i <nbEtudiant; i++) {
                      if(E[i].equals(e)){
                          return true;
                      }
                  }
                  return false;
            }

    public void ajouterEtudiant(Etudiant Et) throws EtudiantExisteException{
        
           if ((nbEtudiant<500)&&(!this.chercherEtudiant(Et))){
            E[nbEtudiant] = Et;
            nbEtudiant++;
           
           }
            else {
      throw new  EtudiantExisteException("deja exister");
                    }
    }
               
      
                
            
     
  

   public float getMoyenneDes3A(){
       float x=0;
       int k=0;
               
       for (int i = 0; i < nbEtudiant; i++) {
           
           if (E[i] instanceof Etudiant3eme){  
                  // Etudiant3eme e=(Etudiant3eme)E[i];
           x+=E[i].moyenne;
           k++;
       }
   }
      return a=x/k;
      
   }
   
   public float moyenneSalaireAlternants(){
       float y=0;
       int k=0;
               
       for (int i = 0; i < nbEtudiant; i++) {
           
           if (E[i] instanceof EtudiantAlternance){  
                  
           y+=((EtudiantAlternance)E[i]).getSalaire();
           k++;
       }
   }
     return w=y/k;
      
   }
   
   public void suprimerEtu(Etudiant e){
    
   int pos=RechercherEtudiant(e);
        if(pos!=-1){
            for(int i=pos;i<nbEtudiant-1;i++){
                E[i]=E[i+1];
            }
            nbEtudiant--;
        }
   }
public void changerEcole(Etudiant etd, Ecole e) throws EtudiantExisteException{
    
    suprimerEtu(etd);
    ajouterEtudiant(etd);
}
        


    @Override
    public String toString() {
        String s=" ";
        for (int i = 0; i < nbEtudiant; i++) {
            s+=E[i].toString();
        }
return "Ecole{" + "nom=" + nom + ", nbEtudiant=" + nbEtudiant + ", E=" + s + ", Moyenne_Des_3A=" + a + ",  moyenne_Salaire_Alternants=" + w + '}';    }


    }


