package hello.core.singleton;


//싱글톤
public class SingletonService {
    private static final SingletonService instance = new SingletonService();
    //자기 자신을 내부에 private 으로 static으로 들고있음
    //jvm실행될 때 자기 자신을 생성해서 참조

    //조회
    public static SingletonService getInstance(){
        return instance;
    }

    //private 생성자
    private SingletonService(){

    }

    public void logic(){
        System.out.println(" 싱글톤 객체 로직 호출 ");
   }


}
