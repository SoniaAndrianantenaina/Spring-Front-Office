package springapp;

public class ClientMongo {
    Integer id ;
    String emailclients;
    String mdpclients;
    
    public ClientMongo() {}

    public ClientMongo(String emailclients, String mdpclients) {
        this.emailclients = emailclients;
        this.mdpclients = mdpclients;
    }

    public ClientMongo(Integer id, String emailclients, String mdpclients) {
        this.id = id;
        this.emailclients = emailclients;
        this.mdpclients = mdpclients;
    }

    public Integer getId() {
        return id;
    }

    public String getEmailclients() {
        return emailclients;
    }

    public String getMdpclients() {
        return mdpclients;
    }

    @Override
    public String toString() {
        return "ClientMongo [id=" + id + ", emailclients=" + emailclients + ", mdpclients=" + mdpclients + "]";
    }

    
    
    
}
