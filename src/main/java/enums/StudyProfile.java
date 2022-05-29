package enums;

public enum StudyProfile {
    PHYSICS("������"),
    COMPUTER_SCIENCE("�����������"),
    MATHEMATICS("����������"),
    JURISPRUDENCE("�������������"),
    MEDICINE("��������"),
    LINGUISTICS("�����������");

    private final String profileName;

    private StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}