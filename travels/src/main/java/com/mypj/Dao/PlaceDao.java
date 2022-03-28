package com.mypj.Dao;

import com.mypj.entity.Place;
import com.mypj.entity.State;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mazhicheng
 * @date 2020/6/8 - 15:36
 */

@Mapper
public interface PlaceDao extends BaseDao<Place,String> {

    List<Place> findByrfid(@Param("start") Integer start,@Param("rows") Integer rows);
    
    List<Place> findStaterfid(@Param("start") Integer start,@Param("rows") Integer rows,@Param("state_no") String state_no);
    
    Integer findByCounts();

    void deleterfid(@Param("rfid_no") String rfid_no);
    
    List<State> findAllState();
    
    Place findOne(@Param("rfid_no") String rfid_no);
    
    
    
    
}
