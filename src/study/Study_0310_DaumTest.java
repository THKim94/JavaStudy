package study;

import java.util.Scanner;

public class Study_0310_DaumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1������ ������ �־����� ��, �� �� ���� �Ÿ��� ª�� ���� ���� ����ϴ� �Լ��� �ۼ��Ͻÿ�.
		 * ��, ������ �迭�� ��� ���ĵǾ��ִٰ� �����Ѵ�.
		 * Ex)S={1,3,4,8,13,17,20}�� �־����ٸ�, �������(3,4)�� �� ���̴�.
		 */
		Scanner sc = new Scanner(System.in); 
        int[] pointArray = new int[101]; 
        boolean setting = true; 
        int choose;

        while(setting) {
            System.out.println("************************************");
            System.out.println("*��1. �� ���� ��2. �� ��� ��3. �Ÿ� ��ꡡ *");
            System.out.println("************************************");
            choose = sc.nextInt();
            System.out.println("");

            if(choose == 1) {
                if(pointArray[1] == 0) {
                    System.out.println("NOTICE : �ִ� 100��° �� ���� �Է� �����մϴ�.");
                    System.out.println("NOTICE : �Է� ��Ҹ� ���� ��� '0'�� �Է��ϼ���.");
                    for(int pointNum = 1; pointNum <= 100; pointNum++) {
                        System.out.print(pointNum +"��° ���� �Է��ϼ��� > ");
                        int inputNum = sc.nextInt();
                        if(inputNum == 0) {
                            break;
                        } else if(pointNum == 1 || pointArray[pointNum-1] < inputNum) {
                            pointArray[pointNum] = inputNum;
                        } else {
                            System.out.println("������ �Է��� ���� ��(" +pointArray[pointNum-1] +")���� �� ū ���� �Է��ؾ� �մϴ�.");
                            pointNum--;
                        }
                    }
                    System.out.println("�� ������ �Ϸ��մϴ�.");
                } else {
                System.out.println("�̹� �Էµ� ��(��)�� �ֱ� ������ ���α׷� �簡���� �ʿ��մϴ�.");
                System.out.println("�ý����� �����մϴ�.");
                setting = false;
            }


            } else if(choose == 2) {
                for(int pointNum = 1; pointNum < 100; pointNum++) {
                    if(pointArray[pointNum] != 0) {
                        System.out.println(pointNum +"��° �� : " +pointArray[pointNum]);
                    }
                }


            } else if(choose == 3) {
                System.out.println("�� �Ÿ� ����� �����մϴ�.");
                System.out.println(".");
                int[] pointDistance = new int[100];
                for(int count = 1; count < 100; count++) {
                    if(pointArray[count + 1] != 0) {
                        pointDistance[count] = (pointArray[count + 1] - pointArray[count]);
                    }
                    }

                System.out.println("��� ���� ������ ���� ����� �Ÿ����� �����մϴ�.");
                System.out.println(".");
                int minDistance = pointDistance[1];
                for(int count = 2; count < 100; count++) {
                    if(minDistance > pointDistance[count]) {
                        if(pointDistance[count] != 0) {
                            minDistance = pointDistance[count];
                        }
                    }
                }

                System.out.println("���� ����� �Ÿ����� ���� ��� ����մϴ�.");
                System.out.println(".");

                System.out.println("���� ����� �Ÿ�:"+minDistance);

                for(int count = 1; count < 100; count++) {
                    if(minDistance == pointDistance[count]) {
                        System.out.println("(" +pointArray[count] +", " +pointArray[count+1] +")"); 
                    }
                }
                setting = false;

            } else {
                System.out.println("�߸��� �Է��Դϴ�.");
            }
        }

		
	}

}
