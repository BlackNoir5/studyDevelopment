// tip: each public class is put in its own file
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();

        Student s1 = new Student("Lee");

        s1.addSubject("국어", 100);
        s1.addSubject("수학", 50);

        studentList.add(s1);

        Student s2 = new Student("Kim");

        s2.addSubject("국어", 70);
        s2.addSubject("수학", 85);
        s2.addSubject("영어",100);

        studentList.add(s2);

        for(Student s : studentList){
            int sum = 0;

            System.out.print(s.getName()+"학생은");
            for(Subject sub : s.subjectList){
                int score = sub.getScore();
                 System.out.print(sub.getName()+" "+score+"점 ");
                 sum+=score;
            }
            System.out.println("입니다.");
            System.out.println("총점은 "+sum+"입니다.");
            System.out.println("");
        }

	}
}

/*
    1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다. 
    Lee 학생은 국어와 수학 2과목을 수강했고, Kim 학생은 국어, 수학, 영어 3 과목을 수강하였습니다.
    Lee 학생은 국어 100점, 수학 50점입니다. 
    Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다. 
    Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요 
*/
