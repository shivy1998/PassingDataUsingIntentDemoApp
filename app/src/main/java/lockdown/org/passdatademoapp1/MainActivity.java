package lockdown.org.passdatademoapp1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
public class MainActivity extends AppCompatActivity
{
    EditText etName;
    Button btnSend;
    protected void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String name = etName.getText().toString();
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                i.putExtra("name",name);
                startActivity(i);
            }
        });
    }
}
