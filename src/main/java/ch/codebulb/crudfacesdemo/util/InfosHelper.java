package ch.codebulb.crudfacesdemo.util;

import org.omnifaces.util.Faces;
import org.primefaces.context.RequestContext;

public class InfosHelper {
    private InfosHelper() {}
    
    public static String getOmniFacesVersion() {
        return Faces.class.getPackage().getSpecificationVersion();
    }
    
    public static String getPrimeFacesVersion() {
        return RequestContext.class.getPackage().getSpecificationVersion();
    }
}
