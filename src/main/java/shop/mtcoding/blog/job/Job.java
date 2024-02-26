package shop.mtcoding.blog.job;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Table(name="job_tb")
@Data
@Entity // 테이블 생성하기 위해 필요한 어노테이션
public class Job<T> {
    @Id // PK 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Integer id;
    private String title;
    private String content;
    private String career;
    private String edu;
    private String position;
    private String address;
    private  T requiredSkill;
    private Date deadLine;
    private Timestamp createdAt;
}
