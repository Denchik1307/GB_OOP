package homework_third.controller;

import homework_third.data.*;
import homework_third.service.DataService;
import homework_third.service.PotokService;
import homework_third.service.StudentGroupService;
import homework_third.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();
    private final PotokService potokService = new PotokService();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }

    public void createFlow(List<StudentGroup> groups){
        potokService.createPotokService(groups);
    }

    public List<Potok> getSortedFlowsByGroupCount(List<Potok> potokList){
        return potokService.sortBySize(potokList);
    }


}
