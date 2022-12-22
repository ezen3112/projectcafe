package com.example.cafe.DTO;

import com.example.cafe.Entity.ReviewEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Review {
    Long id;
    String rphoto;
    String rdate;
    String rcontent;
    String rscore;
    String rlike;

    public ReviewEntity toReviewEntity(){
        return new ReviewEntity(id,rphoto,rdate,rcontent,rscore,rlike);
    }
}
