package com.duck.myapp.service;

import java.util.List;

import com.duck.myapp.vo.WineVO;
 
public interface WineService {
    
    public List<WineVO> selectWine() throws Exception;
}
