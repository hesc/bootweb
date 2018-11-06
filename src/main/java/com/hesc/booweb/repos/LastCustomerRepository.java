package com.hesc.booweb.repos;

import com.hesc.booweb.entities.LastCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LastCustomerRepository extends JpaRepository<LastCustomer, String> {
    public List<LastCustomer> findByAgentKey(String agentKey);
}
