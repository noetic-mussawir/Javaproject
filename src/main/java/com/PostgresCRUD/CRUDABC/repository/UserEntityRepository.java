package com.PostgresCRUD.CRUDABC.repository;

import com.PostgresCRUD.CRUDABC.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserEntityRepository extends JpaRepository<UserEntity,Long> {
    @Query(value = "select * from user_entity where id=:id", nativeQuery = true)
    UserEntity getId(@Param("id") int id);
}
