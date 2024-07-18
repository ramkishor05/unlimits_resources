package org.unlimits.resources.mapper;
import static org.unlimits.resources.constants.Constants.SPRING;
import static org.unlimits.resources.constants.Constants.APP_RESOURCE_PACKAGE_IMPL;

import org.mapstruct.Mapper;
import org.unlimits.resources.entities.EOResource;
import org.unlimits.resources.modal.UIResource;
import org.unlimits.rest.crud.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = APP_RESOURCE_PACKAGE_IMPL)
public interface ResourceMapper  extends GenericMapper<EOResource, UIResource>{

}
