package plant.ecommerce.site.ood.eva.repository;

import plant.ecommerce.site.ood.eva.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Long> {
}
