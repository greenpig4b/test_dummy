package shop.mtcoding.blog.job;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;


@RequiredArgsConstructor // final
@Repository
public class JobRepository {
    private EntityManager em;

//    public List<Job> SelectJobAll(){
//        Query query = em.createQuery("select * from job_tb order by id desc",Job.class);
//    }
}
