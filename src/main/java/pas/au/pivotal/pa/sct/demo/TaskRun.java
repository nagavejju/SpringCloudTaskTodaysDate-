package pas.au.pivotal.pa.sct.demo;

import javax.persistence.*;

@Entity
@Table (name = "TASKRUN")
public class TaskRun
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String output;

    public TaskRun()
    {
    }

    public TaskRun(String output) {
        this.output = output;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "TaskRun{" +
                "id=" + id +
                ", output='" + output + '\'' +
                '}';
    }
}
