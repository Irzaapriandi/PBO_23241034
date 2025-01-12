package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // objek
        Member member1 = new Member("Saitama", 700_000);
        Member member2 = new Member("Kazuma", 300_000);

        nonMember nonMember1 = new nonMember("Naruto", 50_000);
        nonMember nonMember2 = new nonMember("Sengku", 230_000);

        member1.showDetailBelanja();
        member2.showDetailBelanja();

        nonMember1.showDetailBelanja();
        nonMember2.showDetailBelanja();

    }
}
