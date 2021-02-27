package mcm.edu.ph.lost_in_space;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class start extends AppCompatActivity implements View.OnClickListener{

    TextView story;
    Button warm, cold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        story = findViewById(R.id.textView);

        warm = findViewById(R.id.button);
        cold = findViewById(R.id.button2);

        warm.setOnClickListener(this);
        cold.setOnClickListener(this);

        story.setText("Your eyes open to see space. A dark, endless void as far as your vision can " +
                "reach. You try to remember what happened, how you found yourself in this heavy spacesuit." +
                "You look at the monitor on your arm." +
                " Your oxygen is halfway depleted, and jetpack power a little less. " +
                "You quickly look around you to see anything you could possibly " +
                "tether yourself to. You seemed to be in the middle of two planets: one nearer to the star system’s" +
                " sun, orange and warm, and the other was further, blue and cold.\n");
    }
    @Override
    public void onClick (View v){

        switch(v.getId()) {
            case R.id.button:
                Intent warm = new Intent( start.this,a.class);
                startActivity(warm);
                break;
            case R.id.button2:
                Intent cold = new Intent(start.this,b.class);
                startActivity(cold);
                break;
        }
    }

}