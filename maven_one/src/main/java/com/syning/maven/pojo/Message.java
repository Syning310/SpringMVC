package com.syning.maven.pojo;

import java.util.Date;

public class Message {

    private Integer mid;
    private String mTitle;
    private String mContent;
    private Date mDate;
    private String mReply;
    private String mStatus;

    private Person person;    // 一条消息对应一个人

    @Override
    public String toString() {
        return "Message{" +
                "mid=" + mid +
                ", mTitle='" + mTitle + '\'' +
                ", mContent='" + mContent + '\'' +
                ", mDate=" + mDate +
                ", mReply='" + mReply + '\'' +
                ", mStatus='" + mStatus + '\'' +
                ", person=" + person +
                '}';
    }

    public Message() {}

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getmReply() {
        return mReply;
    }

    public void setmReply(String mReply) {
        this.mReply = mReply;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Message(Integer mid, String mTitle, String mContent, Date mDate, String mReply, String mStatus) {
        this.mid = mid;
        this.mTitle = mTitle;
        this.mContent = mContent;
        this.mDate = mDate;
        this.mReply = mReply;
        this.mStatus = mStatus;
    }
}
