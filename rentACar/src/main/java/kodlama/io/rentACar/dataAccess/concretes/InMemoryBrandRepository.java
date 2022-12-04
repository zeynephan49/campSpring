package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository //bu sınıf bir dataAccess nesnesidir.Spring'e bunu anlatıyoruz.
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;
    //InMemory..'yi oluşturan birisi yani newleyen birisi burayı çalıştıracak
    public InMemoryBrandRepository() {
        brands=new ArrayList<Brand>(); //bunu olusturduğumuzda elimizde boş bir liste var anlamındadır.
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2,"Mercedes"));
        brands.add(new Brand(3,"Opel"));
        brands.add(new Brand(4,"Citroen"));
        brands.add(new Brand(5,"Audi"));
    }

    @Override
    //İçinde Brandler olan bir liste döndürücez anlamına gelir
    public List<Brand> getAll() {
        return brands;
    }
}
