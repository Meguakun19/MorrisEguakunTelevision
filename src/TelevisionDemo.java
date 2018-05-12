// Morris Eguakun Java Programming Homework
//09-28-2017



import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

public class TelevisionDemo {


    public TelevisionDemo() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        int station = 0;
        Television bigScreen = new Television("Toshiba", 55);
        bigScreen.powerOn(bigScreen.powerOn);
        PrintStream var10000 = System.out;
        Objects.requireNonNull(bigScreen);
        int var10001 = bigScreen.getScreenSize(55);
        Objects.requireNonNull(bigScreen);
        var10000.println("A " + var10001 + " inch " + bigScreen.getManufacturer("Toshiba") + " has been turned on.");
        bigScreen.setChannel(station);
        bigScreen.increaseVolume(bigScreen.volume);
        var10000 = System.out;
        var10001 = bigScreen.getChannel(bigScreen.channel);
        var10000.println("Channel: " + var10001 + " Volume: " + bigScreen.getVolume(bigScreen.volume));
        System.out.println("Too loud! Lowering the volume.");
        bigScreen.decreaseVolume(bigScreen.volume);
        bigScreen.decreaseVolume(bigScreen.volume);
        bigScreen.decreaseVolume(bigScreen.volume);
        bigScreen.decreaseVolume(bigScreen.volume);
        bigScreen.decreaseVolume(bigScreen.volume);
        bigScreen.decreaseVolume(bigScreen.volume);
        var10000 = System.out;
        var10001 = bigScreen.getChannel(bigScreen.channel);
        var10000.println("Channel: " + var10001 + " Volume: " + bigScreen.getVolume(bigScreen.volume));
        System.out.println();
        Television portable = new Television("Sharp", 19);
        portable.powerOn(bigScreen.powerOn);
        System.out.println("The manufacturer of the television turned on is: " + portable.getManufacturer("Sharp"));
        portable.setChannel(portable.channel);
        portable.decreaseVolume(portable.volume);
        portable.decreaseVolume(portable.volume);
        System.out.println("The channel is: " + portable.getChannel(portable.channel));
        System.out.println("The volume is: " + portable.getVolume(portable.volume));
    }
}

