package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;


import java.util.List;


public interface BrandRepository {
    //Markaları listeleyeceğiz.Bir tanede olabilir on tanede olabilir.Bu yüzden array olmalı
    List<Brand> getAll(); //Tümünü getir dediğimiz bir operasyon

}
