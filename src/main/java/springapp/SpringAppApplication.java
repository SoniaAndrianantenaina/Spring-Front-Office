package springapp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAppApplication {
	@Autowired
	ClientMongoRepository crud_client;

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/listeClientMongo")
	@CrossOrigin
	public List<ClientMongo> findAllClientMongo()throws Exception{
		return crud_client.findAll();
	}
	@PostMapping("/login")
	@CrossOrigin
	public int Login(String email, String mdp) throws SQLException {
		Client c = new Client();
		c.setEmail(email);
		c.setMdp(mdp);		
		return c.Login();
	}

	@PostMapping("/updateDemande")
	@CrossOrigin
	public int RechargerCompte (int idClient) throws Exception{
		Client cl = new Client();
		cl.setIdClient(idClient);
		return cl.RechargerCompte();

	}

	@PostMapping("/inscription")
	@CrossOrigin
	public int Inscrisption(@RequestBody Client c) throws Exception{
 
		return c.Inscrisption();
	}
	@GetMapping("/mesencheres")
	@CrossOrigin
	public ArrayList<Client> mesenchere(int idClient) throws Exception{
		Client cl = new Client();
		cl.setIdClient(idClient);
		ArrayList<Client> c= cl.listeEnchereencheri(idClient);
		return c; 
	}

	@PostMapping("/rencherir")
	@CrossOrigin
	public Integer rencherir(int idClient,int idProduit) throws Exception{
		Client c = new Client();
		c.setIdProduit(idProduit);
		c.setIdClient(idClient);
		return Client.rencherir();
	}

}