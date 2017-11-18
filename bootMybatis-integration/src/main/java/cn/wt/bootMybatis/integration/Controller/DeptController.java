package cn.wt.bootMybatis.integration.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wt.bootMybatis.integration.service.IDeptService;

@Controller
public class DeptController {
	@Resource
	private IDeptService deptService;
	@RequestMapping("/dept_list")
	public String findlist(Model model) {
		model.addAttribute("allDept", this.deptService.list());
		return "back/admin/dept/dept_list";
	}
}
