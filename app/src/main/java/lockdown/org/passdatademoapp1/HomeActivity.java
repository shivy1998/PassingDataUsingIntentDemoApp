package lockdown.org.passdatademoapp1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity
{
    TextView tvMessage;
    protected void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_home);
        tvMessage = findViewById(R.id.tvMessage);
        Intent i= getIntent();
        Bundle c = i.getExtras();
        String name = c.getString("name");
        tvMessage.setText("Bye "+name);

    }
}
