package login.com.girish.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import java.util.Random;

public class MyRndService extends Service {
    private Random random = new Random();
    public MyRndService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //This is used for initialization...
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "onCreate() ", Toast.LENGTH_SHORT).show();

    }

    //Here we perform logics
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "onStartCommand() "+random.nextInt(), Toast.LENGTH_SHORT).show();

        return super.onStartCommand(intent, flags, startId);
    }

    //destroy it  but don't forget to clean resource...
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show();
    }
}
