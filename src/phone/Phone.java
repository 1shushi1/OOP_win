package phone;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Phone {
    private double maxBatteryPercentage;
    private double currentBatteryPercentage;
    private double batteryConsumption;
    private double tarif1;
    private double tarif2;
    private double tarif3;
    private double moneyBalance;
    private boolean isOn;
    private String phoneNumber;
    private Scanner s = new Scanner(System.in);

    public Phone(double maxBatteryPercentage, double tarif1, double tarif2, double tarif3, double moneyBalance, double batteryConsumption) {
        this.maxBatteryPercentage = maxBatteryPercentage;
        currentBatteryPercentage = maxBatteryPercentage;
        this.tarif1 = tarif1;
        this.tarif2 = tarif2;
        this.tarif3 = tarif3;
        this.batteryConsumption = batteryConsumption;
        this.moneyBalance = moneyBalance;
        System.out.println("Enter your phone number");
        this.phoneNumber = s.next();
        menu();
    }

    private void charge() {
        System.out.println("Enter how much percents you would like to charge");
        int percents = s.nextInt();
        System.out.println(currentBatteryPercentage = (currentBatteryPercentage + percents > 100) ? 100 : currentBatteryPercentage + percents);
        System.out.println("You've charged your phone to : " + currentBatteryPercentage);
    }

    private void onOff() {
        System.out.println((isOn = !isOn) ? "Your phone is on" : "Your phone is off");
    }

    private void topUpTheBalance() {
        if (isOn == true) {
            System.out.println("Enter the amount by which you want to top up the phone balance");
            int amount = s.nextInt();
            moneyBalance += amount;
            System.out.println("You've successfully top up a balance");
        }
    }

    private double tarifChecker(String calleePhoneNumber) {
        if ((phoneNumber.startsWith("+38050") || phoneNumber.startsWith("+38099") || phoneNumber.startsWith("+38066")) && (calleePhoneNumber.startsWith("+38050") || calleePhoneNumber.startsWith("+38099") || calleePhoneNumber.startsWith("+38066"))) {
            return tarif1;
        }
        if ((phoneNumber.startsWith("+38050") || phoneNumber.startsWith("+38099") ||
                phoneNumber.startsWith("+38066")) && (calleePhoneNumber.startsWith("+38096") || calleePhoneNumber.startsWith("+38068"))) {
            return tarif2;
        }
        if ((phoneNumber.startsWith("+38096") || phoneNumber.startsWith("+38068")) && (calleePhoneNumber.startsWith("+38096") || calleePhoneNumber.startsWith("+38068"))) {
            return tarif1;
        }
        if ((phoneNumber.startsWith("+38096") || phoneNumber.startsWith("+38068"))
                && (calleePhoneNumber.startsWith("+38050") || calleePhoneNumber.startsWith("+38099") || calleePhoneNumber.startsWith("+38066"))) {
            return tarif2;
        } else {
            return tarif3;
        }
    }

    private void call() {
        if (isOn) {
            System.out.println("Enter a phone number you would like to call");
            String calleePhoneNumber = s.next();
            double tarif = tarifChecker(calleePhoneNumber);
            System.out.println("You are using . 1 minute will cost you " + tarif);
            System.out.println("Enter how much time will prolong your call");
            System.out.println("Enter minutes");
            int minutes = s.nextInt();
            System.out.println("Enter seconds");
            int seconds = s.nextInt();
            int time = (minutes * 60) + seconds;
            double pricePerSecond = tarif / 60;
            for (int i = 0; i < time; i++) {
                int prolongTimeMinutes = i / 60;
                int prolongTimeSeconds = i % 60;
                moneyBalance -= pricePerSecond;
                currentBatteryPercentage -= batteryConsumption / 60;
                if (currentBatteryPercentage < 5) {
                    System.out.println("Your phone is dead, you have to charge it before use it again");
                    isOn = false;
                    break;
                }
                if (moneyBalance < pricePerSecond) {
                    System.out.println("You call prolong : " + prolongTimeMinutes + " : " + prolongTimeSeconds);
                    System.out.println("You are broke. Top up your balance to call again.");
                    break;
                }
            }
        }
    }

    private void showBalance() {
        if (isOn) System.out.println("Your current balance is : " + Math.round(moneyBalance));
    }

    private void showBatteryPercentage() {
        if (isOn) System.out.println("Your current battery percentage is : " + Math.round(currentBatteryPercentage));
    }

    private void changeOperator() {
        System.out.println("Enter a number which operator you would like to have");
        phoneNumber = s.next();
        System.out.println("Enter tarif1");
        tarif1 = s.nextDouble();
        System.out.println("Enter tarif2");
        tarif2 = s.nextDouble();
        System.out.println("Enter tarif3");
        tarif3 = s.nextDouble();
    }

    private void menu() {
        while (true) {
            System.out.println("Select a function : 1 - On/Off, 2 - Charge, 3 - Top up the balance, 4 - Call, 5 - Show balance, 6 - Show battery percentage, 7 - Exit");
            int selection = s.nextInt();
            switch (selection) {
                case 1 -> onOff();
                case 2 -> charge();
                case 3 -> topUpTheBalance();
                case 4 -> call();
                case 5 -> showBalance();
                case 6 -> showBatteryPercentage();
                case 7 -> changeOperator();
                case 8 -> System.exit(0);
            }
        }
    }
}
