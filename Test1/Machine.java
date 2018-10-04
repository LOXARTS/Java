package training.Test1;

public abstract class Machine {
    protected int year;
    protected String Message;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void start(){
            wheels();
            lights();

    }


        public abstract void wheels();
        public abstract void lights();


}
