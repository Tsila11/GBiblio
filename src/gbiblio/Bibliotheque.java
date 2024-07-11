/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gbiblio;

/**
 *
 * @author TSUL'S
 */
import java.util.ArrayList;
public class Bibliotheque {
    private ArrayList<Livre> livres;
public Bibliotheque()
{
    livres=new ArrayList<>();
}
public void ajouterLivre(Livre livre)
{
    livres.add(livre);
}
public Livre rechercheLivreParTitre(String titre)
{
    for(Livre livre : livres)
    {
        if(livre.getTitre().equalsIgnoreCase(titre)){
            return livre;
        }
    }
    return null;
}
public void listeLivres()
{
if(livres.isEmpty()){
System.out.println("La bibliotheque est vide");


}else
{
    for(Livre livre : livres)
    {
        System.out.println(livre);
        }
      }
    }
}
    
    

