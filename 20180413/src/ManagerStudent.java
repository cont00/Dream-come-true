import javax.swing.JOptionPane;
import com.cont00.org.Student;

public class ManagerStudent
{
	public static void main(String[] args)
	{
		Student[] student = new Student[20];
		for (int i = 1; i < student.length; i++)
		{
			student[i] = new Student();
		}
		
		int cnt = 1;
		while(true)
		{
			String num = JOptionPane.showInputDialog
					("1번 학생정보입력\n2번 학생정보출력\n3번 학생정보수정\n"
							+ "4번 학생정보삭제\n5번 프로그램 종료\n\n실행할 번호를 입력해주세요");
			
			if (Integer.parseInt(num) == 1)
			{
				String name = JOptionPane.showInputDialog("이름을 입력해주세요");
				String kor = JOptionPane.showInputDialog("국어성적을 입력해주세요");
				String math = JOptionPane.showInputDialog("수학성적을 입력해주세요");
				String eng = JOptionPane.showInputDialog("영어성적을 입력해주세요");
				
				student[cnt].name = name;
				student[cnt].kor = Integer.parseInt(kor);
				student[cnt].math = Integer.parseInt(math);
				student[cnt].eng = Integer.parseInt(eng);
				student[cnt].avg = (student[cnt].kor + student[cnt].math + student[cnt].eng) / 3;
				cnt++;
			}
			else if (Integer.parseInt(num) == 2)
			{
				for (int i = 1; i < student.length; i++)
				{
					System.out.print(i + "번째 " + "학생이름 : " + student[i].name + "  ");
					System.out.print("국어점수 : " + student[i].kor + "  ");
					System.out.print("수학점수 : " + student[i].math + "  ");
					System.out.print("영어점수 : " + student[i].eng + "  ");
					System.out.print("평균 : " + student[i].avg + "\n");
				}
			}
			else if (Integer.parseInt(num) == 3)
			{
				String attendance = JOptionPane.showInputDialog("수정해야 할 학생의 번호를 입력해주세요");
				String name = JOptionPane.showInputDialog("수정해야 할 학생의 이름을 입력해주세요");
				String kor = JOptionPane.showInputDialog("수정해야 할 국어성적을 입력해주세요");
				String math = JOptionPane.showInputDialog("수정해야 할 수학성적을 입력해주세요");
				String eng = JOptionPane.showInputDialog("수정해야 할 영어성적을 입력해주세요");
				
				int num1 = Integer.parseInt(attendance);
				
				for (int i = 1; i < student.length; i++)
				{
					student[num1].name = name;
					student[num1].kor = Integer.parseInt(kor);
					student[num1].math = Integer.parseInt(math);
					student[num1].eng = Integer.parseInt(eng);
					student[num1].avg = 
							(student[num1].kor + student[num1].math + student[num1].eng) / 3;
				}
			}
			else if (Integer.parseInt(num) == 4)
			{
				String name = JOptionPane.showInputDialog("성적수정을 해야 할 학생의 출석번호를 입력해주세요");
				int num1 = Integer.parseInt(name);
				
				for (int i = 1; i < student.length; i++)
				{
					if (i == num1)
					student[num1].name = null;
					student[num1].kor = 0;
					student[num1].math = 0;
					student[num1].eng = 0;
					student[num1].avg =
							(student[num1].kor + student[num1].math + student[num1].eng) / 3;
				}
			}
			else
			{
				System.exit(1);
			}
		}
	}
}