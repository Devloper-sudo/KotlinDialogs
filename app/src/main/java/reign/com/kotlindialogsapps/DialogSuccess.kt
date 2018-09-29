package reign.com.kotlindialogsapps

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Window

/**
 * Created by Abhishek on 9/29/2018.
 */
class DialogSuccess : Dialog {

    internal val context: Context;

    constructor(context: Context):super(context) {
        this.context = context;
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_success)



    }
}