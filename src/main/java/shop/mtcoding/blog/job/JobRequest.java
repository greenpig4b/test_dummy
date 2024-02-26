package shop.mtcoding.blog.job;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

public class JobRequest {
    @Builder
    @Data
    public class JobselectDTO{
        private Integer id;
        private String title;
        private String content;
        private String career;
        private String edu;
        private String position;
        private String address;
        private String requiredSkill;
        private String companyName;
        private Date deadLine;
        private Timestamp createdAt;
    }

}
