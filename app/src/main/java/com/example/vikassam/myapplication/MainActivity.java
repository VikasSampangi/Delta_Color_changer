/**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava; 
 *
 */
package com.example.vikassam.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int Rd = 0, G = 0, B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout v = (ConstraintLayout) findViewById(R.id.vik);
        v.setBackgroundColor(Color.rgb(0,0,0));

    }


    public void RE(View view) {
        Rd = Rd + 10;
        display(Rd, G, B);
    }

    public void GR(View view) {
        G = G + 10;

        display(Rd, G, B);
    }

    public void BL(View view) {
        B = B + 10;

        display(Rd, G, B);
    }

    public void Reset(View view) {
        Rd = 0;
        B = 0;
        G = 0;

        display(Rd,G,B);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number, int n, int nu) {

        if ((Rd>255) && (G>255) && (B>255))
        {
            ConstraintLayout v = (ConstraintLayout) findViewById(R.id.vik);
            v.setBackgroundColor(Color.rgb(0,0,0));

        }
        else
        {
            ConstraintLayout v = (ConstraintLayout) findViewById(R.id.vik);
        v.setBackgroundColor(Color.rgb(Rd, G, B));
        }
}
}