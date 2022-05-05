package sg.edu.np.madexercise2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent act = new Intent(ListActivity.this, MainActivity.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Profile");
        builder.setMessage("MADness");
        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                int value = (int) Math.round((Math.random() * 1000000000)+1000000000);
                act.putExtra("key", value);
                startActivity(act);

            }

        });
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }


        });

        imageView2 = (ImageView) findViewById(R.id.imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                builder.show();
            }
        });
    }


}