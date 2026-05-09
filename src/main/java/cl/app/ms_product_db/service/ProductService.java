package cl.app.ms_product_db.service;

import cl.app.ms_product_db.model.dto.ProductDTO;
import cl.app.ms_product_db.model.entities.Product;
import cl.app.ms_product_db.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    //Metodo que trae una lista de productos con todos los registros
    public List<ProductDTO> findAll(){
        //return productRepository.findAll();
        List<ProductDTO> dtoList = new ArrayList<>();

        for(Product product : productRepository.findAll()){
            dtoList.add(entityToDto(product));
        }
        return dtoList;
    }

    public ProductDTO entityToDto(Product product){
        return new ProductDTO(product.getId(),
                              product.getName(),
                              product.getDescription(),
                              product.getPrice());
    }
}
