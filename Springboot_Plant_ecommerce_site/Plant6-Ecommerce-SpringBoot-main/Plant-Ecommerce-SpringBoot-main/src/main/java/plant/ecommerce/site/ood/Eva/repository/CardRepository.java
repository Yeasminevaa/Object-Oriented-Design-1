package plant.ecommerce.site.ood.eva.repository;

import plant.ecommerce.site.ood.eva.model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {
    Card findCardById(long id);
    List<Card> findCardsByUserId(long id);
    Card findCardByPlantIdAndUserId(long productId, long userId);
}
