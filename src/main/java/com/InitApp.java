package com;

import com.jfinal.core.JFinal;

public class InitApp {

	public static void main(String[] args) {
		// TODO 有待调试，以jar包的形式运行

		JFinal.start("src/main/webapp", 80, "/", 5);
	}

}
