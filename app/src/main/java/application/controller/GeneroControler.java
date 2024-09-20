package application.controller;
import application.model.Genero;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import application.repository.GeneroRepository;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/generos")
public class GeneroControler{
    @Autowired
    private GeneroRepository generoRepo;
    @RequestMapping("/insert")
    public String insert(){
        return "/generos/insert";
    }
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam("nome") String nome){
        Genero genero = new Genero();
        genero.setNome(nome);

        generoRepo.save(genero);

        return "redirect:/generos/list";
    }
    @RequestMapping("/list")
    public String getAll(Model ui){
        ui.addAttribute("generos", generoRepo.findAll());
        return"/generos/list";
    
    }
}