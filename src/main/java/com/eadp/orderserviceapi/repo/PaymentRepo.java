package com.eadp.orderserviceapi.repo;

import com.eadp.orderserviceapi.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface PaymentRepo extends JpaRepository<Payment, Long> {
}
