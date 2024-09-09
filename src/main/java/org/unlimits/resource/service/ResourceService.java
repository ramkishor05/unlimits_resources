package org.unlimits.resource.service;

import org.springframework.core.io.Resource;
import org.unlimits.resource.entities.EOResource;
import org.unlimits.resource.modal.UIResource;
import org.unlimits.rest.crud.service.CrudService;

public interface ResourceService extends CrudService<UIResource, EOResource, Long> {

	Resource getResource(String type, String url);

	/**
	 * @param url
	 * @return
	 */
	Resource getResource(String url);

}
