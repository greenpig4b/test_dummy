package shop.mtcoding.blog.Skill;

import lombok.Builder;
import lombok.Data;

public class SkillRequest {
    @Builder
    @Data
    public class SkillListDTO{
        private String name;

    }
}
