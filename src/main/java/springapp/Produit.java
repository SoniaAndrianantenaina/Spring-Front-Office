package springapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import springapp.dba.*;

public class Produit {
    Integer id;
    int typeProduit;
    String description;
    Float prixMin;
    int idProprio;
    String statut;

    public Produit() {
    }


    public Produit(Integer id, int typeProduit, String description, Float prixMin, int idProprio, String statut) {
        this.id = id;
        this.typeProduit = typeProduit;
        this.description = description;
        this.prixMin = prixMin;
        this.idProprio = idProprio;
        this.statut = statut;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTypeProduit() {
        return this.typeProduit;
    }

    public void setTypeProduit(int typeProduit) {
        this.typeProduit = typeProduit;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrixMin() {
        return this.prixMin;
    }

    public void setPrixMin(Float prixMin) {
        this.prixMin = prixMin;
    }

    public int getIdProprio() {
        return this.idProprio;
    }

    public void setIdProprio(int idProprio) {
        this.idProprio = idProprio;
    }

    public String getStatut() {
        return this.statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Produit id(Integer id) {
        setId(id);
        return this;
    }

    public Produit typeProduit(int typeProduit) {
        setTypeProduit(typeProduit);
        return this;
    }

    public Produit description(String description) {
        setDescription(description);
        return this;
    }

    public Produit prixMin(Float prixMin) {
        setPrixMin(prixMin);
        return this;
    }

    public Produit idProprio(int idProprio) {
        setIdProprio(idProprio);
        return this;
    }

    public Produit statut(String statut) {
        setStatut(statut);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", typeProduit='" + getTypeProduit() + "'" +
            ", description='" + getDescription() + "'" +
            ", prixMin='" + getPrixMin() + "'" +
            ", idProprio='" + getIdProprio() + "'" +
            ", statut='" + getStatut() + "'" +
            "}";
    }
    

    public ArrayList<Produit> getListMyEncheres(int idProprio) throws Exception {
        ArrayList<Produit> liste = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "";
        try {
            con = DBAConnection.connect();
            sql = "select * from v_listmyencheres where idproprietaire = ?";
         
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, idProprio);
            rs = ps.executeQuery();
            while (rs.next()) {
               Produit p = new Produit();
                p.setId(rs.getInt("id"));
                p.setTypeProduit(rs.getInt("idtypeproduit"));
                p.setDescription(rs.getString("descriptions"));
                p.setPrixMin(rs.getFloat("prixminimum"));
                p.setIdProprio(rs.getInt("idproprietaire"));
                p.setStatut(rs.getString("case"));
                liste.add(p);
            }
        } catch (Exception e) {
            throw e;
        }finally{
            rs.close();
            ps.close();
            con.close();
        }
        return liste;
    }

}
