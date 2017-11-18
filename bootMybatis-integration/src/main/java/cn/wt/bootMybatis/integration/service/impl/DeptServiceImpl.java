package cn.wt.bootMybatis.integration.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.wt.bootMybatis.integration.dao.IDeptDAO;
import cn.wt.bootMybatis.integration.service.IDeptService;
import cn.wt.bootMybatis.integration.vo.Dept;
@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDAO deptDAO;
	@Override
	public List<Dept> list() {
		return this.deptDAO.findAll();
	}

}
