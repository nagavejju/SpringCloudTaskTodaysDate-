package pas.au.pivotal.pa.sct.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskTodaysDateApplication {

	private static final Log logger = LogFactory.getLog(SpringCloudTaskTodaysDateApplication.class);

	@Bean
	public CommandLineRunner commandLineRunner() {
		return strings ->
				logger.info("Executed at : " +
						new SimpleDateFormat().format(new Date()));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskTodaysDateApplication.class, args);
	}
}
