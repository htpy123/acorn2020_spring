package com.gura.spring05.file.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring05.file.dao.FileDao;

@Repository
public class FileServiceImpl implements FileService{
	@Autowired
	private FileDao fileDao;
}
