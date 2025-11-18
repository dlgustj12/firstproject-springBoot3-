package com.example.firstproject.dto;


import com.example.firstproject.entity.Coffee;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // lombok-> 모든 필드를 매개변수로 하는 생성자 자동생성 어노테이션
@ToString
public class CoffeeDto {

    private Long id;
    private String name;
    private String price;

    public Coffee toEntity(){
        return new Coffee(id, name, price);
    }
}
