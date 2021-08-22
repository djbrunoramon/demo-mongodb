package br.com.brlocal.demomongodb.repository;

import br.com.brlocal.demomongodb.documents.Pessoa;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, UUID> {
}
