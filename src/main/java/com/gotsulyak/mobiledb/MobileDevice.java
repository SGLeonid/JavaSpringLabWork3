package com.gotsulyak.mobiledb;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "mobile_device")
public class MobileDevice {
    @Id
    private Integer id;
    private String brand;
    private String model;
    private float price;
    private String operating_system;
}

