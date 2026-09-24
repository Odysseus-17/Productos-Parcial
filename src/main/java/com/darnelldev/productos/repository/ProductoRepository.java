package com.darnelldev.productos.repository;
import com.darnelldev.productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductoRepository extends JpaRepository<Producto, Long> { }
