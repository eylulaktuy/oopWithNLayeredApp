package org.example.dataAccess;
import org.example.entities.Product;
public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        //sadece db erişim kodları buraya yazılır
        System.out.println("jdbc ile veritabanına eklendi");
    }
}
