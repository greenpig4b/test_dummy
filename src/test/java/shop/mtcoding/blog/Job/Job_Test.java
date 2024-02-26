package shop.mtcoding.blog.Job;


import jakarta.persistence.Query;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import shop.mtcoding.blog.job.Job;
import shop.mtcoding.blog.job.JobRepository;


import java.util.List;

@SpringBootTest
public class Job_Test {

    @Autowired
    private JobRepository jobRepository;

    @Test
    public void Job_test(){
    List<Job> jobList = jobRepository.SelectAll();
        for (Job result : jobList){
            System.out.println("-*-*-*-*-*-*-*-*-*");
            System.out.println(result.getId());
            System.out.println(result.getAddress());
            System.out.println(result.getCareer());
            System.out.println(result.getContent());
            System.out.println(result.getEdu());
            System.out.println(result.getTitle());
            System.out.println(result.getCompanyName());
            System.out.println(result.getDeadLine());
            System.out.println(result.getCreatedAt());
            System.out.println("-*-*-*-*-*-*-*-*-*");
        }
    }
}
