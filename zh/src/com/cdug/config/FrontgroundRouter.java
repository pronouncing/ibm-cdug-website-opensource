package com.cdug.config;

import com.cdug.controller.AboutController;
import com.cdug.controller.CommonController;
import com.cdug.controller.DownloadController;
import com.cdug.controller.HistoryController;
import com.cdug.controller.MaterialController;
import com.cdug.controller.NewsController;
import com.cdug.controller.NoticeController;
import com.jfinal.config.Routes;

public class FrontgroundRouter extends Routes{
	public void config(){
		add("/", CommonController.class);
		add("/news",NewsController.class);
		add("/notice",NoticeController.class);
		add("/material",MaterialController.class);
		add("/about",AboutController.class);
		add("/history",HistoryController.class);
		add("/download",DownloadController.class);
	}
}
