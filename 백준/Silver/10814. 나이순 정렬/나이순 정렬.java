import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Member[] members = new Member[n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            members[i] = new Member(age, name, i);
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                if (m1.age == m2.age) {
                    return m1.index - m2.index;
                } else {
                    return m1.age - m2.age;
                }
            }
        });

        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }

    static class Member {
        int age;
        String name;
        int index;

        public Member(int age, String name, int index) {
            this.age = age;
            this.name = name;
            this.index = index;
        }
    }
}