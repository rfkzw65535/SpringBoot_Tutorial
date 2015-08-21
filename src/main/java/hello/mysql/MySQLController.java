
package hello.mysql;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MySQLController {

	@Autowired
	JPARepository repository;

	////read db
	@RequestMapping("/mysqlview")
	public String mysqlview(Model model) {
		Iterable<MySQLdata> list = repository.findAll();
		model.addAttribute("results", list);
		return "mysqlview";
	}

	////write db (thru POST)
	@RequestMapping(value="/post", method=RequestMethod.POST)
	public String mysqlviewSearch(Model model,
			@RequestParam("name") String name,
			@RequestParam("description") String description) {

		MySQLdata mysqlController = new MySQLdata(name, description);
		repository.saveAndFlush(mysqlController);

		Iterable<MySQLdata> list = repository.findAll();
		model.addAttribute("results", list);
		return "mysqlview";
	}

}
