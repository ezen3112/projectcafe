package com.example.cafe.DTO;

import com.example.cafe.Entity.CafeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cafe {
    Long id;
    String cname;
    String cphoto;
    String cintro;
    String carea;
    String ctype;
    String cfilter;
    String cmenu;

    public CafeEntity toCafeEntity(){
        return new CafeEntity(id,cname,cphoto,cintro,carea,ctype,cfilter,cmenu);
    }
}
