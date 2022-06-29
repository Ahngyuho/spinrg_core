package hello.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient  {
    //접속해야 할 서버 url
    private String url;



    public NetworkClient(){
        System.out.println("생성자 호출 ,url = " + url);

    }

    public void setUrl(String url){
        this.url = url;
    }

    public void connect(){
        System.out.println("connect: " + url);
    }

    public void call(String message){
        System.out.println("call: " +url +" message = " + message);
    }

    @PostConstruct
    public void init() {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }

    public void disConnect(){
        System.out.println("close + " + url);
    }

    @PreDestroy
    public void close(){
        System.out.println("close: " + url);
        disConnect();
    }

}
