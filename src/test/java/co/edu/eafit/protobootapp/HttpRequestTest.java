package co.edu.eafit.protobootapp;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

//Pruebas de integración
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testSaludoPorDefecto() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/hola",
                String.class)).contains("Hola Mundo!");
    }
    
    @Test
    public void testCuadradoPorDefecto() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/cuadrado",
                String.class)).containsPattern("El cuadrado de 0[\\.,]000000 es 0[\\.,]000000");
    }
    }// change
}
