package me.allen.sharding.repository;

import me.allen.sharding.domain.OrderRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRequestRepository extends JpaRepository<OrderRequest, Long> {
}
