package main.java.net.guides.springboot2.crud.repository;

import main.java.net.guides.springboot2.crud.dao.entity.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {
}