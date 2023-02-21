package com.skytel.pigeon.persistence.repositories;

import com.skytel.pigeon.persistence.models.User;
import com.skytel.pigeon.persistence.models.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {

    public UserLocation findByCountryAndUser(String country, User user);
}