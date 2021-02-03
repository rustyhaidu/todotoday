package teamtreehouse.todotoday.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teamtreehouse.todotoday.model.Task;

@Repository
public interface TaskDao extends JpaRepository<Task, Long> {

}
