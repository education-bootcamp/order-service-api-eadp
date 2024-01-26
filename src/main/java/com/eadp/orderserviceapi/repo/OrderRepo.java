package com.eadp.orderserviceapi.repo;

import com.eadp.orderserviceapi.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface OrderRepo extends JpaRepository<Orders,Long> {
}
