package br.com.portfolioandre.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portfolioandre.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
