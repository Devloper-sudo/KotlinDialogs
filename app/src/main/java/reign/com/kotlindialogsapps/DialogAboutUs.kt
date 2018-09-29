package reign.com.kotlindialogsapps

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.text.Html
import android.view.Window
import android.widget.TextView

/**
 * Created by Abhishek on 9/19/2018.
 */


class DialogAboutUs : Dialog {


    internal lateinit var context: Context


    constructor(context: Context) : super(context) {
        this.context = context;
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_about_us)
        setCancelable(true)
        setCanceledOnTouchOutside(true)

        val text = ("<html><body>"
                + "<p align=\"justify\">"
                + context.getString(R.string.about_us) + "</p> "
                + "</body></html>")

        (findViewById<TextView>(R.id.aboutUsTv) as CustomFont).text = "" + Html.fromHtml("" + text)


    }
}