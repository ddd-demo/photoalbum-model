package com.fengtaiguang.photoalbum.domain.service;

import java.util.List;

import com.fengtaiguang.ddd.framwork.domain.service.IDomainService;
import com.fengtaiguang.photoalbum.domain.entity.Album;

public interface IAlbumDomainService extends IDomainService {

	public void sort(Album... albums);

	public void meger(Album newAlbum, Album... albums);

	public List<Album> findAll();

	public Album findById(String id);

}
