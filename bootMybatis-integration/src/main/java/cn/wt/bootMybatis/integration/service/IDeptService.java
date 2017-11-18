package cn.wt.bootMybatis.integration.service;

import java.util.List;

import cn.wt.bootMybatis.integration.vo.Dept;

public interface IDeptService {
	/**
	 * 显示当前所有的部门信息
	 * @return 当前的部门信息
	 */
	public List<Dept> list();
}
