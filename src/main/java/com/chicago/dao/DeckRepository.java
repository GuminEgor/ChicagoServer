package com.chicago.dao;


import com.chicago.entity.ChallengeType;
import com.chicago.entity.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Long> {

}
