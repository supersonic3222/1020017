package ca.cours5b5.remybrin_fortier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Parametres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametres);

        Log.d("MonEtiquette", this.getResources().getString(R.string.message));

        if (this.getResources().getBoolean(R.bool.estPaysage)) {
            Log.d("MonEtiquette", (this.getResources().getString(R.string.message) + "(paysage)"));
        } else if (this.getResources().getBoolean(R.bool.estPortrait)) {
            Log.d("MonEtiquette", (this.getResources().getString(R.string.message) + "(portrait)"));
        }
    }
}
