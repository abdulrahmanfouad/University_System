package com.university.Entities;

public class StudentCard {

    private Integer id;
    private Long cardNumber;

    public StudentCard() {
    }

    public StudentCard(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public StudentCard(Integer id, Long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }
}
