package com.EcomJava.ecommerceSpringBootBase.service;

import com.EcomJava.ecommerceSpringBootBase.model.Orden;
import com.EcomJava.ecommerceSpringBootBase.model.Usuario;
import com.EcomJava.ecommerceSpringBootBase.repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenImplement implements OrdenService{
    @Autowired
    private OrdenRepository ordenRepository;

    @Override
    public List<Orden> findAll() {
        return null;
    }

    @Override
    public Optional<Orden> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Orden save(Orden orden) {
        return null;
    }

    @Override
    public String generarNumeroOrden() {
        return null;
    }

    @Override
    public List<Orden> findByUsuario(Usuario usuario) {
        return null;
    }
}
