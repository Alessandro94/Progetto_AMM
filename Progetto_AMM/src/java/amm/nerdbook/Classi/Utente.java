
package amm.nerdbook.Classi;


public class Utente {

    private int id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String urlFotoProfilo;

    public Utente() {
        id = 0;
        nome = "";
        cognome = "";
        email = "";
        password = "";
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCognome() {
        return cognome;
    }


    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public boolean equals(Object altroUtente) {
        if (altroUtente instanceof Utente)
            if (this.getId() == ((Utente)altroUtente).getId()) return true;
        return false;
    }


    public String getUrlFotoProfilo() {
        return urlFotoProfilo;
    }


    public void setUrlFotoProfilo(String urlFotoProfilo) {
        this.urlFotoProfilo = urlFotoProfilo;
    }
}
