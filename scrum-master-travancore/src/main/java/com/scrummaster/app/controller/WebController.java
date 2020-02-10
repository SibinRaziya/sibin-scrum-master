package com.scrummaster.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.scrummaster.app.constants.ScrummasterConstants;

/*
 * @author: sibin
 * Date : 2/7/2020
 * 
 */
@Controller
public class WebController {

	private static final Logger logger = LoggerFactory.getLogger(WebController.class);

	@GetMapping("/index")
	public String hello() {

		logger.debug("Debug on");
		logger.error("error on");
		logger.info("info on");
		logger.warn("warning on");
		logger.trace("trace on");

		return ScrummasterConstants.LANDING_PAGE;
	}

	/*public String login() {
		return ScrummasterConstants.LOGIN_PAGE;

	}
*/
}