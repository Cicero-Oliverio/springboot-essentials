package br.com.devdojo.endpoint;

import static java.util.Arrays.asList;
import br.com.devdojo.util.DateUtil;
import br.com.devdojo.model.Student;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentEndpoint {

  @Autowired
  private DateUtil dateUtil;

  @RequestMapping(method = RequestMethod.GET, path = "/list")
  public List<Student> listAll() {

    dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now());
    return asList(new Student("Deku"), new Student("Todoroki"));
  }


}
