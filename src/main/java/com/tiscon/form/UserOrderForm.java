package com.tiscon.form;

import com.tiscon.validator.Numeric;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 顧客が入力する見積もり情報を保持するクラス。
 *
 * @author Oikawa Yumi
 */
public class UserOrderForm {

    @NotBlank
    private String customerName;

    @NotBlank
    @Pattern(regexp = "0[89]0-?[0-9]{4}-?[0-9]{4}",message = "電話番号を正しく入力してください")
    private String tel;

    @Email
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9_.+-]+@([a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9]*\\.)+[a-zA-Z]{2,}$",message = "メールアドレスを正しく入力してください")
    private String email;

    @NotBlank
    private String oldPrefectureId;


    @NotBlank
    //@Pattern(regexp = "^((北海道|東京都|(大阪|京都)府|(神奈川|和歌山|鹿児島)県|[^\\s\\w\\d　]{2}県)[^\\s\\w\\d　]{1,6}[市郡区町村][^\\s\\w\\d　]{1,20}[\\d０-９〇一-九十上下東西]+[^\\s　'”<）」】]*)|^((北海道|東京都|(大阪|京都)府|(神奈川|和歌山|鹿児島)県|[^\\s\\w\\d　]{2}県)[^\\s\\w\\d　]{1,6}[市郡区町村][^\\s\\w\\d　]{1,20})")
    private String oldAddress;

    @NotBlank
    private String newPrefectureId;

    @NotBlank
    private String newAddress;

    @Numeric
    @NotBlank
    @Pattern(regexp = "[1-9]?[0-9]",message = "段ボールの個数を100個未満で入力してください")
    private String box;

    @Numeric
    @NotBlank
    @Pattern(regexp = "[0-10]",message = "ベッドの個数を10個以下で入力してください")
    private String bed;

    @Numeric
    @NotBlank
    @Pattern(regexp = "[0-10]",message = "自転車の個数を10個以下で入力してください")
    private String bicycle;

    @Numeric
    @NotBlank
    @Pattern(regexp = "[0-10]",message = "洗濯機の個数を10個以下で入力してください")
    private String washingMachine;

    @Numeric
    @NotBlank
    private String seasonNumber;

    @NotNull
    private boolean washingMachineInstallation;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBicycle() {
        return bicycle;
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public String getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(String seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;

    }
}
