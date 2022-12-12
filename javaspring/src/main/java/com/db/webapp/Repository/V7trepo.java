package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V7t;

import java.util.List;



@Repository
public interface V7trepo extends JpaRepository <V7t, String> {

    @Query(value ="SELECT * FROM v7t", nativeQuery= true)
    List<V7trepo> getv7t();


}