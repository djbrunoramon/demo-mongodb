package br.com.brlocal.demomongodb.controller;

import br.com.brlocal.demomongodb.documents.Pessoa;
import br.com.brlocal.demomongodb.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    @Autowired
    PessoaRepository pessoaRepository;

    @PostMapping("/salvar")
    public Pessoa postPessoa(@RequestBody Pessoa pessoa){
        pessoa.setUuid(UUID.randomUUID());
        return pessoaRepository.save(pessoa);
    }

    @GetMapping("/")
    public List<Pessoa> getPessoas(){
        return pessoaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Pessoa getPessoa(@PathVariable("id") UUID uuid){
        return pessoaRepository.findById(uuid).get();
    }

    @PutMapping("/salvar")
    public Pessoa putPessoa(@RequestBody Pessoa pessoa){
        pessoa.setAtualizadoEm(LocalDateTime.now());
        return pessoaRepository.save(pessoa);
    }
}
