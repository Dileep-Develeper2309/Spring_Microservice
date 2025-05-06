package com.microservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {

    @Column(updatable = false) //tells the spring to not update this column when we update this table
    private LocalDate createdAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false) //tells the spring to not update this column when the data is inserted first time
    private LocalDate updatedAt;

    @Column(insertable = false)
    private String updatedBy;
}
