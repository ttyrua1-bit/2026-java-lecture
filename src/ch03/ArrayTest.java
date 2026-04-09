package ch03;

public class ArrayTest {
    static void main() {
        //array 배열 :번호매기기

        int nums[] = new int[5];
        //int []nums =new int[5] 처럼 앞에 와도됨.

        nums[0] = 10;   //배열은 0에서 부터 시작한다. 배열은 확장이 안된다.
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 45;
        nums[4] = 27;

        for(int i=0;i< nums.length;i++){   //.length   배열의 개수 자동으로 입력
            System.out.println(nums[i]);
        }


        String [] names = {"장동건","전지현","송혜교"};    //생성과 동시에 값을 넣고 싶다면 이렇게하기
        String [] actors = names;   //sharrow copy
        actors[0] = "하지원";
        names[1] = "김숙";
        for(int i = 0;i< names.length;i++){
            System.out.println(names[i]+"==="+actors[i]);
        }
        //배열은 레퍼런스(참조)타입이다. 주소값 내용 공유한다.
        //주소값만 복사해서 쓰는걸 sharrow coppy 얕은 복사라하고
        //기본타입은 완전복사고(아래코드)
        int a = 10;
        int b = a;
        a = 30;
        System.out.println(a+ "==="+ b);

    //   for(int i=0;i< names.length;i++){
    //      System.out.println(names[i]);
    //    }





    }
}
