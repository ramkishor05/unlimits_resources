package org.unlimits.resources.service;

import org.springframework.core.io.Resource;
import org.unlimits.resources.entities.EOResource;
import org.unlimits.resources.modal.UIResource;
import org.unlimits.rest.crud.service.CrudService;

public interface ResourceService extends CrudService<UIResource, EOResource, Long> {

	Resource getResource(String type, String url);

	/**
	 * @param url
	 * @return
	 */
	Resource getResource(String url);

}
