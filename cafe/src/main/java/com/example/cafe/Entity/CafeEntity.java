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
@Table(name = "cafe")
@SequenceGenerator(name = "cafe_seq_GENERATOR",sequenceName = "cafe_seq", allocationSize = 1, initialValue = 1)
public class CafeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cafe_seq_GENERATOR")
    @Column
    Long id;
    @Column
    String cname;
    @Column
    String cphoto;
    @Column
    String cintro;
    @Column
    String carea;
    @Column
    String ctype;
    @Column
    String cfilter;
    @Column
    String cmenu;
}