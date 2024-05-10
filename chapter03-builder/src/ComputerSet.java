public class ComputerSet {
    private String keyboard, mouse, speaker, monitor;

    public ComputerSet() {}

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String toString() {
        return "ComputerSet Properties"
                + "\n---------------------"
                + "\nKeyboard : " + getKeyboard()
                + "\nMouse : " + getMouse()
                + "\nSpeaker : " + getSpeaker()
                + "\nMonitor : " + getMonitor();
    }
}

class ComputerSetBuilder {
    private ComputerSet computerSet;

    public ComputerSetBuilder() {
        this(new ComputerSet());
    }

    public ComputerSetBuilder(ComputerSet computerSet) {
        this.computerSet = computerSet;
    }

    public ComputerSetBuilder keyboard(String keyboard) {
        computerSet.setKeyboard(keyboard);
        return this;
    }

    public ComputerSetBuilder mouse(String mouse) {
        computerSet.setMouse(mouse);
        return this;
    }

    public ComputerSetBuilder speaker(String speaker) {
        computerSet.setSpeaker(speaker);
        return this;
    }

    public ComputerSetBuilder monitor(String monitor) {
        computerSet.setMonitor(monitor);
        return this;
    }

    public ComputerSet getResult() {
        return computerSet;
    }
}

class ComputerSetDirector {
    private static ComputerSetDirector director = null;

    private ComputerSetDirector() {}

    public static synchronized ComputerSetDirector getInstance() {
        if (director == null) {
            director = new ComputerSetDirector();
        }
        return director;
    }

    public ComputerSet BasicSet() {
        ComputerSetBuilder builder = new ComputerSetBuilder();
        builder.keyboard("Standard Keyboard");
        builder.mouse("Basic Mouse");

        return builder.getResult();
    }

    public ComputerSet GamingSet() {
        ComputerSetBuilder builder = new ComputerSetBuilder();
        builder.keyboard("Mechanical Keyboard");
        builder.mouse("Gaming Mouse");
        builder.speaker("7.1 Surround Sound Speakers");
        builder.monitor("27-inch Curved Gaming Monitor");

        return builder.getResult();
    }

    public ComputerSet MultimediaSet() {
        ComputerSetBuilder builder = new ComputerSetBuilder();
        builder.keyboard("Wireless Keyboard");
        builder.mouse("Wireless Mouse");
        builder.speaker("Hi-Fi Stereo Speakers");
        builder.monitor("32-inch 4K Ultra HD Monitor");

        return builder.getResult();
    }
}