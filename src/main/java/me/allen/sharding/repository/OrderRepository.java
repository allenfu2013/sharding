package me.allen.sharding.repository;

import me.allen.sharding.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findById(Long id);

    Order findByOrderName(String orderName);

    List<Order> findByCreatedAtBetween(Date start, Date end);

}