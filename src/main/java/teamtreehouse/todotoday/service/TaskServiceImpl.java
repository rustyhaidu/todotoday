package teamtreehouse.todotoday.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teamtreehouse.todotoday.dao.TaskDao;
import teamtreehouse.todotoday.model.Task;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public Iterable<Task> findAll() {
        return taskDao.findAll();
    }

    @Override
    public Task findOne(Long id) {
        return taskDao.findById(id).get();
    }

    @Override
    public void toggleComplete(Long id) {
        Task task = taskDao.findById(id).get();
        task.setComplete(!task.isComplete());
        taskDao.save(task);
    }

    @Override
    public void save(Task task) {
        taskDao.save(task);
    }
}
