package com.fengtaiguang.photoalbum.application.adaper;

import java.util.List;

import com.fengtaiguang.ddd.framwork.application.adaper.IAdaper;
import com.fengtaiguang.photoalbum.application.dto.AlbumDto;
import com.fengtaiguang.photoalbum.domain.entity.Album;

public interface IAlbumAdaper extends IAdaper {

	public Album toAlbum(AlbumDto albumDto);

	public AlbumDto toAlbumDto(Album album);

	public List<AlbumDto> toAlbumDtoList(List<Album> albumList);

}
