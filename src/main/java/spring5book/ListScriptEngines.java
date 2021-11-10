package main.java.spring5book;

import javax.script.ScriptEngineManager;

public class ListScriptEngines {
    public static void main(String... args) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        mgr.getEngineFactories().forEach(factory -> {
            String engineName = factory.getEngineName();
            String languageName = factory.getLanguageName();
            String version = factory.getLanguageVersion();
            System.out.println("engineName: " + engineName
                    + "languageName" + languageName
                    + "version" + version);
        });
    }
}
