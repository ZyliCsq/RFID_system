package com.mypj.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;



/**
 * @author mazhicheng
 * @date 2020/6/8 - 15:30
 */
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ToString
public class State {

   
   
    private String state_no;
    private String state;


}
