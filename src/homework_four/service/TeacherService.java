package homework_four.service;

import homework_four.data.Teacher;

import java.util.*;

public class TeacherService implements UserService<Teacher> {

    List<Teacher> teacherList;

    public TeacherService() {
        this.teacherList = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        Long maxId = 0L;

        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherId() > maxId) {
                maxId = teacher.getTeacherId();
            }
        }

        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, ++maxId);
        teacherList.add(teacher);
    }

    public Teacher select(Long teacherId) {
        Teacher teacher = null;
        for (Teacher tmp : teacherList) {
            if (tmp.getTeacherId().equals(teacherId)) {
                teacher = tmp;
            }
        }
        if (teacher == null) {
            System.out.println(teacherId + " teacher ID not found");
        }
        return teacher;
    }

    public void editTeacher(Long teacherId) {
        Teacher teacher = select(teacherId);
        Map<String,String> params = new HashMap<>();
        params.put("firstName","");
        params.put("secondName","");
        params.put("patronymic","");
        params.put("dateOfBirth","");
        Scanner scanner = new Scanner(System.in);

        for (String parameter:params.keySet()){
            System.out.println("Input new " + parameter + " or \"no\" if not change");
            String tmp = scanner.next();
            if (!tmp.equals("no")){
                switch (parameter){
                    case "firstName"->teacher.setFirstName(tmp);
                    case "secondName"->teacher.setSecondName(tmp);
                    case "patronymic"->teacher.setPatronymic(tmp);
                    case "dateOfBirth"->teacher.setDateOfBirth(tmp);
                }
            }
        }
        System.out.println(teacher.toString());
    }

}
