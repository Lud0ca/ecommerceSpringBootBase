package com.EcomJava.ecommerceSpringBootBase.repository;

import com.EcomJava.ecommerceSpringBootBase.model.Orden;
import com.EcomJava.ecommerceSpringBootBase.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrdenRepository extends JpaRepository<Orden, Integer> {
    List<Orden> findByUsuario(Usuario usuario);
}
