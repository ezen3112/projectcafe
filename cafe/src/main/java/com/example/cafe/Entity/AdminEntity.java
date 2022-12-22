package com.example.cafe.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "admin")
@SequenceGenerator(name = "admin_seq_GENERATOR",sequenceName = "admin_seq", allocationSize = 1, initialValue = 1)
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin_seq_GENERATOR")
    @Column
    Long id;
    @Column
    String pw;
}