package com.crudTestDemo.repositoris;

import com.crudTestDemo.entitis.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {

}
