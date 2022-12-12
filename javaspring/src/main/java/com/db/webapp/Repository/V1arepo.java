package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V1a;

import java.util.List;



@Repository
public interface V1arepo extends JpaRepository <V1a, String> {

    @Query(value ="SELECT * FROM v1a", nativeQuery= true)
    List<V1arepo> getv1a();


}