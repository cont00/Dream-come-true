import javax.swing.JOptionPane;

public class ManagerStudent
{
	public static void main(String[] args)
	{
		Student stu_ary[] = new Student[19];
		Student student = new Student();

		while(true)
		{
			String num = JOptionPane.showInputDialog
					("1번 학생정보입력\n2번 학생정보출력\n3번 학생정보수정\n4번 프로그램 종료\n\n실행할 번호를 입력해주세요");
			
			if (Integer.parseInt(num) == 1)
			{
				String name = JOptionPane.showInputDialog("이름을 입력해주세요");
				String kor = JOptionPane.showInputDialog("국어 성적을 입력해주세요");
				String math = JOptionPane.showInputDialog("수학 성적을 입력해주세요");
				String eng = JOptionPane.showInputDialog("영어 성적을 입력해주세요");
				
				student.name = name;
				student.kor = Integer.parseInt(kor);
				student.math = Integer.parseInt(math);
				student.eng = Integer.parseInt(eng);
				student.avg = (student.kor + student.math + student.eng) / 3;
			}
			else if (Integer.parseInt(num) == 2)
			{
				System.out.println("이름 : " + student.name);
				System.out.print("국어점수 : " + student.kor + 
								"\t수학점수 : " + student.math +
								"\t영어점수 : " + student.eng + "\n");
				System.out.println("평균 : " + student.avg);
			}
			else if (Integer.parseInt(num) == 3)
			{
				String name = JOptionPane.showInputDialog("이름을 입력해주세요");
				
				student.name = name;
				student.kor = 0;
				student.math = 0;
				student.eng = 0;
				student.avg = (student.kor + student.math + student.eng) / 3;
			}
			else
			{
				System.exit(1);
			}
		}
	}
}