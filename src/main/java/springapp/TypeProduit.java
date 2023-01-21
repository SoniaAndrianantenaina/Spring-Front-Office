package springapp;

public class TypeProduit {
    int id;
    String nomtype;
    int idCategorie;


    public TypeProduit() {
    }

    public TypeProduit(int id, String nomtype, int idCategorie) {
        this.id = id;
        this.nomtype = nomtype;
        this.idCategorie = idCategorie;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomtype() {
        return this.nomtype;
    }

    public void setNomtype(String nomtype) {
        this.nomtype = nomtype;
    }

    public int getIdCategorie() {
        return this.idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public TypeProduit id(int id) {
        setId(id);
        return this;
    }

    public TypeProduit nomtype(String nomtype) {
        setNomtype(nomtype);
        return this;
    }

    public TypeProduit idCategorie(int idCategorie) {
        setIdCategorie(idCategorie);
        return this;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nomtype='" + getNomtype() + "'" +
            ", idCategorie='" + getIdCategorie() + "'" +
            "}";
    }

}
