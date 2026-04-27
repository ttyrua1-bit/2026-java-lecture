package ch10.exception.ex03;

public class NetworkClient02 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClient02(String address) {
        this.address = address;
    }
    public void connect() throws ConnectException02 {
        if(connectError) {
            throw new ConnectException02(address,address+" 서버 연결실패");
        }
        //연결 성공
        System.out.println(address+" 서버 연결 성공");
    }
    public void send(String data) throws SendException02 {
        if(sendError) {
            throw new SendException02(data,address+" 서버에 데이터 전송 실패 : "+data);
        }
        // 전송 성공
        System.out.println(address+" 서버에 데이터 전송 : "+data);

    }
    public void disconnect() {
        System.out.println(address+" 서버 연결 해제");
    }
    public void initError(String data) {
        if(data.contains("error01")) {
            connectError = true;
        }
        if(data.contains("error02")){
            sendError=true;
        }
    }
}
