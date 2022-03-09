package CarFleetApp;

public enum CarEngineType {
    GASOLINE("gs",true),
    DIESEL("d",false),
    ELECTRIC("e",true),
    GASOLINE_WTH_LPG("glpg",true);

    private String cepikCode;
    private boolean eco;
    // do enumow mozna dodac zarówno pola jak i metody czyli:
    //    - jakbym chciał miec dla każdej mojej wartosci wyliczeniowej
    //    przypisany kod albo wartosc ktora bedzie wysyłana do zewnetrznego systemu gdzie one faktycznie sa przypisane
    CarEngineType(String cepikCode, boolean eco) {
        this.cepikCode = cepikCode;
        this.eco = eco;
    }

    public String getCepikCode() {
        return cepikCode;
    }

    //isEco() jest ot getter specjalny dla booleanów. zamiast getEco jest isEco()
    public boolean isEco() {
        return eco;
    }

}

