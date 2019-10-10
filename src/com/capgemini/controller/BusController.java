package com.capgemini.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import com.capgemini.exception.NoDataFound;
import com.capgemini.model.Bus;
import com.capgemini.service.IBusService;

/**
* <h1>Bus Ticket View Application</h1>
* The Bus Ticket View  Application implements an web based 
* application that displays BusDetails implemented in Spring
* <p>
* Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
* 
*
* @author  Anudeep Reddy
* @version 1.0
* @since   2019-07-10 
*/

@Controller
public class BusController {

	@Autowired
	IBusService service;
	
	//Default web page when the web application is executed
	@RequestMapping(path="/")
	public String processViewAllBusDetails(Model model) {
		List<Bus> list= service.showBusDetails();
		if(list.isEmpty()){
			//If there is no data found then NoDataFound Exception is thrown
			throw new NoDataFound("Currently we are out service!Please visit us later");
		}
		else{
		model.addAttribute("busDetails", list);
		//If data exists then BusDetails.jsp is displayed
		return "BusDetails";
		}
	}
	
	
	@ExceptionHandler(NoDataFound.class)
	//handleEmployeeNotFoundException Class is used to handle exception
	public String handleEmployeeNotFoundException(){
		//If NoDataFound Exception occurs error.jsp is displayed
		return "error";
	}
}
