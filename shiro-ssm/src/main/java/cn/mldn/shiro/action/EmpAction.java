package cn.mldn.shiro.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.mldn.shiro.service.IEmpService;

@Controller
@RequestMapping("/pages/back/emp/*")
public class EmpAction {
	@Resource
	private IEmpService empService ;
	@RequestMapping("add")
	public ModelAndView add() {
		this.empService.add();
		return null ;
	}
	@RequestMapping("edit")
	public ModelAndView edit() {
		this.empService.edit();
		return null ;
	}
	@RequestMapping("delete")
	public ModelAndView delete() {
		this.empService.delete();
		return null ;
	}
//	private Logger log = LoggerFactory.getLogger(super.getClass());
//	@RequestMapping("add")
//	@RequiresAuthentication
//	public ModelAndView add() {
//		log.info("**************** 【EmpAction.add()】 ****************");
//		return null ;
//	}
//	@RequestMapping("edit")
//	@RequiresRoles("dept")
//	public ModelAndView edit() {
//		log.info("**************** 【EmpAction.edit()】 ****************");
//		return null ;
//	}
//	@RequestMapping("delete")
//	@RequiresPermissions("news:add")
//	public ModelAndView delete() {
//		log.info("**************** 【EmpAction.delete()】 ****************");
//		return null ;
	}

