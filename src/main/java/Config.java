import maps.Authorization;
import maps.FullName;

import java.util.ArrayList;
import java.util.List;

public class Config {

    private int id;
    private FullName fullName;
    private List berries;
    private Authorization authorization;

    public Config() {
        authorization = new Authorization();
        berries = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public List getBerries() {
        return berries;
    }

    public void setBerries(List berries) {
        this.berries = berries;
    }

    public Authorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }
}
