package com.ex3.ex3.Repo;


import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepo extends CrudRepository<User, Long> {

    void save(com.ex3.ex3.Model.User user);}
