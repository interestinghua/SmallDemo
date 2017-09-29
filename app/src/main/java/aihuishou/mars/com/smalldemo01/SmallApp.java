package aihuishou.mars.com.smalldemo01;

import android.app.Application;

import net.wequick.small.Small;

/**
 * SmallApp
 * Created by marshua on 2017/9/29.
 */

public class SmallApp extends Application {

    public SmallApp() {
        Small.preSetUp(this);
    }
}
