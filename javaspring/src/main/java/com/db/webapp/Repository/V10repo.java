package com.db.webapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V10;

import java.util.List;

@Repository
public interface V10repo extends JpaRepository<V10, String> {

    @Query(value = "SELECT * FROM taul1", nativeQuery = true)
    List<V10repo> getv10();

}