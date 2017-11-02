package com.yuqiyu.chapter33;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter33Application {

	public static void main(String[] args) {
		/**
		 * 隐藏banner启动方式
		 */
		SpringApplication springApplication = new SpringApplication(Chapter33Application.class);
		//设置banner的模式为隐藏
		springApplication.setBannerMode(Banner.Mode.CONSOLE);
		//启动springboot应用程序
		springApplication.run(args);

		//原启动方式
		/*SpringApplication.run(Chapter33Application.class, args);*/
	}
}
