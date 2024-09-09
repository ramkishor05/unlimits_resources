package org.unlimits.resource.mapper;
import static org.unlimits.resource.constants.Constants.APP_RESOURCE_PACKAGE_IMPL;
import static org.unlimits.resource.constants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.unlimits.resource.entities.EOResource;
import org.unlimits.resource.modal.UIResource;
import org.unlimits.rest.crud.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = APP_RESOURCE_PACKAGE_IMPL)
public interface ResourceMapper  extends GenericMapper<EOResource, UIResource>{

}
