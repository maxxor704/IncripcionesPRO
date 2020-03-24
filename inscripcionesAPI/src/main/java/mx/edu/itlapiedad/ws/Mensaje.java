package mx.edu.itlapiedad.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.DAO.DAO;
import mx.edu.itlapiedad.models.Docente;

@RestController
@RequestMapping("/tec")
public class Mensaje {
	
	@Autowired
	DAO repositorio;
	
	@GetMapping("docente")
	public List<Docente> consultarDocente(){
		return repositorio.consultarDocentes();
	}
}
