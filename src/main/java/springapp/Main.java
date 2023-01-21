package springapp;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        Client c = new Client(null, "test", "test", "test", "null", 0, 0, 0, 0, null);
        //System.out.println(EncheresProduits.EncheresEnCours());
        Produit p = new Produit();
        System.out.println(new Client().listeEnchereencheri(1));
    }
}
