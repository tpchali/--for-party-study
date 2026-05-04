package twt.partysyllabus.service;

import java.util.Map;

public interface SService {
    Map<Integer, String> getTitle();

    String getAnswer(Integer id);

    String addWrongTime(Integer id);

    String getWrongTime(Integer id);

    String addErrorPlace(Integer id, String content);

    String getErrorPlace(Integer id);
}
