package pas.au.pivotal.pa.sct.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <TaskRun, Long>
{
}
