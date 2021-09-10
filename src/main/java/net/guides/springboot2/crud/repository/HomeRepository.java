package net.guides.springboot2.crud.repository;

import net.guides.springboot2.crud.dao.entity.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {
}