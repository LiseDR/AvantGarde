package fr.solutec;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.*;
import fr.solutec.repository.MemoRepository;

@SpringBootApplication
public class TpSpringApplication implements CommandLineRunner  {

	@Autowired
	private MemoRepository memoRepos;
	
	public static void main(String[] args) {
		SpringApplication.run(TpSpringApplication.class, args);
		System.out.println("Lancement terminé !");
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Lancement en cours !");
		
		Memo m1 = new Memo(null,"Faudra que je penses à sortir le chien !", null);
		Memo m2 = new Memo(null,"Faudra que je penses à voir Joël !", null);
		
		Stream.of(m1,m2).forEach(m -> {
			memoRepos.save(m);
		});
		
	}
}
