package videoview.example.com.videoview;

import android.app.Activity;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends Activity {
    private VideoView mVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoView =(VideoView)findViewById(R.id.surface_view);
        //de forma alternativa si queremos un streaming usar
        //mVideoView.setVideoURI(Uri.parse(URLstring));
        mVideoView.setVideoPath("/storage/sdcard/media/video.mp4");
        mVideoView.start();
        mVideoView.requestFocus();
    }
}
