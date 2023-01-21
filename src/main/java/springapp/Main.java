package springapp;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        Client c = new Client();
        //System.out.println(EncheresProduits.EncheresEnCours());

        Produit p = new Produit();
        System.out.println(p.getListMyEncheres(1));
    }
}
