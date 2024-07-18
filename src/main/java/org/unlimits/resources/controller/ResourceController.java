package org.unlimits.resources.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unlimits.resources.modal.UIResource;
import org.unlimits.resources.service.ResourceService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value="/resource")
public class ResourceController{

	@Autowired
	private ResourceService resourceService;
	
	@GetMapping(value="/{type}/{name}" , produces = {MediaType.APPLICATION_OCTET_STREAM_VALUE})
	public Resource getTagsImage(@PathVariable String type, @PathVariable String name, HttpServletRequest request) {
		String test = request.getRequestURI();
		System.out.println("test URL :"+test);
		return resourceService.getResource(test.split("resource")[1]);
	}
	
	@GetMapping(value="/{type}/{name}/{param1}" , produces = {MediaType.APPLICATION_OCTET_STREAM_VALUE})
	public Resource getTagsImage(@PathVariable String type, @PathVariable String name, @PathVariable String param1, HttpServletRequest request) {
		String test = request.getRequestURI();
		System.out.println("test URL :"+test);
		return resourceService.getResource(test.split("resource")[1]);
	}
	
	@GetMapping(value="/{type}/{name}/{param1}/{param2}" , produces = {MediaType.APPLICATION_OCTET_STREAM_VALUE})
	public Resource getTagsImage(@PathVariable String type, @PathVariable String name, @PathVariable String param1, @PathVariable String param2, HttpServletRequest request) {
		String test = request.getRequestURI();
		System.out.println("test URL :"+test);
		return resourceService.getResource(test.split("resource")[1]);
	}
	
	@GetMapping(value="/{type}/{name}/{param1}/{param2}/{param3}" , produces = {MediaType.APPLICATION_OCTET_STREAM_VALUE})
	public Resource getTagsImage(@PathVariable String type, @PathVariable String name, @PathVariable String param1 , @PathVariable String param2, @PathVariable String param3, HttpServletRequest request) {
		String test = request.getRequestURI();
		System.out.println("test URL :"+test);
		return resourceService.getResource(test.split("resource")[1]);
	}
	
	@GetMapping(value="/{type}/{name}/{param1}/{param2}/{param3}/{param4}" , produces = {MediaType.APPLICATION_OCTET_STREAM_VALUE})
	public Resource getTagsImage(@PathVariable String type, @PathVariable String name, @PathVariable String param1 , @PathVariable String param2, @PathVariable String param3, @PathVariable String param4, HttpServletRequest request) {
		String test = request.getRequestURI();
		System.out.println("test URL :"+test);
		return resourceService.getResource(test.split("resource")[1]);
	}
	
	@PostMapping(value = "/{type}/{name}" , consumes = {MediaType.TEXT_PLAIN_VALUE}, produces = {MediaType.TEXT_PLAIN_VALUE})
	public String addImage(@PathVariable String type, @PathVariable String name,@RequestBody String content) throws IOException {
		UIResource uiResource=new UIResource();
		uiResource.setFileContent(content);
		uiResource.setFileName(name);
		uiResource.setFolderName(type);
		resourceService.add(uiResource, new HashMap<String, List<String>>());
		return uiResource.getFileUrl();
	}
	

}