/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gbiblio;

/**
 *
 * @author TSUL'S
 */
public class Livre {
   private String titre;
   private String auteur;
   private String tsu;
   public Livre(String Titre,String Auteur,String Tsu)
   {
       this.titre=Titre;
       this.auteur=Auteur;
       this.tsu=Tsu;
   }
   public String getTitre()
   {
       return titre;
   }
   public String getAuteur()
   {
       return auteur;
   }
   public String getTsu()
   {
       return tsu;
   }
   @Override
   public String toString()
   {
       return "[TITRE] --> "+titre+"\n"+"[AUTEUR ] ---> "+auteur+"\n"+"[TSU] ---> "+tsu;
   }
}
