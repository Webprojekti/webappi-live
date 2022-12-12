package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V8;

import java.util.List;
import java.util.Map;



@Repository
public interface V8repo extends JpaRepository <V8, String> {

    @Query(value ="SELECT * FROM v8", nativeQuery = true)
    List<Map<String, Object>> getAllData();
}