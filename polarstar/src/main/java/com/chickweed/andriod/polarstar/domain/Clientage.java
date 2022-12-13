package com.chickweed.andriod.polarstar.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity //DB 테이블
@NoArgsConstructor //파라미터가 없는 기본 생성자 생성
@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자 만듦
public class Clientage extends User{
    @OneToOne //1:1 연결
    @JoinColumn(name="clientage_connect") //외래키 컬럼
    private Guardian clientageConnect;


    public Clientage(String userPhoneNumber, String userPassword, String userProfileImage,
                     String userName, String userBirth, String userSex, String userAddress,
                     String userDetailAddress, String userConnectionCode, Guardian clientageConnect) {
        this.setUserPhoneNumber(userPhoneNumber);
        this.setUserPassword(userPassword);
        this.setUserProfileImage(userProfileImage);
        this.setUserName(userName);
        this.setUserBirth(userBirth);
        this.setUserSex(userSex);
        this.setUserAddress(userAddress);
        this.setUserDetailAddress(userDetailAddress);
        this.setUserConnectionCode(userConnectionCode);
        this.setClientageConnect(clientageConnect);
    }
}
