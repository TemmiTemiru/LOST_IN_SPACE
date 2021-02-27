package mcm.edu.ph.lost_in_space;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ad extends AppCompatActivity implements View.OnClickListener{

    TextView story;
    Button plain, sleek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad);
        story = findViewById(R.id.textView2);

        plain = findViewById(R.id.button4);
        sleek = findViewById(R.id.button5);

        plain.setOnClickListener(this);
        sleek.setOnClickListener(this);

        plain.setText("Plain, grey spaceship");
        sleek.setText("Sleek, dizzying spaceship");
        story.setText("You fly towards the orbiting objects. " +
                "You figured they could be spaceships, unless they were just weird metal objects orbiting a planet. " +
                "You could see the objects had distinct differences. The first one was a plain, grey spaceship, " +
                "with words stamped on the side you couldn’t quite make out and something in the back of your mind " +
                "telling you that you’ve seen this spaceship before. The second one piqued your interest. " +
                "It was sleek and round, and veins of green light ran throughout the thing like circuits of power. " +
                "Looking at it made you dizzy, but that only made you more curious to check it out. \n");


    }
    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.button4:
                Intent ade = new Intent(this, ade.class);
                startActivity(ade);
                break;
        }
        switch (v.getId()) {
            case R.id.button5:
                Intent adf = new Intent(this, adf.class);
                startActivity(adf);
                break;
        }
    }
}