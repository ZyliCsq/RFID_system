package com.mypj.controller;

import com.mypj.entity.Place;
import com.mypj.entity.Result;
import com.mypj.entity.State;
import com.mypj.service.PlaceService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @author mazhicheng
 * @date 2020/6/8 - 16:05
 */

@RestController
@CrossOrigin
@RequestMapping("place")
public class placeController {

    @Autowired
    private PlaceService placeService;

    /**
     * 查询景点信息
     */
    @PostMapping("/save")
    public Result save(@RequestBody Place place){
        Result result = new Result();
        try{
        	placeService.save(place);
            result.setMag("保存构件信息成功！");
        }catch (Exception e){
            e.printStackTrace();
            result.setStates(false).setMag("保存构件信息失败！注意：构件ID是必填项！构件状态是必选项！");
        }
        return result;
    }
    
    
    
    @PostMapping("/update")
    public Result update(@RequestBody Place place){
        Result result = new Result();
        try{
        	placeService.update(place);
            result.setMag("修改构件信息成功！");
        }catch (Exception e){
            e.printStackTrace();
            result.setStates(false).setMag("修改构件信息失败！注意：构件状态是必选项！");
        }
        return result;
    }
    /**
     * 查询景点信息
     * @param id
     * @return
     */
    @GetMapping("findOne")
    public Place findOne(String rfid_no){
        return placeService.findOne(rfid_no);
    }

   
    @GetMapping("deleterfid")
    public Result deleteRfid(String rfid_no) {
    	Result result = new Result();
    	 try{
         	placeService.deleterfid(rfid_no);
             result.setMag("删除构件信息成功！");
         }catch (Exception e){
             e.printStackTrace();
             result.setStates(false).setMag("删除构件信息失败！");
         }
         return result;
    	
    	
    }

    @GetMapping("findAllState")
    public Map<String,Object> findAllState() {
    	HashMap<String,Object> result = new HashMap<>();
    	List<State> states = placeService.findAllState();
    	result.put("provinces",states);
    	return result;
    }

    @GetMapping("findAllRfid")
    public Map<String,Object> findAllRfid(Integer page,Integer rows){

        HashMap<String,Object> result = new HashMap<>();
        page = page==null?1:page;
        rows = rows==null?7:rows;
        //景点集合
        List<Place> places = placeService.findByrfid(page,rows);
        //处理分页
        Integer counts = placeService.findByCounts();
        //计算总页数
        Integer totalPage = counts%rows==0?counts/rows:counts/rows+1;
        result.put("places",places);
        result.put("page",page);
        result.put("counts",counts);
        result.put("totalPage",totalPage);
        return result;


    }
    
    @GetMapping("findStateRfid")
    public Map<String,Object> findStateRfid(Integer page,Integer rows,String state_no){

        HashMap<String,Object> result = new HashMap<>();
        
        page = page==null?1:page;
        rows = rows==null?7:rows;
        //景点集合
        List<Place> places = placeService.findStaterfid(page, rows, state_no);
        //处理分页
        Integer counts = placeService.findByCounts();
        //计算总页数
        Integer totalPage = counts%rows==0?counts/rows:counts/rows+1;
        result.put("places",places);
        result.put("page",page);
        result.put("counts",counts);
        result.put("totalPage",totalPage);
        return result;


    }
    
}
