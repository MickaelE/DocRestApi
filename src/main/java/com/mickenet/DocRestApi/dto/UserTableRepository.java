package com.mickenet.DocRestApi.dto;

import com.mickenet.DocRestApi.entity.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTableRepository extends JpaRepository<UserTable,Long> {

}
