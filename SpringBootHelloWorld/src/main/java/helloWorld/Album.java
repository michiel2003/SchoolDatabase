package helloWorld;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Albums")
public class Album {
	
	@Id
	@Column
	private Integer Albumid;
	
	@Column
	private String Title;
	
	@Column
	private Integer Artistid;
	
	public Integer getAlbumId() {
		return Albumid;
	}

	public void setAlbumId(Integer albumId) {
		Albumid = albumId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Integer getArtistId() {
		return Artistid;
	}

	public void setArtistId(Integer artistId) {
		Artistid = artistId;
	}


}
