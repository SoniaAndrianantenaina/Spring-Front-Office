package springapp;

import java.sql.Date;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        Client c = new Client(1, "test", "test", "test", "null", 0, 50000000, 0, 1, null);
        //System.out.println(EncheresProduits.EncheresEnCours());
        c.setDatet(Date.valueOf("2023-03-01"));
        //System.out.println(c.getoffreMax(2));
        System.out.println(c.rencherir());
    }
}
