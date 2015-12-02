package ch.codebulb.crudfacesdemo.crud.model;

import ch.codebulb.crudfaces.util.FacesHelper;

public enum Language {
    en, es, fr, de;

    @Override
    public String toString() {
        return FacesHelper.i18n("language." + name());
    }
}
