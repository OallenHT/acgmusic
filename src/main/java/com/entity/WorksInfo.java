package com.entity;

import java.sql.Timestamp;
import java.util.List;

public class WorksInfo {

    private Integer workId;
    private Integer uid;
    private String workTitle;//标题
    private Integer lookCount;//阅读量
    private Timestamp workTime;
    private String workDigest;//摘要
    private String workContent;//内容
    private String workBackground;//背景
    private String diskUrl;
    private String diskPwd;
    private String diskZipPwd;
    private String typeName;//类型
    private String workFrom;//来源
    private Integer bombCount;
    private Integer downloadCount;

    private User user;
    private List<BombRecord> bombRecords;

    public WorksInfo() {
    }

    public WorksInfo( Integer uid, String workTitle, String workDigest, String workContent, String workBackground, String diskUrl, String diskPwd, String diskZipPwd, String typeName, String workFrom) {
        this.uid = uid;
        this.workTitle = workTitle;
        this.workDigest = workDigest;
        this.workContent = workContent;
        this.workBackground = workBackground;
        this.diskUrl = diskUrl;
        this.diskPwd = diskPwd;
        this.diskZipPwd = diskZipPwd;
        this.typeName = typeName;
        this.workFrom = workFrom;
    }

    public WorksInfo(Integer workId , Integer uid, String workTitle, String workDigest, String workContent, String workBackground, String diskUrl, String diskPwd, String diskZipPwd, String typeName, String workFrom) {
        this.workId=workId;
        this.uid = uid;
        this.workTitle = workTitle;
        this.workDigest = workDigest;
        this.workContent = workContent;
        this.workBackground = workBackground;
        this.diskUrl = diskUrl;
        this.diskPwd = diskPwd;
        this.diskZipPwd = diskZipPwd;
        this.typeName = typeName;
        this.workFrom = workFrom;
    }

    public WorksInfo(Integer workId, Integer uid, String workTitle, Integer lookCount,Timestamp workTime ,String workDigest, String workContent, String workBackground, String diskUrl, String diskPwd, String diskZipPwd, String typeName, String workFrom, Integer bombCount, Integer downloadCount) {
        this.workId = workId;
        this.uid = uid;
        this.workTitle = workTitle;
        this.lookCount = lookCount;
        this.workTime = workTime;
        this.workDigest = workDigest;
        this.workContent = workContent;
        this.workBackground = workBackground;
        this.diskUrl = diskUrl;
        this.diskPwd = diskPwd;
        this.diskZipPwd = diskZipPwd;
        this.typeName = typeName;
        this.workFrom = workFrom;
        this.bombCount = bombCount;
        this.downloadCount=downloadCount;
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    public Integer getLookCount() {
        return lookCount;
    }

    public void setLookCount(Integer lookCount) {
        this.lookCount = lookCount;
    }

    public Timestamp getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Timestamp workTime) {
        this.workTime = workTime;
    }

    public String getWorkDigest() {
        return workDigest;
    }

    public void setWorkDigest(String workDigest) {
        this.workDigest = workDigest;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    public String getWorkBackground() {
        return workBackground;
    }

    public void setWorkBackground(String workBackground) {
        this.workBackground = workBackground;
    }

    public String getDiskUrl() {
        return diskUrl;
    }

    public void setDiskUrl(String diskUrl) {
        this.diskUrl = diskUrl;
    }

    public String getDiskPwd() {
        return diskPwd;
    }

    public void setDiskPwd(String diskPwd) {
        this.diskPwd = diskPwd;
    }

    public String getDiskZipPwd() {
        return diskZipPwd;
    }

    public void setDiskZipPwd(String diskZipPwd) {
        this.diskZipPwd = diskZipPwd;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getWorkFrom() {
        return workFrom;
    }

    public void setWorkFrom(String workFrom) {
        this.workFrom = workFrom;
    }

    public Integer getBombCount() {
        return bombCount;
    }

    public void setBombCount(Integer bombCount) {
        this.bombCount = bombCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<BombRecord> getBombRecords() {
        return bombRecords;
    }

    public void setBombRecords(List<BombRecord> bombRecords) {
        this.bombRecords = bombRecords;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    @Override
    public String toString() {
        return "WorksInfo{" +
                "workId=" + workId +
                ", uid=" + uid +
                ", workTitle='" + workTitle + '\'' +
                ", lookCount=" + lookCount +
                ", workTime=" + workTime +
                ", workDigest='" + workDigest + '\'' +
                ", workContent='" + workContent + '\'' +
                ", workBackground='" + workBackground + '\'' +
                ", diskUrl='" + diskUrl + '\'' +
                ", diskPwd='" + diskPwd + '\'' +
                ", diskZipPwd='" + diskZipPwd + '\'' +
                ", typeName='" + typeName + '\'' +
                ", workFrom='" + workFrom + '\'' +
                ", bombCount=" + bombCount +
                ", downloadCount=" + downloadCount +
                ", user=" + user +
                ", bombRecords=" + bombRecords +
                '}';
    }
}
