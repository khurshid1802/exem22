package model;

import java.util.UUID;

public class Student {
    private UUID id;
    private String fullName;
    private UUID groupId;
    private int overallScore;
    private int ballOfPractice;
    private int ballOfTheory;
    private int ballInStudy;
    private boolean mentor;
    private boolean passed;

    public Student() {
        this.id = UUID.randomUUID();
    }

    public Student(String fullName, UUID groupId,boolean mentor) {
        this();
        this.fullName = fullName;
        this.groupId = groupId;
        this.mentor = mentor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(int overallScore) {
        this.overallScore = overallScore;
    }

    public int getBallOfPractice() {
        return ballOfPractice;
    }

    public void setBallOfPractice(int ballOfPractice) {
        this.ballOfPractice = ballOfPractice;
    }

    public int getBallOfTheory(int i) {
        return ballOfTheory;
    }

    public void setBallOfTheory(int ballOfTheory) {
        this.ballOfTheory = ballOfTheory;
    }

    public UUID getGroupId() {
        return groupId;
    }

    public void setGroupId(UUID groupId) {
        this.groupId = groupId;
    }

    public boolean isMentor() {
        return mentor;
    }

    public void setMentor(boolean mentor) {
        this.mentor = mentor;
    }

    public int getBallOfTheory() {
        return ballOfTheory;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public int getBallInStudy() {
        return ballInStudy;
    }

    public void setBallInStudy(int ballInStudy) {
        this.ballInStudy = ballInStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", groupId=" + groupId +
                ", overallScore=" + overallScore +
                ", ballOfPractice=" + ballOfPractice +
                ", ballOfTheory=" + ballOfTheory +
                ", ballInStudy=" + ballInStudy +
                ", mentor=" + mentor +
                ", passed=" + passed +
                '}';
    }
}
