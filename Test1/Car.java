package training.Test1;

public class Car extends Machine implements Engine {





    @Override
    public  void wheels(){
        System.out.println("Wheels are spinning ");
    }

    @Override
    public void lights() {
        System.out.println("The lights are on");
    }


    @Override
    public void compressor1() {
        double levels = 2555;

    }

    @Override
    public void battery1() {
        float batterylevels=20699;
        int temperature = 125;

    StringBuilder text = new StringBuilder();
    text.append("Temp %2d 56").append("22").append(batterylevels);

        if(temperature >= 100 || batterylevels == 585){
            System.out.println("Temperature exceeds 100 degrees." + " compressor = "+"\t"+text);
            greenenergy();
        }


    }

    public void greenenergy(){
        System.out.println("Green energy activated");
    }



}
