package fr.test.application;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();
		InputStream inputStream = null;

		inputStream = App.class.getResourceAsStream("/info.properties");

		properties.load(inputStream);

		String appName = properties.getProperty("fr.test.application.App.name");
		String appVersion = properties.getProperty("fr.test.application.App.version");
		String appProfile = properties.getProperty("fr.test.application.App.profile");
		String appTimestamp = properties.getProperty("fr.test.application.App.timestamp");

		System.out.println(
				"Start " + appName + " " + appVersion + " in profile " + appProfile + " [" + appTimestamp + "]");

	}

}
