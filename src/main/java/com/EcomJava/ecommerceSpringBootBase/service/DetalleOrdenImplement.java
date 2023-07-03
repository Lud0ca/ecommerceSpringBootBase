package com.EcomJava.ecommerceSpringBootBase.service;

import com.EcomJava.ecommerceSpringBootBase.model.DetalleOrden;
import com.EcomJava.ecommerceSpringBootBase.repository.DetalleOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenImplement implements DetalleOrdenService{
    @Autowired
    private DetalleOrdenRepository detalleOrdenRepository;

    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {
        return null;
    }
}
