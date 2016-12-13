package com.fengtaiguang.photoalbum.application.service;

import java.util.List;

import com.fengtaiguang.ddd.framwork.application.service.IApplicationService;
import com.fengtaiguang.photoalbum.application.dto.AlbumDto;

public interface IAlbumApplicationService extends IApplicationService {

	public void save(AlbumDto albumDto);

	public void update(AlbumDto albumDto);

	public void delete(AlbumDto albumDto);

	public AlbumDto get(String albumId);

	public List<AlbumDto> findAll();

	public List<AlbumDto> findByName(String albumName);

	public void meger(AlbumDto newAlbum, AlbumDto... albums);

	public void sort(AlbumDto... albums);
}
