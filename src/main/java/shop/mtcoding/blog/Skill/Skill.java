package shop.mtcoding.blog.Skill;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="skill_tb")
@Data
@Entity // 테이블 생성하기 위해 필요한 어노테이션
public class Skill {
    @Id // PK 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Integer id;
    private String name;
}
