package com.flab;

public class Prototype {
    public static void main(String[] args) {

        /** 
         * 임시
         * */
        Member member = new Member();
        Item item = new Item();
        Seller seller = new Seller();
        Buyer buyer = new Buyer();

        /**
         * 기본기능
         * */
        // 회원가입
        member.join();

        //추천 리스트 보여주기
        member.recommendList();

        // 상품 리스트 보여주기
        member.viewItemList();

        // 회원만 이용 가능
        if(member == null) {
            member.goLogin();
        }

        /**
         * 판매자
         * */
        // 판매자 등록
        Seller.register(item);

        /**
         * 구매자
         * */
        String tempItemNo = "ssd123";
        // 찜하기
        buyer.zzim(tempItemNo);

        // 연락하기
        buyer.sendMessage(tempItemNo);

        // 택배배송
        buyer.courierServiceBuy(tempItemNo);

        // 직거래
        buyer.directTransaction(tempItemNo);

    }
}

