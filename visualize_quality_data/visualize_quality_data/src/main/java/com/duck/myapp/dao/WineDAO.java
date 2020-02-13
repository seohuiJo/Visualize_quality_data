package com.duck.myapp.dao;

import java.util.List;

import com.duck.myapp.vo.WineVO;

public interface WineDAO {
	public List<WineVO> selectWine() throws Exception;
}
