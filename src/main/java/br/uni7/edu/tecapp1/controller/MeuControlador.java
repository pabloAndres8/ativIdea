package br.uni7.edu.tecapp1.controller;


import br.uni7.edu.tecapp1.model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuControlador {

    @ResponseBody
    @RequestMapping(path= "/atividadeRedes")
    public Pessoa cadastroDePessoa(@RequestParam String nome, @RequestParam int idade, @RequestParam boolean teste){
        System.out.println(nome);
        System.out.println(idade);
        return new Pessoa(nome, idade, teste);
    }


}
