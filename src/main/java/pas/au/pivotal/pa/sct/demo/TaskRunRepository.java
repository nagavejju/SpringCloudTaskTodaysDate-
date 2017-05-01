package pas.au.pivotal.pa.sct.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRunRepository extends JpaRepository <TaskRunOutput, Long>
{
}
