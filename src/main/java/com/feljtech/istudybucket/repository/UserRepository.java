package com.feljtech.istudybucket.repository;

import com.feljtech.istudybucket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    <S extends User> S save(S s);
}
