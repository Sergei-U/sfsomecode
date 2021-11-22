package module6.tikhono;


import java.util.Properties;

public class App extends PrintSystemProperty {
    public static void main(String[] args) {
        System.out.println("Печатаем некоторые системные свойства в консоли.");
        // Inheritance
        PrintSystemProperty[] syspr = {
                new PrintJavaVendor(),
                new PrintJavaVersion()
        };
        // с аннотацией Override
        PrintOSName osName = new PrintOSName();
        // без аннотации @Override
        System.out.print("свойство: ");
        PrintUserHome userHome = new PrintUserHome();
    }
}

class PrintSystemProperty {
    Properties p = new Properties(System.getProperties());
    String sysprop = "os.arch";

    // печатаем какое-то системное св-во
    protected void printProperty(String sysprop) {
        System.out.print("свойство: " + sysprop);
        System.out.println(p.getProperty(sysprop));
    }
}



class PrintJavaVendor extends PrintSystemProperty {
    public PrintJavaVendor() {
        javaVendor();
    }

    void javaVendor() {
        printProperty("java.vendor");
    }
}


class PrintJavaVersion extends PrintSystemProperty {
    public PrintJavaVersion() {
        javaVersion();
    }

    void javaVersion() {
        printProperty("java.version");
    }
}


class PrintUserHome extends GetUserHome {
    public PrintUserHome() {
        userHome();
    }

    void userHome() {
        System.out.println(System.getProperty("user.home"));
    }
}


class GetUserHome {
    void userHome() {
        System.out.println(System.getProperty("user.home"));
    }
}



class PrintOSName extends GetOSName {
    public PrintOSName() {
        osName();
    }

    @Override
    void osName() {
        System.out.print("Override. свойство: ");
        super.osName();
    }
}


class GetOSName {
    void osName() {
        System.out.println(System.getProperty("os.name"));
    }
}

