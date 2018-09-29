package reign.com.kotlindialogsapps

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Window
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.dialog_ask_exit.*
import org.w3c.dom.Text

/**
 * Created by Abhishek on 9/29/2018.
 */

class DialogExit : Dialog {

    internal var context: Context;
    lateinit var yesTv: TextView;
    lateinit var noTv: TextView;

    constructor(context: Context) : super(context) {
        this.context = context;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_ask_exit)

        setCancelable(true)
        setCanceledOnTouchOutside(true)


        yesTv = findViewById(R.id.yes)
        noTv = findViewById(R.id.no)


        yesTv.setOnClickListener() { Toast.makeText(context, "Yes", Toast.LENGTH_SHORT).show() }
        noTv.setOnClickListener(){Toast.makeText(context, "No", Toast.LENGTH_SHORT).show()}

    }


}