package shop.mtcoding.blog.Job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import shop.mtcoding.blog.job.Job;
import shop.mtcoding.blog.job.JobRepository;
import shop.mtcoding.blog.job.JobRequest;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
public class Skill_Test {
    @Autowired
    private JobRepository jobRepository;

    List<Job> jobList = jobRepository.SelectAll();


}
