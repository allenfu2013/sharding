package me.allen.sharding.repository;

import me.allen.sharding.domain.MaterialType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaterialTypeRepository extends JpaRepository<MaterialType, Long> {

    List<MaterialType> findAll();

    MaterialType findOneByName(String name);
}
