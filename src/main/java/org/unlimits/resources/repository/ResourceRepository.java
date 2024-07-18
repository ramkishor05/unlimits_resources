package org.unlimits.resources.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.resources.entities.EOResource;
import org.unlimits.rest.repository.CustomRepository;

@Repository
@Transactional
public interface ResourceRepository extends CustomRepository<EOResource, Long>{
	
}
