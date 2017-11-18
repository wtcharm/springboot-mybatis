package cn.wt.bootMybatis.integration.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.wt.bootMybatis.integration.vo.Dept;
@Mapper
public interface IDeptDAO {
	public List<Dept> findAll();
}
