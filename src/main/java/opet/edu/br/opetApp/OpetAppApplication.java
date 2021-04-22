package opet.edu.br.opetApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import opet.edu.br.opet.models.Interfaces.PessoaDao;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = PessoaDao.class)

public class OpetAppApplication{

	public static void main(String[] args) {
		SpringApplication.run(OpetAppApplication.class, args);
	}
}
