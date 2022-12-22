package com.hasun.study_servlets.poll;

import java.util.ArrayList;
import java.util.HashMap;

public class PollDatasInfor {
    public HashMap<String, Object> getOrders(){
        HashMap<String, Object> orders = new HashMap<>();
        orders.put("orders1", 1);
        orders.put("orders2", 2);
        orders.put("orders3", 3);
        orders.put("orders4", 4);
        orders.put("orders5", 5);
        return orders;
    }

    public ArrayList<String> getQuestions(){
        ArrayList<String> questions = new ArrayList<String>();
        questions.add("해당 매장을 방문시 매장은 청결 하였습니까?");
        questions.add("주문시 직원은 고객님께 친절 하였습니까?");
        questions.add("주문하신 음료가 나오기까지 시간이 적당하였습니까?");
        questions.add("직원이 제조한 음료에 대해 맛은 좋았습니까?");
        questions.add("해당 매장을 다음에도 재방문 하실 의향이 있으십니까?");
        return questions;
    }

    public ArrayList<String> getExamples(){
        ArrayList<String> examples = new ArrayList<String>();
        examples.add("전혀 아니다");
        examples.add("아니다");
        examples.add("보통이다");
        examples.add("그렇다");
        examples.add("매우 그렇다");
        return examples;
    }
}
