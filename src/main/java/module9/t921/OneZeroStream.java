package module9.t921;

import java.io.InputStream;

public class OneZeroStream extends InputStream {
    private byte[] bytes = {'1', ' ', '0', ' '};
    int i;

    public int read() {
        if (i >= bytes.length)
            i = 0;
        return bytes[i++];
    }
}


