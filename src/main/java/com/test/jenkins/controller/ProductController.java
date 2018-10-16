package com.test.jenkins.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "products", description = "Operations pertaining to products")
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private Environment environment;

	@ApiOperation(value = "Find a product by EAN and id of store")
	@ApiResponses(value = {
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	@RequestMapping(path = "/findByEan", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getWalletByEmail(@RequestParam String ean, @RequestParam String storeId) {
		return new ResponseEntity<>("Swagger example success", HttpStatus.OK);
	}


}
