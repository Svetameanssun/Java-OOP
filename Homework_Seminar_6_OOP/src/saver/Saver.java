package saver;

import Interfaces.Savable;
import personal.Persister;


public class Saver implements Savable {
    Persister persister;
    public Saver(Persister persister) {
        this.persister = persister;
    }
    @Override
    public void save() {
        persister.save();
    }
}