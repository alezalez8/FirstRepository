package aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

/*
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
                "списка студентов перед методом getStudents");
    }
*/

    /*@AfterReturning(pointcut = "execution(* getStudents())",
            returning = "students")
    public void afterGetStudentsLoggingAdvice(JoinPoint joinPoint, List<Student> students) {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        // System.out.println(signature.getName());
        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);
        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);


        System.out.println("afterGetStudentsLoggingAdvice: логируем получение " +
                "списка студентов после метода getStudents");
    }*/
/*
    @AfterThrowing(pointcut = "execution(* getStudents())",
    throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс " +
                "исключение  " + exception);
    }
*/

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное завершение или исключение метода");

    }
}
