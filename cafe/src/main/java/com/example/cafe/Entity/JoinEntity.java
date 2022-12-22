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
@Table(name = "join")
@SequenceGenerator(name = "join_seq_GENERATOR",sequenceName = "join_seq", allocationSize = 1, initialValue = 1)
public class JoinEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "join_seq_GENERATOR")
    @Column
    String nik;
    @Column
    long id;
    @Column
    String pw;
}