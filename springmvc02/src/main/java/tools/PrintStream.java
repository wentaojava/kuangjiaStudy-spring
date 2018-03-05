package tools;

/**
 * @time: 2018年03月01日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
class PrintStream extends Thread {
    java.io.InputStream __is = null;
    public PrintStream(java.io.InputStream is) {
        __is = is;
    }
    @Override
    public void run() {
        try {
            while (this != null) {
                int _ch = __is.read();
                if (_ch != -1)
                {System.out.print((char) _ch);}
                else
                {break;}
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
