package com.itesm.komorebi.repositorios;

import com.itesm.komorebi.models.Persona;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonaRepository {
    public List<Persona> findAll(){
        Persona p1 =new Persona();
        p1.setNombre("Juan");
        p1.setEdad(33);
        Persona p2 =new Persona();
        p1.setNombre("andres");
        p1.setEdad(32);
        List<Persona> result = new ArrayList<>();
        result.add(p1);
        result.add(p2);
        return result;

    }
    public Persona findById(int id){
        Persona p1= new Persona();
        p1.setNombre("Juan");
        p1.setEdad(33);
        return p1;
    }
}
