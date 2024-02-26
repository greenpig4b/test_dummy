package shop.mtcoding.blog.Skill;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import shop.mtcoding.blog.job.Job;
import shop.mtcoding.blog.job.JobRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class Skill_Test {

    @Autowired
    private JobRepository jobRepository;

    @Test
    public void skill_test(){
//        List<Job> jobList = jobRepository.SelectAll();
//
//        for (Job job : jobList){
//            List<SkillRequest.SkillListDTO> skillList = new ArrayList<>();
//            for (String skill: job.getRequiredSkill().split(",")){
//                skillList.add(SkillRequest.SkillListDTO.builder().name(skill).build());
//            }
//            System.out.println(skillList);
//        }
//        List<Job> jobList = jobRepository.SelectJobAll();
//        List<JobResponse> viewDtos = jobList.stream().map(job -> {
//            List<Skill> skills = Arrays.stream(job.getRequiredSkill().split(","))
//                    .map(skillName -> Skill.builder().name(skillName).build())
//                    .collect(Collectors.toList());
//
//            return JobResponse.builder()
//                    .id(job.getId())
//                    .title(job.getTitle())
//                    .content(job.getContent())
//                    .career(job.getCareer())
//                    .edu(job.getEdu())
//                    .position(job.getPosition())
//                    .address(job.getAddress())
//                    .requiredSkill(skills)
//                    .deadLine(job.getDeadLine())
//                    .createdAt(job.getCreatedAt())
//                    .build();
//        }).collect(Collectors.toList());
    }
}
