package sg.edu.np.madexercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    User test = new User();
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent act = new Intent(MainActivity.this, MessageGroup.class);

        Intent receivingEnd = getIntent();
        int message = receivingEnd.getIntExtra("key",0);

        Button btn = (Button)findViewById(R.id.button2);
        TextView txt = findViewById(R.id.button2);
        if (test.followed=false){
            txt.setText("Follow");
        }

        TextView name = findViewById(R.id.textView);
        name.setText("MAD " + message);

        TextView desc = findViewById(R.id.textView2);
        desc.setText(test.description);

        button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(act);
            }
        });

    }

    public void onClick(View v){
        TextView txt = findViewById(R.id.button2);

        test.followed = !test.followed;
        txt.setText(test.followed ? "Unfollow" : "Follow");

        if (txt.getText() == "Follow"){
            Toast.makeText(getApplicationContext(),"Unfollowed",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Followed",Toast.LENGTH_SHORT).show();
        }

    }



}