package com.gotsulyak.mobiledb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileDeviceRepository extends JpaRepository<MobileDevice, Integer> {

}
