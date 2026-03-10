package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.constants.Env;
import com.google.gson.Gson;
import com.ui.pojo.Config;
import com.ui.pojo.Environment;

public class JsonUtility {

	public static String readJSON(Env env) {
		// TODO Auto-generated method stub
		Gson javaGson = new Gson();
		File jsonFile = new File(System.getProperty("user.dir") +"\\config\\config.json");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(jsonFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Config config = javaGson.fromJson(fileReader, Config.class);
		Environment environment = config.getEnvironments().get(env.name());
		System.out.println(environment.getUrl());
		return environment.getUrl();
		

	}

}
