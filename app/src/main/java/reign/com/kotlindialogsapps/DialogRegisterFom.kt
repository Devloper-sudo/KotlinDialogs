package reign.com.kotlindialogsapps

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * Created by Abhishek on 9/29/2018.
 */
class DialogRegisterFom :Dialog{

    internal var context:Context;
    private lateinit var sign_up:TextView;
    private lateinit var cancel_btn:TextView

    constructor(context: Context):super(context){
        this.context=context;
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_register)
        setCancelable(true)
        setCanceledOnTouchOutside(true)

        sign_up=findViewById(R.id.sign_up)
        cancel_btn=findViewById(R.id.cancel)

        sign_up.setOnClickListener(){
            Toast.makeText(context,"Sign up",Toast.LENGTH_SHORT).show();
        }

        cancel_btn.setOnClickListener() {
            Toast.makeText(context, "Cancel", Toast.LENGTH_SHORT).show();
        }


        }
}