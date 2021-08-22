package br.com.brlocal.demomongodb.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.UUID;

@Document(collection = "pessoa")
@Data
public class Pessoa {

    @Id
    private UUID uuid;
    private String nome;
    private String sobrenome;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Field(name = "att_em")
    private LocalDateTime atualizadoEm;
}
