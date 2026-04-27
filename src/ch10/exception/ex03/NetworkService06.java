package ch10.exception.ex03;

public class NetworkService06 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient02 networkClient02 = new NetworkClient02(address);
        networkClient02.initError(data);
        try {
            //정상흐름
            networkClient02.connect(); //success
            networkClient02.send(data);
        } catch (ConnectException02 e) {
            System.out.println("[연결오류] 주소 : " + e.getAddress() + ",메세지 : " + e.getMessage());
        } catch (SendException02 e) {
            System.out.println("[전송오류] 전송데이터 : " + e.getSendData() + ",메세지 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메세지 : "+e.getMessage());
        } finally {
            networkClient02.disconnect();
        }
    }
}
