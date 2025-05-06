package com.microservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {

    private long customerId;

    @Id
    private long accountNumber;

    private String accountType;

    private String branchAddress;


}
