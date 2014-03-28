package com.hazelcast.client.executor.tasks;

import com.hazelcast.core.Member;
import com.hazelcast.core.MemberSelector;

class SimpleMemberSelector implements MemberSelector {
    @Override
    public boolean select(Member member) {
        return true;
    }
}