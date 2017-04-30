package pas.au.pivotal.pa.sct.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskTodaysDateApplication implements CommandLineRunner {

	private static final Log logger = LogFactory.getLog(SpringCloudTaskTodaysDateApplication.class);

	@Autowired
	private TaskRepository taskRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskTodaysDateApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		String execDate = new SimpleDateFormat().format(new Date());
		taskRepository.save(new TaskRun("Executed at " + execDate));
		logger.info("Executed at : " + execDate);
	}
}
