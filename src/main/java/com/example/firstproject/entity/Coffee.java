package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // JPA 어노테이션 -> 이 클래스를 기반으로 DB에 테이블이 생성도록함.
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 id 자동 생성
    private Long id;

    @Column
    private String name;
    @Column
    private String price;

    //전달 받은 값중에 null이 있다면 해당 데이터는 DB에 저장하지 않음
    public void patch(Coffee coffee) {
        if(coffee.name != null)
            this.name = coffee.name;
        if(coffee.price != null)
            this.price = coffee.price;
    }
}
