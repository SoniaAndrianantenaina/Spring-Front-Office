package springapp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import springapp.dba.DBAConnection;

public class Client {
    Integer idClient;
    String nom;
    String prenom;
    String mdp;
    String email;
    float budget;
    float offre;
    int demande;
    int idProduit;
    String nomProduit;
    Date datet;

    public Client() {
    }

    public Client(Integer idClient, String nom, String prenom, String mdp, String email, float budget, float offre,
            int demande, int idProduit, String nomProduit) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.email = email;
        this.budget = budget;
        this.offre = offre;
        this.demande = demande;
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
    }

    public Client(String mdp, String email) {
        this.mdp = mdp;
        this.email = email;

    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public float getOffre() {
        return offre;
    }

    public void setOffre(float offre) {
        this.offre = offre;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public Date getDatet() {
        return datet;
    }

    public void setDatet(Date datet) {
        this.datet = datet;
    }

    public Integer getIdClient() {
        return this.idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMdp() {
        return this.mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getBudget() {
        return this.budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public int getDemande() {
        return this.demande;
    }

    public void setDemande(int demande) {
        this.demande = demande;
    }

    public Client idClient(int idClient) {
        setIdClient(idClient);
        return this;
    }

    public Client nom(String nom) {
        setNom(nom);
        return this;
    }

    public Client prenom(String prenom) {
        setPrenom(prenom);
        return this;
    }

    public Client mdp(String mdp) {
        setMdp(mdp);
        return this;
    }

    public Client email(String email) {
        setEmail(email);
        return this;
    }

    public Client budget(float budget) {
        setBudget(budget);
        return this;
    }

    public Client demande(int demande) {
        setDemande(demande);
        return this;
    }

    @Override
    public String toString() {
        return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", mdp=" + mdp + ", email="
                + email + ", budget=" + budget + ", offre=" + offre + ", demande=" + demande + ", idProduit="
                + idProduit + ", nomProduit=" + nomProduit + ", datet=" + datet + "]";
    }

    public int Login() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int idClient = 0;
        try {
            con = DBAConnection.connect();
            ps = con.prepareStatement("select id from Clients where emailclients = ? and mdpclients = ?");

            ps.setString(1, this.getEmail());
            ps.setString(2, this.getMdp());
            rs = ps.executeQuery();

            while (rs.next()) {
                idClient = rs.getInt("id");
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            rs.close();
            ps.close();
            con.close();
        }
        return idClient;

    }

    public int RechargerCompte(int idClient) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int manova = 0;
        float budget = 0;
        float demandeRechargement = 0;
        try {
            con = DBAConnection.connect();
            ps = con.prepareStatement("select*from clients where id = ?");
            ps.setInt(1, idClient);
            rs = ps.executeQuery();

            while (rs.next()) {
                budget = rs.getFloat("budget");
                demandeRechargement = rs.getInt("demande");
            }
            ps = con.prepareStatement("update clients set budget=?, demande = 0 where id = ? ");
            ps.setFloat(1, budget + demandeRechargement);

            ps.setInt(2, this.getIdClient());

            manova = ps.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw e;
        } finally {
            ps.close();
            con.close();
        }
        return manova;
    }

    public int Inscrisption() throws Exception {
        Connection con = null;
        int mapiditra = 0;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DBAConnection.connect();
            ps = con.prepareStatement(
                    "insert into Clients(nomclients,prenomclients,mdpclients,emailclients, budget) values(?,?,?,?,?)");
            ps.setString(1, this.getNom());
            ps.setString(2, this.getPrenom());
            ps.setString(3, this.getMdp());
            ps.setString(4, this.getEmail());
            ps.setFloat(5, this.getBudget());

            mapiditra = ps.executeUpdate();
        } catch (Exception ex) {
            throw ex;
        } finally {
            con.close();
        }
        return mapiditra;
    }

    public ArrayList<Client> listeEnchereencheri(int idClient) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        // int insert = 0;
        ResultSet rs = null;
        ArrayList<Client> result = new ArrayList<>();
        try {
            con = DBAConnection.connect();
            ps = con.prepareStatement("select  * from v_mesencheres where idClient = ? ");
            ps.setInt(1, idClient);
            rs = ps.executeQuery();
            while (rs.next()) {
                Client c = new Client();
                c.setIdClient(rs.getInt("idClient"));
                c.setDatet(rs.getDate("datet"));
                c.setOffre(rs.getFloat("offre"));
                c.setIdProduit(rs.getInt("idProduit"));
                c.setNomProduit(rs.getString("nomtypep"));
                result.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // rs.close();
            ps.close();
            con.close();
        }
        return result;
    }

    public Integer rencherir() throws Exception{
        Connection con = null;
        PreparedStatement ps = null;
        Integer result = null;
        try {
            if (this.getOffre() <= this.getoffreMax())
                throw new Exception("Offre trop basse");
            con = DBAConnection.connect();
            ps = con.prepareStatement(
                    "insert into enchereproduit(idclient,idproduit,offre, datet, statut) values(?,?,?,?,0)");
            ps.setInt(1, this.getIdClient());
            ps.setInt(2, this.getIdProduit());
            ps.setFloat(3, this.getOffre());
            ps.setDate(4, this.getDatet());

            result = ps.executeUpdate();
        } catch (Exception ex) {
            throw ex;
        } 

        return result;
    }

    public Integer getoffreMax() {
        Connection con = null;
        PreparedStatement ps = null;
        Integer result = null;
        ResultSet rs = null;
        try {
            Client c = new Client();
            con = DBAConnection.connect();
            ps = con.prepareStatement("select prixmax from v_maxoffre where idProduit = ?");
            ps.setInt(1,this.idProduit);
            rs = ps.executeQuery();
            while (rs.next()) {
                result = rs.getInt("prixmax");
            }

        } catch (Exception ex) {

        }
        return result;
    }

}
