package ch10.review;

public class NetworkService04 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient02 client = new NetworkClient02(address);
        client.initError(data);  // hello, error01, error02
        String connectResult = client.connect(); //  연결실패하면 connectError 성공하면 success
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류코드 : " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류코드 : " + sendResult);
            }
        }
        client.disconnect();
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");

    }
}
