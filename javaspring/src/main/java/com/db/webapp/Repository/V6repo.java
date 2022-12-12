package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V6;

import java.util.List;



@Repository
public interface V6repo extends JpaRepository <V6, String> {

    @Query(value ="SELECT * FROM v6", nativeQuery= true)
    List<V6repo> getv6();


}