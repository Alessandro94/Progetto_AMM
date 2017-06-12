/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

import java.util.ArrayList;

/**
 *
 * @author Tutor_IUM
 */
public class Utente_registrato {

    //Pattern Design Singleton
    private static Utente_registrato singleton;

    public static Utente_registrato getInstance() {
        if (singleton == null) {
            singleton = new Utente_registrato();
        }
        return singleton;
    }

    private ArrayList<Utente> listaUtenti = new ArrayList<Utente>();

    private Utente_registrato() {
        //Creazione utenti

        //Utente1
        Utente Utente1 = new Utente();
        Utente1.setId(0);
        Utente1.setNome("ale");
        Utente1.setCognome("Satta");
        Utente1.setEmail("moneysniper@gmail.com");
        Utente1.setPassword("123");
        Utente1.setUrlFotoProfilo("img/fotoprof.jpg");

        //Utente2
        Utente Utente2  = new Utente();
        Utente2.setId(1);
        Utente2.setNome("allen");
        Utente2.setCognome("iverson");
        Utente2.setEmail("gang@gmail.com");
        Utente2.setPassword("123");
        Utente2.setUrlFotoProfilo("img/iverson.jpeg");

        //Utente3
        Utente Utente3 = new Utente();
        Utente3.setId(2);
        Utente3.setNome("jay");
        Utente3.setCognome("z");
        Utente3.setEmail("gang@gmail.com");
        Utente3.setPassword("123");
        Utente3.setUrlFotoProfilo("img/jayz.jpeg");

        listaUtenti.add(Utente1);
        listaUtenti.add(Utente2);
        listaUtenti.add(Utente3);

    }

    public Utente getUtenteById(int id) {
        for (Utente nome : this.listaUtenti) {
            if (nome.getId() == id) {
                return nome;
            }
        }
        return null;
    }
    
    public int getIdByUserAndPassword(String user, String password){
        for(Utente nome : this.listaUtenti){
            if(nome.getNome().equals(user) && nome.getPassword().equals(password)){
                return nome.getId();
            }
        }
        return -1;
    }
}
