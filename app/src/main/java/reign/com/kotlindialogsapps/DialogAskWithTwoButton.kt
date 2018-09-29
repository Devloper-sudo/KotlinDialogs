package reign.com.kotlindialogsapps

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.Toast

/**
 * Created by Abhishek on 9/19/2018.
 */
class DialogAskWithTwoButton : Dialog {


    internal var context: Context;
    private lateinit var yesBtn: Button;
    private lateinit var noBtn: Button;

    constructor(context: Context) : super(context) {
        this.context = context;
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_ask_with_two_button)
        setCancelable(true)
        setCanceledOnTouchOutside(true)
        yesBtn = findViewById<Button>(R.id.btnPositive)
        noBtn = findViewById(R.id.btnNegative)
        yesBtn.setOnClickListener() { Toast.makeText(context, "Hi yes.", Toast.LENGTH_SHORT).show() }
        noBtn.setOnClickListener({ Toast.makeText(context, "Hi No.", Toast.LENGTH_SHORT).show() })


    }

}