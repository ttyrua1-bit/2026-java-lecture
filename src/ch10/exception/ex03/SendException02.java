package ch10.exception.ex03;

public class SendException02 extends NetworkClientException02 {
    private final String sendData;

    public SendException02(String sendData,String message) {
        super(message);
        this.sendData=sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
