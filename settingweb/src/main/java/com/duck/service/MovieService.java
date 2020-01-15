package com.duck.service;

import java.util.List;

import com.duck.vo.MovieVO;
 
public interface MovieService {
    
    public List<MovieVO> selectMovie() throws Exception;
}
