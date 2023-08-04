package org.bmit.poclocationwebproject.dal.repos;

import java.util.List;

import org.bmit.poclocationwebproject.dal.entites.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
	
	@Query(value = "select type,count(type) from poc_location group by type",nativeQuery = true)
	List<Object[]> findTypeAndTypeCount();

}
