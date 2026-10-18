package com.mozlon.chat;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    LinearLayout screen = new LinearLayout(this);
    screen.setOrientation(LinearLayout.VERTICAL);
    screen.setPadding(24, 30, 24, 24);
    screen.setBackgroundColor(Color.rgb(13, 25, 43));

    TextView title = new TextView(this);
    title.setText("MOZLON CHAT");
    title.setTextSize(27);
    title.setTypeface(null, Typeface.BOLD);
    title.setTextColor(Color.rgb(45, 220, 190));
    screen.addView(title);

    TextView subtitle = new TextView(this);
    subtitle.setText("Connect. Chat. Stay together.");
    subtitle.setTextSize(15);
    subtitle.setTextColor(Color.LTGRAY);
    subtitle.setPadding(0, 8, 0, 30);
    screen.addView(subtitle);

    addChat(screen, "M", "Mozlon", "Welcome to MOZLON CHAT!", "Online");
    addChat(screen, "F", "Family Group", "Let's keep in touch.", "Group");
    addChat(screen, "A", "Add a Friend", "Your conversations start here.", "New");

    TextView note = new TextView(this);
    note.setText("Your conversations belong here.");
    note.setTextSize(14);
    note.setTextColor(Color.LTGRAY);
    note.setGravity(Gravity.CENTER);
    note.setPadding(0, 40, 0, 0);
    screen.addView(note);

    setContentView(screen);
}

private void addChat(LinearLayout screen, String initial,
                     String name, String message, String status) {

    LinearLayout card = new LinearLayout(this);
    card.setOrientation(LinearLayout.VERTICAL);
    card.setPadding(18, 16, 18, 16);
    card.setBackgroundColor(Color.rgb(25, 42, 63));

    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT);
    params.setMargins(0, 0, 0, 14);
    screen.addView(card, params);

    TextView heading = new TextView(this);
    heading.setText(initial + "   " + name + "   •   " + status);
    heading.setTextSize(17);
    heading.setTypeface(null, Typeface.BOLD);
    heading.setTextColor(Color.WHITE);
    card.addView(heading);

    TextView preview = new TextView(this);
    preview.setText(message);
    preview.setTextSize(14);
    preview.setTextColor(Color.LTGRAY);
    preview.setPadding(0, 8, 0, 0);
    card.addView(preview);
}

}
