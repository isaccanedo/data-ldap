package br.com.isaccanedo;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link LdapApplication}.
 *
 * @author Isac Canedo
 */
@RunWith(SpringRunner.class)

class LdapApplicationTests {

	@ClassRule
	public static OutputCapture outputCapture = new OutputCapture();

	@Test
	public void testDefaultSettings() {
		String output = outputCapture.toString();
		assertThat(output).contains("cn=Alice Smith");
	}

}
