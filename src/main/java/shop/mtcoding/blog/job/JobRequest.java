package shop.mtcoding.blog.job;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class JobRequest {

    @Data
    public class JobResponseDTO{
        private Integer id;
        private String title;
        private String content;
        private String career;//
        private String edu; //
        private String position;//
        private String address; //
        private String companyName;
        private Date deadLine; //
        private Timestamp createdAt; //
        private List<Skill> requiredSkill; //

        public JobResponseDTO(Integer id, String title, String content, String career, String edu, String position, String address, String companyName, Date deadLine, Timestamp createdAt, List<Skill> requiredSkill) {
            this.id = id;
            this.title = title;
            this.content = content;
            this.career = career;
            this.edu = edu;
            this.position = position;
            this.address = address;
            this.companyName = companyName;
            this.deadLine = deadLine;
            this.createdAt = createdAt;
            this.requiredSkill = requiredSkill;
        }

    }
    @Data
    public class Skill {
        private String name;

    }

}
