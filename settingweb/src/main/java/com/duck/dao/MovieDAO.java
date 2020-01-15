package com.duck.dao;

import java.util.List;

import com.duck.vo.MovieVO;
 
public interface MovieDAO {
    
    public List<MovieVO> selectMovie() throws Exception;
}