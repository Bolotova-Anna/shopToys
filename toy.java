public class toy {
    String name;
    Integer losRate;
    Integer id;

    public toy(Integer id, Integer losRate, String name) {
        this.name = name;
        this.losRate = losRate;
        this.id = id;
    }

    @Override
    public String toString() {
        String res = String.format("%d,%s,%s", id, losRate, name);
        return res;
    }

    public Integer getLosRate() {
        return losRate;
    }
    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}
