package mcm.edu.ph.lost_in_space;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class a extends AppCompatActivity implements View.OnClickListener{

    TextView story;
    Button voice, objects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        story = findViewById(R.id.textView15);

        voice = findViewById(R.id.button30);
        objects = findViewById(R.id.button31);

        voice.setOnClickListener(this);
        objects.setOnClickListener(this);

        voice.setText("Follow the Voice");
        objects.setText("Catch up to Objects");
        story.setText("You turn on the jetpack, as if by muscle memory, and fly towards the warm planet. " +
                "You feel your skin getting warm as you near the sun blazing in the distance. " +
                "As you get closer to the planet, your oxygen and jetpack power slowly deplete." +
                " Something stops you on the way. There were two things orbiting the planet. " +
                "They were going fast, and it would be close with your oxygen and power supply, " +
                "but you could probably catch up to one of them. " +
                "But something made you hesitate: a sound. It was faint, but it was space, and there shouldn’t be any sound." +
                " It was almost like a voice, or a song, and for some reason, you just knew it was coming from the sun.\n");
    }
    @Override
    public void onClick (View v){

        switch(v.getId()) {
            case R.id.button30:
                Intent ac = new Intent( this,ac.class);
                startActivity(ac);
                break;
            case R.id.button31:
                Intent ad = new Intent(this,ad.class);
                startActivity(ad);
                break;
        }
    }


}