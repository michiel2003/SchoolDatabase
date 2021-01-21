package helloWorld;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AlbumRepository extends CrudRepository<Album, Integer>{
	
	@Query(value = "Select Albums.Title from Albums", nativeQuery = true)
	Iterable<Album> getAllAlbums();
	
	 @Query("select a.Title from Albums a where a.Title like %?1%")
	 Iterable<Album> findByTileContains(@Param("Title") String Title);

}
	