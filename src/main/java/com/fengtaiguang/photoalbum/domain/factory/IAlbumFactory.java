package com.fengtaiguang.photoalbum.domain.factory;

import com.fengtaiguang.ddd.framwork.domain.factory.IDomainFactory;
import com.fengtaiguang.photoalbum.domain.entity.Album;

public interface IAlbumFactory extends IDomainFactory {

	public  Album createAlbum();
	
}
