package shop.mtcoding.blog.job;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class JobRequest {

    @Data
    public class JobselectDTO{
        private Integer id;
        private String title;
        private String content;
        private String career;
        private String edu;
        private String position;
        private String address;
        private List<JobSkillDTO> requiredSkill;
        private String companyName;
        private Date deadLine;
        private Timestamp createdAt;
    }

    @Data
    public class JobSkillDTO{
        private String name;
    }

}
