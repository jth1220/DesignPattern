package main.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {

    private Map<String, WebSite> flyWeights = new HashMap<>();

    public WebSite getWebSiteCategory(String key) {
        if (!flyWeights.containsKey(key)) {
            flyWeights.put(key, new ConcreteWebSite(key));
        }
        return flyWeights.get(key);
    }

    public int getWebSiteCount() {
        return flyWeights.size();
    }
}
