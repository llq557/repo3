package edu.wlxy.ch02;
/*
 * ���̲μӼ������̴���
�����õ�һ�������μ���ʡ����ѧ��֯��1��������Ӫ
�����õڶ��������������ձʼǱ�����һ��
�����õ��������������ƶ�Ӳ��һ��
���򣬲����κν���

ʹ�ö�� if �������
 */
public class SwitchDemo1 {

	public static void main(String[] args) {
		//int mingCi = 99;  //����
		//char  mingCi='j';
		String mingCi="Ӣ��";
        switch (mingCi){ //mingCi������  int  char  String
            
//            case "�й�":
//                System.out.println("�ι���ʡ����ѧ�����ѧԺ��֯1��������Ӫ");
//               break;  //����  switch�ṹ�����θ��д���֮�����е�switch���
//            case "����":
//                System.out.println("����hp�ʼǱ�һ��");
//                break;
//            case "����":
//                System.out.println("�����ƶ�Ӳ��һ��");
//                break;
            default:     //ִ�г�case�о����֮���.default��λ��Ĭ�Ϸ���ĩβ
            	// default λ�ÿ�������ڷţ�������breakһ��ʹ�á�
            System.out.println("û���κν���");
               break;
        }
	}
}
