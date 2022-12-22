package com.example.cafe.DTO;

import com.example.cafe.Entity.AdminEntity;
import com.example.cafe.Entity.JoinEntity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {
    Long id;
    String pw;

    public AdminEntity toAdminEntity(){
        return new AdminEntity(id,pw);
    }

}
