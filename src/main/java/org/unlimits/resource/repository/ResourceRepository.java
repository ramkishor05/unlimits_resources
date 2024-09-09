package org.unlimits.resource.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.resource.entities.EOResource;
import org.unlimits.rest.repository.CustomRepository;

@Repository
@Transactional
public interface ResourceRepository extends CustomRepository<EOResource, Long>{
	
}
