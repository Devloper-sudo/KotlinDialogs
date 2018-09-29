package reign.com.kotlindialogsapps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {


    // val is similar to final cannot be reassigned
    // var can be changed
    private lateinit var button: Button;
    private lateinit var button_2: Button;
    private lateinit var button_3: Button;
    private lateinit var button_4: Button;
    private lateinit var button_5: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById<Button>(R.id.button)
        button_2 = findViewById(R.id.button_2)
        button_3 = findViewById(R.id.button_3)
        button_4 = findViewById(R.id.button_4)
        button_5 = findViewById(R.id.button_5)
        button.setOnClickListener() { val dialog = DialogAskWithTwoButton(this);dialog.show(); }
        button_2.setOnClickListener() { val dialog = DialogAboutUs(this);dialog.show(); }
        button_3.setOnClickListener() { val dialog = DialogExit(this);dialog.show(); }
        button_4.setOnClickListener() { val dialog = DialogRegisterFom(this);dialog.show(); }
        button_5.setOnClickListener() { val dialog = DialogSuccess(this);dialog.show() }

    }

}
