package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//Faz consulta no banco atraves do extends
public interface GameRepository extends JpaRepository<Game, Long> {

}
