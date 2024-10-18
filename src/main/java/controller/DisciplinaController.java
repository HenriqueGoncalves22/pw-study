package controller;

import br.com.etechoracio.study.entity.Disciplina;
import br.com.etechoracio.study.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
    @Autowired
    private DisciplinaService service;

    @GetMapping
    public List<Disciplina> listar(){
        return service.listar();
    }
}
