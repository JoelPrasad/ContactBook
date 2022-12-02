package com.joelprasad.contactbook.repository;
import com.joelprasad.contactbook.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<userModel, Integer>{
}