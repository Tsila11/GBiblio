/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package gbiblio;

/**
 *
 * @author TSUL'S
 */
import java.util.Scanner;
public class GestionBibliorheque {

    public static void main(String[] args) {
       
        Scanner scanner=new Scanner(System.in);
        Bibliotheque bibliotheque=new Bibliotheque();
        boolean quitter=false;
        
        while(!quitter)
        {
            System.out.println("-------------------------Gestion BIBLIOTHEQUE-------------------------------- \n");
            System.out.println("1. Ajouter un livre \n");
            System.out.println("2. Rechercher un livre par titre \n");
            System.out.println("3. Lister tous les livres \n");
            System.out.println("4. Quitter \n");
            int choix=scanner.nextInt();
            scanner.nextLine();
            
            switch(choix)
            {
                case 1:
                    System.out.println("Titre : ");
                      String titre=scanner.nextLine();
                    System.out.println("Auteur : ");
                      String auteur=scanner.nextLine();
                    System.out.println("TSU : ");
                      String tsu=scanner.nextLine();
                      Livre livre=new Livre(titre,auteur,tsu);
                      bibliotheque.ajouterLivre(livre);
                      System.out.println("Livre bien ajoute avec succes. Merci a vous!!!");
                      break;
                case 2 :
                    System.out.println("Titre du livre a rechercher : ");
                    String titreRecherche=scanner.nextLine();
                    Livre livreTrouve=bibliotheque.rechercheLivreParTitre(titreRecherche);
                    if(livreTrouve!=null)
                    {
                        System.out.println("Livre trouve : "+livreTrouve);
                    }else
                    {
                        System.out.println("Livre non retrouve");
                    }
                    break;
                case 3:
                    System.out.println("Liste des livres : ");
                    bibliotheque.listeLivres();
                    break;
                case 4:
                    quitter=true;
                    System.out.println("A la prochaine");
                    break;
                default:
                    System.out.println("Option invalide.Veuillez reessayer");
            }
        }scanner.close();
    }
    
}
