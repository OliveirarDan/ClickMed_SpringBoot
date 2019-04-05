package br.com.click.med;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.click.med.model.Medico;
import br.com.click.med.repository.MedicoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {Medico.class})
public class MedApplicationTests {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private MedicoRepository medicoRepository;

	@Test
	public void whenFindById_thenReturnMedico() {

		Optional<Medico> found = medicoRepository.findById((long) 1);

		if (found != null) {
			Assert.assertEquals(found.get().getId(), 1L);
		}

	}

}
