package plant.ecommerce.site.ood.eva.repository;

import plant.ecommerce.site.ood.eva.model.Plant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends CrudRepository<Plant, Long> {
    Plant getPlantById(long id);
}
