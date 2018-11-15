public class Student {
    private float meanMark = 0;
    private boolean presence = false;
    private int id;
    private int groupId;
    public Student(float meanMark, boolean presence, int id, int groupId) {
        this.meanMark = meanMark;
        this.presence = presence;
        this.id = id;
        this.groupId= groupId;
    }

    public float getMeanMark() {
        return meanMark;
    }

    public boolean getPresence() {
        return presence;
    }

    @Override
    public String toString() {
        return ("Student[" + (id+1) + "]: mean mark: " + meanMark + " presence: " + presence + " group id: " + groupId);
    }
}
