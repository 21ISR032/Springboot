package com.crud.crud;

import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<User,Integer>{
    
}
