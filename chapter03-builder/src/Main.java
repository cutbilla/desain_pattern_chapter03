public class Main {
    public static void main(String[] args) {

        System.out.println("PROGRAM ROBOT");
        // Dengan Constructor
        Robot robot1 = new Robot();
        robot1.setShield("Energy Shield");
        robot1.setGun("Plasma Cannon");
        robot1.setSword("Vibroblade");
        robot1.setBrainchip("AI Core v3.0");
        System.out.println("Details Robot 1 :\n" + robot1.toString());

        // Dengan Builder
        Robot robot2 = new RobotBuilder()
                .shield("Titanium Alloy")
                .gun("Laser Rifle")
                .brainchip("Military Grade Processor")
                .getResult();
        System.out.println("\nDetail Robot 2 :\n" + robot2.toString());

        // Dengan Builder Director
        RobotDirector director = RobotDirector.getInstance();

        Robot casualRobot = director.CasualRobot();
        System.out.println("\nCasual Robot");
        System.out.println(casualRobot);


        System.out.println("\n-----------------------------------------------------------------------------------------");
        System.out.println("PROGRAM RUMAH");

        // Dengan Constructor
        Rumah rumah1 = new Rumah();
        rumah1.setPondasi("Pelat Beton");
        rumah1.setDinding("Bata Ringan");
        rumah1.setAtap("Genteng Metal");
        rumah1.setJendela("Jendela Aluminium");
        rumah1.setPintu("Pintu Kayu Solid");
        System.out.println("Detail Rumah 1 :\n" + rumah1.toString());

        // Dengan PembuatRumah
        Rumah rumah2 = new RumahBuilder()
                .pondasi("Pondasi Tiang Pancang")
                .dinding("Dinding Beton")
                .atap("Atap Datar")
                .jendela("Jendela Kaca Geser")
                .pintu("Pintu Baja")
                .hasilkan();
        System.out.println("\nDetail Rumah 2 :\n" + rumah2.toString());

        // Dengan DirekturRumah
        DirekturRumah direktur = DirekturRumah.getInstance();

        Rumah rumahModern = direktur.buatRumahModern();
        System.out.println("\nRumah Modern");
        System.out.println(rumahModern);

        System.out.println("\n-----------------------------------------------------------------------------------------");
        System.out.println("PROGRAM COMPUTERSET");

        // Dengan Constructor
        ComputerSet computerSet1 = new ComputerSet();
        computerSet1.setKeyboard("Mechanical Keyboard");
        computerSet1.setMouse("Gaming Mouse");
        computerSet1.setSpeaker("7.1 Surround Sound Speakers");
        computerSet1.setMonitor("27-inch Curved Gaming Monitor");
        System.out.println("Details Computer Set 1 :\n" + computerSet1.toString());

        // Dengan Builder
        ComputerSet computerSet2 = new ComputerSetBuilder()
                .keyboard("Standard Keyboard")
                .mouse("Basic Mouse")
                .getResult();
        System.out.println("\nDetails Computer Set 2 :\n" + computerSet2.toString());

        // Dengan Builder Director
        ComputerSetDirector director1 = ComputerSetDirector.getInstance();

        ComputerSet gamingSet = director1.GamingSet();
        System.out.println("\nGaming Computer Set");
        System.out.println(gamingSet);

    }
}

