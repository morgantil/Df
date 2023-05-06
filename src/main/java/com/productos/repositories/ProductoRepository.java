package com.productos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.productos.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, String> {
	
	List<Producto> findBynombreContains(String nombre);
	//List<Producto> findAllByOrderByprecioAsc();
	@Query( value = "SELECT * FROM PRODUCTO ORDER BY precio ASC", nativeQuery = true)
	List<Producto>productoOrdenado();
	/* 
	@Query( value = "UPDATE PRODUCTO p SET p.cantidad='5' WHERE p.idProducto = ?1", nativeQuery = true) //fasle
	void eliminarProducto(String id);
*/
}
