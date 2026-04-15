package ch06.sender;

public class SendTest {
    static void main() {
        Sender [] senders = {new EmailSender(), new SmsSender(), new KakaoSender()};
        for(Sender sender: senders){
            sender.sendMessage("가입을 축하합니다.");
        }
    }
    //메일을 발송합니다. 가입을 축하합니다.
    //문자를 발송합니다. 가입을 축하합니다.
    //카카오 메세지를 발송합니다. 가입을 축하합니다.





}
