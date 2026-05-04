package ch12.member;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataMemberRepository implements MemberRepository {
    private static final String FILE_PATH = "temp/members-data.txt";
    @Override
    public void add(Member member) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(FILE_PATH,true));
            dataOutputStream.writeUTF(member.getId());
            dataOutputStream.writeUTF(member.getName());
            dataOutputStream.writeInt(member.getAge());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Member> findAll() {
        List<Member> members = new ArrayList<>();
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(FILE_PATH));
            while(dataInputStream.available()>0){
                Member member = new Member(dataInputStream.readUTF(),dataInputStream.readUTF(),dataInputStream.readInt());
                members.add(member);
            }
            return members;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
