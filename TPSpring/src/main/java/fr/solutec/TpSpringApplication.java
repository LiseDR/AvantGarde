package fr.solutec;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.*;
import fr.solutec.repository.EventsRepository;
import fr.solutec.repository.MemoRepository;
import fr.solutec.repository.UserRepository;

@SpringBootApplication
public class TpSpringApplication implements CommandLineRunner  {

	@Autowired
	private MemoRepository memoRepos;
	@Autowired
	private UserRepository userRepos;
	@Autowired
	private EventsRepository eventRepos;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TpSpringApplication.class, args);
		System.out.println("Lancement terminé !");
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Lancement en cours !");
		
		User u1 = new User(null,"Joel", "Jojo", "Test", "Test");
		User u2 = new User(null,"Ahadi", "Aha", "Triste", "Test");
		User u3 = new User(null,"Caro", "Caro", "Dac", "Test");
		User u4 = new User(null,"Lise", "Luse", "Oui", "Test");
		User u5 = new User(null,"Porc", "Cochon", "Miam", "Test");
		
		Stream.of(u1,u2, u3, u4, u5).forEach(u -> {
			userRepos.save(u);
		});
		
		Memo m1 = new Memo(null,"Faudra que je pense à sortir le chien !",true, null, u1, u5);
		Memo m2 = new Memo(null,"Faudra que je pense à voir Joël !",true, null, u4,u3);
		Memo m3 = new Memo(null,"Pensez à la fête d'Halloween !",false, null, u1, null);
		Memo m4 = new Memo(null,"Barbecue prévu à la fin de la formation !",false, null, u3,null);
		Memo m5 = new Memo(null,"Je ne sais pas pourquoi !",true, null, u4,u1);
		Memo m6 = new Memo(null,"J'adore Solutec Paris !",true, null, u4,u3);
		Memo m7 = new Memo(null,"Faudra que je pense à tout casser !",true, null, u4,u5);
		Memo m8 = new Memo(null,"Helo, t'as oublié de faire ta manucure !",true, null, u4,u2);
		Memo m9 = new Memo(null,"J'aime les patates !",true, null, u4,null);
		
		Stream.of(m1,m2,m3,m4,m5,m6,m7,m8,m9).forEach(m -> {
			memoRepos.save(m);
		});
		
		Events e1 = new Events(null, "Fiesta", null, "ESIC", null, u1);
		Events e2 = new Events(null, "Merguez party", null, "ESIC", null, u2);
		Events e3 = new Events(null, "Poulet végé party", null, "ESIC", null, u1);
		
		Stream.of(e1, e2, e3).forEach(e -> {
			eventRepos.save(e);
		});
	}
}
