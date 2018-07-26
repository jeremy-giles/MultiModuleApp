# MultiModuleApp
Application with multiple module and  dependency injection

Current error :
```java
com.project.jeremyg.multimoduledagger E/AndroidRuntime: FATAL EXCEPTION: main
    Process: com.project.jeremyg.multimoduledagger, PID: 28912
    java.lang.RuntimeException: Unable to start activity ComponentInfo{com.project.jeremyg.multimoduledagger/com.project.jeremyg.multimoduledagger.ui.activities.MainActivity}: java.lang.NullPointerException: com.project.jeremyg.multimoduledagger.App.activityInjector() returned null
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2416)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2476)
        at android.app.ActivityThread.access$900(ActivityThread.java:150)
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1344)
        at android.os.Handler.dispatchMessage(Handler.java:102)
        at android.os.Looper.loop(Looper.java:148)
        at android.app.ActivityThread.main(ActivityThread.java:5417)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:726)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:616)
     Caused by: java.lang.NullPointerException: com.project.jeremyg.multimoduledagger.App.activityInjector() returned null
        at dagger.internal.Preconditions.checkNotNull(Preconditions.java:83)
        at dagger.android.AndroidInjection.inject(AndroidInjection.java:57)
        at com.project.jeremyg.multimoduledagger.ui.activities.MainActivity.onCreate(MainActivity.java:27)
        at android.app.Activity.performCreate(Activity.java:6308)
        at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1108)
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2369)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2476) 
        at android.app.ActivityThread.access$900(ActivityThread.java:150) 
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1344) 
        at android.os.Handler.dispatchMessage(Handler.java:102) 
        at android.os.Looper.loop(Looper.java:148) 
        at android.app.ActivityThread.main(ActivityThread.java:5417) 
        at java.lang.reflect.Method.invoke(Native Method) 
        at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:726) 
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:616) 
```