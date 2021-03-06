package com.google.smartcity.bean;

import java.util.ArrayList;
/**
 * ============================================================
 * Copyright：Google有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * 博客：     http://blog.csdn.net/axi295309066
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：SmartCity
 * Package_Name：com.google.smartcity
 * Version：1.0
 * time：2016/2/16 10:06
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class PhotosData {

	public int retcode;
	public PhotosInfo data;

	public class PhotosInfo {
		public String title;
		public ArrayList<PhotoInfo> news;
	}

	public class PhotoInfo {
		public String id;
		public String listimage;
		public String pubdate;
		public String title;
		public String type;
		public String url;
	}
}
