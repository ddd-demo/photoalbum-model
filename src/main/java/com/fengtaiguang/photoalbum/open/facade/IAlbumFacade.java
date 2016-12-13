package com.fengtaiguang.photoalbum.open.facade;

import java.util.List;

import com.fengtaiguang.ddd.framwork.application.facade.IFacade;
import com.fengtaiguang.photoalbum.application.dto.AlbumDto;
import com.fengtaiguang.photoalbum.domain.entity.Album;

public interface IAlbumFacade extends IFacade {

	public void save(AlbumDto albumDto);

	public void update(AlbumDto albumDto);

	public void delete(AlbumDto albumDto);

	public AlbumDto get(String albumId);

	public List<AlbumDto> findAll();

	public List<AlbumDto> findByName(String albumName);

	public void meger(Album newAlbum, Album... albums);

	public void sort(Album... albums);
}
