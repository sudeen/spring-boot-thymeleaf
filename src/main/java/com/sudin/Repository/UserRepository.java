package com.sudin.Repository;

/**
 * Created by Sudin Ranjitkar on 5/17/2017.
 */
import com.sudin.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByEmail(String email);
}