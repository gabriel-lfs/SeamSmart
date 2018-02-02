package tcc.entra21.SeamSmart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tcc.entra21.SeamSmart.repositories.ReferenciaRepository;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	ReferenciaRepository referenciaRepository;
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		
	}
	
	
}
