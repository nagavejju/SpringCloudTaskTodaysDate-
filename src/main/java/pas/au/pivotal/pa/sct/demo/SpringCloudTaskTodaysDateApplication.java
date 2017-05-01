package pas.au.pivotal.pa.sct.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskTodaysDateApplication  {

	private static final Log logger = LogFactory.getLog(SpringCloudTaskTodaysDateApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskTodaysDateApplication.class, args);
	}
}
