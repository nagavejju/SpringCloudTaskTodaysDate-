package pas.au.pivotal.pa.sct.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;

@EnableTask
@SpringBootApplication
public class SpringCloudTaskTodaysDateApplication  {

	private static final Log logger = LogFactory.getLog(SpringCloudTaskTodaysDateApplication.class);

	@Autowired
	private TaskRunRepository taskRunRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskTodaysDateApplication.class, args);
	}

	@PostConstruct
	public void init()
	{
		String execDate = new SimpleDateFormat().format(new Date());
		taskRunRepository.save(new TaskRunOutput("Executed at " + execDate));
		logger.info("Executed at : " + execDate);
	}

}
