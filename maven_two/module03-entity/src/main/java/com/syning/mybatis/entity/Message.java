package com.syning.mybatis.entity;

import java.util.Date;

public class Message {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.mid
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    private Integer mid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.m_title
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    private String mTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.m_content
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    private String mContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.pid
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    private Integer pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.m_date
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    private Date mDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.m_reply
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    private String mReply;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.m_status
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    private String mStatus;

    public Message() {}

    @Override
    public String toString() {
        return "Message{" +
                "mid=" + mid +
                ", mTitle='" + mTitle + '\'' +
                ", mContent='" + mContent + '\'' +
                ", pid=" + pid +
                ", mDate=" + mDate +
                ", mReply='" + mReply + '\'' +
                ", mStatus='" + mStatus + '\'' +
                '}';
    }

    public Message(Integer mid, String mTitle, String mContent, Integer pid, Date mDate, String mReply, String mStatus) {
        this.mid = mid;
        this.mTitle = mTitle;
        this.mContent = mContent;
        this.pid = pid;
        this.mDate = mDate;
        this.mReply = mReply;
        this.mStatus = mStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.mid
     *
     * @return the value of t_message.mid
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.mid
     *
     * @param mid the value for t_message.mid
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.m_title
     *
     * @return the value of t_message.m_title
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public String getmTitle() {
        return mTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.m_title
     *
     * @param mTitle the value for t_message.m_title
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public void setmTitle(String mTitle) {
        this.mTitle = mTitle == null ? null : mTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.m_content
     *
     * @return the value of t_message.m_content
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public String getmContent() {
        return mContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.m_content
     *
     * @param mContent the value for t_message.m_content
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public void setmContent(String mContent) {
        this.mContent = mContent == null ? null : mContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.pid
     *
     * @return the value of t_message.pid
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.pid
     *
     * @param pid the value for t_message.pid
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.m_date
     *
     * @return the value of t_message.m_date
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public Date getmDate() {
        return mDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.m_date
     *
     * @param mDate the value for t_message.m_date
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.m_reply
     *
     * @return the value of t_message.m_reply
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public String getmReply() {
        return mReply;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.m_reply
     *
     * @param mReply the value for t_message.m_reply
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public void setmReply(String mReply) {
        this.mReply = mReply == null ? null : mReply.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.m_status
     *
     * @return the value of t_message.m_status
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public String getmStatus() {
        return mStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.m_status
     *
     * @param mStatus the value for t_message.m_status
     *
     * @mbggenerated Tue Apr 26 15:55:19 CST 2022
     */
    public void setmStatus(String mStatus) {
        this.mStatus = mStatus == null ? null : mStatus.trim();
    }
}