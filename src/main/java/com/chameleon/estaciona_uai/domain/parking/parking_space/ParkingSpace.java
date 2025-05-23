package com.chameleon.estaciona_uai.domain.parking.parking_space;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

import com.chameleon.estaciona_uai.domain.parking.Parking;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "parking_spaces")
public class ParkingSpace {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Parking parking;
    
    @Enumerated(EnumType.STRING)
    private ParkingSpaceStatus status;

    private String identifier;
}