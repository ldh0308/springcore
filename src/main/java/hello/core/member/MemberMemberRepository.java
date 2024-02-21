package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemberMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>(); // store 객체 생성

    @Override
    public void save(Member member) {
        store.put(member.getId(), member); // member.getId 는 Long <key>, member <value>
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
