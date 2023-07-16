package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

//Faz consulta no banco atraves do extends
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
