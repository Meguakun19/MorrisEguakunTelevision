import java.util.Scanner;

public class Television {
    Scanner input;
    final String manufacturer;
    final int screenSize;
    boolean powerOn;
    int channel;
    int volume;

    public Television(String manufacturer, int screenSize) {
        this.input = new Scanner(System.in);
        this.manufacturer = "Toshiba";
        this.screenSize = 55;
        this.powerOn = true;
        int volume1 = 20;
        this.volume = volume1;
        int channel1 = 2;
        this.channel = channel1;
        boolean powerOn1 = false;
    }

    public void setChannel(int channel) {
        System.out.println("What channel would like to view?");
        this.channel = this.input.nextInt();
    }

    public boolean isPowerOn(boolean powerOn) {
        return powerOn;
    }

    public void powerOn(boolean powerOn) {
        powerOn = !powerOn;
    }

    public int increaseVolume(int volume) {
        this.volume = volume + 1;
        return this.volume;
    }

    public int decreaseVolume(int volume) {
        this.volume = volume - 1;
        return this.volume;
    }

    public int getChannel(int channel) {
        return channel;
    }

    public int getVolume(int volume) {
        return volume;
    }

    public String getManufacturer(String manufacturer) {
        return manufacturer;
    }

    public int getScreenSize(int screenSize) {
        return screenSize;
    }
}


