package com.mypj.service.impl;

import com.mypj.Dao.PlaceDao;
import com.mypj.entity.Place;
import com.mypj.entity.State;
import com.mypj.service.PlaceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author mazhicheng
 * @date 2020/6/8 - 15:51
 */

@Service
@Transactional
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceDao placeDao;

   

    @Override
    public List<Place> findByrfid(Integer page, Integer rows) {

        int start = (page-1)*rows;
        return placeDao.findByrfid(start,rows);
    }
    
    
    @Override
    public List<Place> findStaterfid(Integer page, Integer rows,String state_no) {

        int start = (page-1)*rows;
        return placeDao.findStaterfid(start,rows,state_no);
    }
    
    @Override
    public Integer findByCounts() {
    	return placeDao.findByCounts();
    }


    @Override
    public Place findOne(String rfid_no) {
        return placeDao.findOne(rfid_no);
    }

    @Override
    public void update(Place place) {
        placeDao.update(place);
    }
    
    @Override
    public void deleterfid(String rfid_no) {
    	placeDao.deleterfid(rfid_no);
    	   }
    	
    @Override	
    public  List<State> findAllState(){
    	return placeDao.findAllState();
 
    }
    
    
    @Override
    public void save(Place place) {
    	placeDao.save(place);
    }
}
