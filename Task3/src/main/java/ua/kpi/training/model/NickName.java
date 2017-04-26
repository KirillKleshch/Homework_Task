package ua.kpi.training.model;

/**
 * Created by Kirill on 25.04.2017.
 */
public enum NickName {
    KIRILL("kirill"),
    OLEG("oleg"),
    KILLER228("killer228");


    private String description;

    NickName(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
