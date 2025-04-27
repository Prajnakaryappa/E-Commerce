package com.jsp.ecommerce.repository;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AdminRepository  extends JpaRepository< Admin , Long >{
		
		boolean existByEmail(String email);
}
