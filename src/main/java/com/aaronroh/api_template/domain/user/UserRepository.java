package com.aaronroh.api_template.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserData, Long>{

}
