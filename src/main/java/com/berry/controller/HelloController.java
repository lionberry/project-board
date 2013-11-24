/*
 * @(#)HelloController.java $version 2013. 11. 24.
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.berry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author "lionberry"
 */
@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
}
