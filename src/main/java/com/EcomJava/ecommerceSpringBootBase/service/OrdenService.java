package com.EcomJava.ecommerceSpringBootBase.service;

import java.util.*;
import com.EcomJava.ecommerceSpringBootBase.model.Orden;
import com.EcomJava.ecommerceSpringBootBase.model.Usuario;

public interface OrdenService {
    List<Orden> findAll();
    Optional<Orden> findById(Integer id);
    Orden save(Orden orden);
    String generarNumeroOrden();
    List<Orden> findByUsuario(Usuario usuario);
}
