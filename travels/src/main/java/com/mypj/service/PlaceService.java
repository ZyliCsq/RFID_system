package com.mypj.service;

import com.mypj.entity.Place;
import com.mypj.entity.State;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mazhicheng
 * @date 2020/6/8 - 15:50
 */
public interface PlaceService {

    List<Place> findByrfid(Integer page,  Integer rows);
    
    List<Place> findStaterfid(Integer start,Integer rows, String state_no);


    Integer findByCounts();

    List<State> findAllState();

    Place findOne(String rfid_no);

    void update(Place place);
    
    void deleterfid(String rfid_no);
    
    void save(Place place);
}
