package study;

import java.util.Scanner;

public class Study_0310_DaumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오.
		 * 단, 점들의 배열은 모두 정렬되어있다고 가정한다.
		 * Ex)S={1,3,4,8,13,17,20}이 주어졌다면, 결과값은(3,4)가 될 것이다.
		 */
		Scanner sc = new Scanner(System.in); 
        int[] pointArray = new int[101]; 
        boolean setting = true; 
        int choose;

        while(setting) {
            System.out.println("************************************");
            System.out.println("*　1. 점 생성 　2. 점 목록 　3. 거리 계산　 *");
            System.out.println("************************************");
            choose = sc.nextInt();
            System.out.println("");

            if(choose == 1) {
                if(pointArray[1] == 0) {
                    System.out.println("NOTICE : 최대 100번째 수 까지 입력 가능합니다.");
                    System.out.println("NOTICE : 입력 취소를 원할 경우 '0'을 입력하세요.");
                    for(int pointNum = 1; pointNum <= 100; pointNum++) {
                        System.out.print(pointNum +"번째 수를 입력하세요 > ");
                        int inputNum = sc.nextInt();
                        if(inputNum == 0) {
                            break;
                        } else if(pointNum == 1 || pointArray[pointNum-1] < inputNum) {
                            pointArray[pointNum] = inputNum;
                        } else {
                            System.out.println("이전에 입력한 점의 수(" +pointArray[pointNum-1] +")보다 더 큰 수를 입력해야 합니다.");
                            pointNum--;
                        }
                    }
                    System.out.println("점 세팅을 완료합니다.");
                } else {
                System.out.println("이미 입력된 점(들)이 있기 때문에 프로그램 재가동이 필요합니다.");
                System.out.println("시스템을 종료합니다.");
                setting = false;
            }


            } else if(choose == 2) {
                for(int pointNum = 1; pointNum < 100; pointNum++) {
                    if(pointArray[pointNum] != 0) {
                        System.out.println(pointNum +"번째 점 : " +pointArray[pointNum]);
                    }
                }


            } else if(choose == 3) {
                System.out.println("점 거리 계산을 시작합니다.");
                System.out.println(".");
                int[] pointDistance = new int[100];
                for(int count = 1; count < 100; count++) {
                    if(pointArray[count + 1] != 0) {
                        pointDistance[count] = (pointArray[count + 1] - pointArray[count]);
                    }
                    }

                System.out.println("모든 점들 사이의 가장 가까운 거리들을 추출합니다.");
                System.out.println(".");
                int minDistance = pointDistance[1];
                for(int count = 2; count < 100; count++) {
                    if(minDistance > pointDistance[count]) {
                        if(pointDistance[count] != 0) {
                            minDistance = pointDistance[count];
                        }
                    }
                }

                System.out.println("가장 가까운 거리들의 쌍을 모두 출력합니다.");
                System.out.println(".");

                System.out.println("가장 가까운 거리:"+minDistance);

                for(int count = 1; count < 100; count++) {
                    if(minDistance == pointDistance[count]) {
                        System.out.println("(" +pointArray[count] +", " +pointArray[count+1] +")"); 
                    }
                }
                setting = false;

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

		
	}

}
