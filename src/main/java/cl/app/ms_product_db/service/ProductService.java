package cl.app.ms_product_db.service;

import cl.app.ms_product_db.model.entities.Product;
import cl.app.ms_product_db.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    //Metodo que trae una lista de productos con todos los registros
    public List<Product> findAll(){
        return productRepository.findAll();
    }
}
