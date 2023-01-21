package springapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import springapp.dba.DBAConnection;

public class EncheresProduits {
    int idclient;
    Float Offre;
    Date date;
    Produit p;
    TypeProduit tp;


    public EncheresProduits() {
    }

    public EncheresProduits(int idclient, Float Offre, Date date, Produit p, TypeProduit tp) {
        this.idclient = idclient;
        this.Offre = Offre;
        this.date = date;
        this.p = p;
        this.tp = tp;
    }


    public int getIdclient() {
        return this.idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }
    

    public Float getOffre() {
        return this.Offre;
    }

    public void setOffre(Float Offre) {
        this.Offre = Offre;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Produit getP() {
        return this.p;
    }

    public void setP(Produit p) {
        this.p = p;
    }


    public TypeProduit getTp() {
        return this.tp;
    }

    public void setTp(TypeProduit tp) {
        this.tp = tp;
    }

    
    public EncheresProduits Offre(Float Offre) {
        setOffre(Offre);
        return this;
    }

    public EncheresProduits date(Date date) {
        setDate(date);
        return this;
    }

    public EncheresProduits p(Produit p){
        setP(p);
        return this;
    }

    public EncheresProduits tp(TypeProduit tp) {
        setTp(tp);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " client='" + getIdclient() + "'" +
            ", Offre='" + getOffre() + "'" +
            ", date='" + getDate() + "'" +
            ", produit='" + getP().getDescription() + "'" +
            ", tp='" + getTp().getNomtype() + "'" +
            "}";
    }

    public static ArrayList<EncheresProduits> EncheresEnCours() throws Exception{
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<EncheresProduits> liste = new ArrayList<>();
        try {
            con = DBAConnection.connect();
            ps = con.prepareStatement("select * from v_encherescours");

            rs = ps.executeQuery();
            while (rs.next()) {
                EncheresProduits ep = new EncheresProduits();
                TypeProduit tp = new TypeProduit();
                Produit p = new Produit();
              
                p.setDescription(rs.getString("descriptions"));
                tp.setNomtype(rs.getString("nomtypep"));
                
                ep.setIdclient(rs.getInt("idclient"));
                ep.setOffre(rs.getFloat("offre"));
                ep.setDate(rs.getDate("datet"));
                ep.setP(p);
                ep.setTp(tp);
                liste.add(ep);
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        } finally {
            rs.close();
            ps.close();
            con.close();
        }
        return liste;


    }
}
