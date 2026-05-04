package twt.partysyllabus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twt.partysyllabus.mapper.SMapper;
import twt.partysyllabus.pojo.Question;
import twt.partysyllabus.service.SService;

import java.util.Map;
@Service
public class ServiceImpl implements SService {
    @Autowired
    SMapper sMapper;


    @Override
    public Map<Integer, String> getTitle() {
        Question question = new Question();
        question = sMapper.getTitle();
        return Map.of(question.getId(), question.getTitle());
    }

    @Override
    public String getAnswer(Integer id) {
        return sMapper.getAnswer(id);
    }

    @Override
    public String addWrongTime(Integer id) {
        sMapper.addWrongTime(id);
        return "success";
    }

    @Override
    public String getWrongTime(Integer id) {
        return sMapper.getWrongTime(id);
    }

    @Override
    public String addErrorPlace(Integer id, String content) {
        sMapper.addErrorPlace(id, content);
        return "success";
    }

    @Override
    public String getErrorPlace(Integer id) {
        return sMapper.getErrorPlace(id);
    }
}
