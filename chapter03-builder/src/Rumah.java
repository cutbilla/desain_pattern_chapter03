public class Rumah {

    private String pondasi, dinding, atap, jendela, pintu;

    public Rumah(){
    }

    public String getPondasi() {
        return pondasi;
    }

    public void setPondasi(String pondasi) {
        this.pondasi = pondasi;
    }

    public String getDinding() {
        return dinding;
    }

    public void setDinding(String dinding) {
        this.dinding = dinding;
    }

    public String getAtap() {
        return atap;
    }

    public void setAtap(String atap) {
        this.atap = atap;
    }

    public String getJendela() {
        return jendela;
    }

    public void setJendela(String jendela) {
        this.jendela = jendela;
    }

    public String getPintu() {
        return pintu;
    }

    public void setPintu(String pintu) {
        this.pintu = pintu;
    }

    public String toString() {
        return "Detail Rumah"
                + "\n------------"
                + "\nPondasi : " + getPondasi()
                + "\nDinding : " + getDinding()
                + "\nAtap : " + getAtap()
                + "\nJendela : " + getJendela()
                + "\nPintu : " + getPintu();
    }
}

// BUILDER RUMAH

class RumahBuilder {
    private Rumah rumah;

    public RumahBuilder() {
        this(new Rumah());
    }

    public RumahBuilder(Rumah rumah) {
        this.rumah = rumah;
    }

    public RumahBuilder pondasi(String pondasi) {
        rumah.setPondasi(pondasi);
        return this;
    }

    public RumahBuilder dinding(String dinding) {
        rumah.setDinding(dinding);
        return this;
    }

    public RumahBuilder atap(String atap) {
        rumah.setAtap(atap);
        return this;
    }

    public RumahBuilder jendela(String jendela) {
        rumah.setJendela(jendela);
        return this;
    }

    public RumahBuilder pintu(String pintu) {
        rumah.setPintu(pintu);
        return this;
    }

    public Rumah hasilkan() {
        return rumah;
    }

}

// DIRECTOR RUMAH
class DirekturRumah {

    // Tetapkan Singleton
    private static DirekturRumah direktur = null;

    private DirekturRumah() {}

    public static synchronized DirekturRumah getInstance() {
        if (direktur == null) {
            direktur = new DirekturRumah();
        }
        return direktur;
    }

    public Rumah buatRumahModern() {
        RumahBuilder pembuat = new RumahBuilder();
        pembuat.pondasi("Pelat Beton")
                .dinding("Dinding Kaca")
                .atap("Atap Datar")
                .jendela("Jendela Geser Besar")
                .pintu("Pintu Otomatis");

        return pembuat.hasilkan();
    }

    public Rumah buatRumahKabin() {
        RumahBuilder pembuat = new RumahBuilder();
        pembuat.pondasi("Pondasi Batu")
                .dinding("Dinding Kayu")
                .atap("Atap Curam dengan Sirap")
                .jendela("Jendela Berlapis Ganda")
                .pintu("Pintu Kayu");

        return pembuat.hasilkan();
    }

    public Rumah buatRumahTiny() {
        RumahBuilder pembuat = new RumahBuilder();
        pembuat.pondasi("Trailer")
                .dinding("Panel Kayu")
                .atap("Atap Logam")
                .jendela("Jendela Casement Kecil")
                .pintu("Pintu Tunggal");

        return pembuat.hasilkan();
    }
}
