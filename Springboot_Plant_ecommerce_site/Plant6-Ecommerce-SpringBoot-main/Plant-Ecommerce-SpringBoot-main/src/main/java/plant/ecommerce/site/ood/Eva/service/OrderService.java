package plant.ecommerce.site.ood.eva.service;

import plant.ecommerce.site.ood.eva.model.Orders;
import plant.ecommerce.site.ood.eva.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void save(Orders order) {
        orderRepository.save(order);
    }
}
