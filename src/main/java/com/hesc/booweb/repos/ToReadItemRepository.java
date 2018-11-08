package com.hesc.booweb.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hesc.booweb.entities.LastCustomer;
import com.hesc.booweb.entities.ToReadItem;

public interface ToReadItemRepository extends JpaRepository<ToReadItem, String> {
    public Optional<ToReadItem> findById(String id);
}
