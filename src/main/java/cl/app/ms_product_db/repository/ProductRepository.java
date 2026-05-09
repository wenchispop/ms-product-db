package cl.app.ms_product_db.repository;

import cl.app.ms_product_db.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
