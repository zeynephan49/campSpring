package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Bu sınıf bir business nesnesidir.Spring'e haber veriyorz
public class BrandManager implements BrandService {
    private BrandRepository brandRepository; //injection yapıyoruz.Şu anda Inmemory olabilir baska veritabanı yok cunku

    //İnjection yapıyoruz.Brand ile ilgili iş kuralı yazabilmem için baana bir repository ver diyoruz.
    @Autowired
    public BrandManager(BrandRepository brandRepository) {

        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> gelAll() {
        //iş kuralları buradan yazıyoruz
        return brandRepository.getAll();
    }
}
