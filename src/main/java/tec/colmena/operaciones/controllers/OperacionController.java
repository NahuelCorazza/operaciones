package tec.colmena.operaciones.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@RestController /* Esto permite que las respuestas vayan en formato Json */
public class OperacionController {

	@Autowired
	private RestTemplate clienteRest;
	
	@GetMapping("/sumareuropa")
	public String sumarEuropa(@RequestParam float a, @RequestParam float b) {
		String resultado = Float.toString(a + b);
		return clienteRest.getForObject("https://europaresultados.herokuapp.com/resultado/" + resultado , String.class);
	}
	@GetMapping("/restareuropa")
	public String restarEuropa(@RequestParam float a, @RequestParam float b) {
		String resultado = Float.toString(a - b);
		return clienteRest.getForObject("https://europaresultados.herokuapp.com/resultado/" + resultado , String.class);
	}
	
	@GetMapping("/sumarusa")
	public String sumarUsa(@RequestParam float a, @RequestParam float b) {
		String resultado = Float.toString(a + b);
		return clienteRest.getForObject("https://usaresultados.herokuapp.com/resultado/" + resultado , String.class);
	}
	@GetMapping("/restarusa")
	public String restarUsa(@RequestParam float a, @RequestParam float b) {
		String resultado = Float.toString(a - b);
		return clienteRest.getForObject("https://usaresultados.herokuapp.com/resultado/" + resultado , String.class);
	}
	
}
