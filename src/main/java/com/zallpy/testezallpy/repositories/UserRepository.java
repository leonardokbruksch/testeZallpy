package com.zallpy.testezallpy.repositories;

import com.zallpy.testezallpy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
