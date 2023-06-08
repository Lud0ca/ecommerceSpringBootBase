package com.EcomJava.ecommerceSpringBootBase.repository;
import com.EcomJava.ecommerceSpringBootBase.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
