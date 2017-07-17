
package amm.nerdbook.Classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Utente_registrato {


    private static Utente_registrato singleton;

    public static Utente_registrato getInstance() {
        if (singleton == null) {
            singleton = new Utente_registrato();
        }
        return singleton;
    }
    
    //Gestione DB
    private String connectionString;
    
    public void setConnectionString(String s){
	this.connectionString = s;
    }
    
    public String getConnectionString(){
            return this.connectionString;
    }
    //Fine gestione DB

    private Utente_registrato() {
    }

    public Utente getUtenteById(int id) {

        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "utente", "utente");
            
            String query = 
                      "select * from utenti "
                    + "where utente_id = ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setInt(1, id);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                Utente current = new Utente();
                current.setId(res.getInt("utente_id"));
                current.setNome(res.getString("name"));
                current.setCognome(res.getString("cognome"));
                current.setPassword(res.getString("password"));
                current.setEmail(res.getString("email"));
                current.setUrlFotoProfilo(res.getString("urlFotoProfilo"));

                stmt.close();
                conn.close();
                return current;
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public int getIdByUserAndPassword(String user, String password){
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "utente", "utente");
            
            String query = 
                      "select utente_id from utenti "
                    + "where name = ? and password = ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setString(1, user);
            stmt.setString(2, password);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                int id = res.getInt("utente_id");

                stmt.close();
                conn.close();
                return id;
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public List getUtentiList() {
        List<Utente> listaUtenti = new ArrayList<Utente>();
        
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "utente", "utente");
            
            String query = 
                      "select * from utenti";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {
                Utente current = new Utente();
                current.setId(res.getInt("utente_id"));
                current.setNome(res.getString("name"));
                current.setCognome(res.getString("cognome"));
                current.setPassword(res.getString("password"));
                current.setEmail(res.getString("email"));
                current.setUrlFotoProfilo(res.getString("urlFotoProfilo"));
                
                listaUtenti.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return listaUtenti;
    }
    
    public List getUtentiList(String name) {
        List<Utente> listaUtenti = new ArrayList<Utente>();
        
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "utente", "utente");
            
            String query = 
                      "select * from utenti where nome like ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setString(1, "%" + name + "%");
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {
                Utente current = new Utente();
                current.setId(res.getInt("utente_id"));
                current.setNome(res.getString("name"));
                current.setCognome(res.getString("cognome"));
                current.setPassword(res.getString("password"));
                current.setEmail(res.getString("email"));
                current.setUrlFotoProfilo(res.getString("urlFotoProfilo"));
                
                listaUtenti.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return listaUtenti;
    }
    
}
