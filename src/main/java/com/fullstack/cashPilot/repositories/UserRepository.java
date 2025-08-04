package com.fullstack.cashPilot.repositories;

import com.fullstack.cashPilot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
