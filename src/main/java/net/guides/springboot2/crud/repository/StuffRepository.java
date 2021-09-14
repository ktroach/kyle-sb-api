package main.java.net.guides.springboot2.crud.repository;

import main.java.net.guides.springboot2.crud.dao.entity.Stuff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuffRepository extends JpaRepository<Stuff, Long> {
}