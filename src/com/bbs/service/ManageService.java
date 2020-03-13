package com.bbs.service;

import java.util.List;

import com.bbs.dao.ManageDao;
import com.bbs.pojo.Plate;

public class ManageService {
	// 创建一个ManageDao 对象
	private ManageDao manageDao = new ManageDao();
	/**
	 * 添加新的板块
	 * @param plate
	 * @return 成功返回新添加的Plate对象 失败返回null
	 */
	public Plate addPlate(Plate plate) {
		return manageDao.addPlate(plate);
	}
	/**
	 * 获取所有版块的列表
	 * @return 获取到的所有版块列表信息
	 */
	public List<Plate> listPlates(){
		return manageDao.listPlates();
	}
	/**
	 * 根据plateId删除对应的版块
	 * @param plateId
	 * @return 成功返回1，失败返回0
	 */
	public int deleteplateId(Integer plateId) {
		return manageDao.deleteplateId(plateId);
	}
}
