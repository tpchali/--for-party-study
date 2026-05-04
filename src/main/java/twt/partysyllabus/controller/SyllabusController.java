package twt.partysyllabus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import twt.partysyllabus.service.SService;

import java.util.Map;

@RestController
@RequestMapping("/syllabus")
public class SyllabusController {
    @Autowired
    private SService sService;


    @GetMapping("/title")
    public Map<Integer, String> getTitle() {
        return sService.getTitle();
    }

    @GetMapping("/answer")
    public String getAnswer(Integer id) {
        return sService.getAnswer(id);
    }
    @PutMapping("/addwrongTime")
    public String addWrongTime(Integer id) {
        return sService.addWrongTime(id);
    }
    @GetMapping("/wrongTime")
    public String getWrongTime(Integer id) {
        return sService.getWrongTime(id);
    }
    @PutMapping("/adderrorplace")
    public String addErrorPlace(Integer id,String content) {
        return sService.addErrorPlace(id,content);
    }
    @GetMapping("/errorplace")
    public String getErrorPlace(Integer id) {
        return sService.getErrorPlace(id);
    }

}
