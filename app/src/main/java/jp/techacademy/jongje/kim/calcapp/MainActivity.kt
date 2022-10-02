package jp.techacademy.jongje.kim.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import com.google.android.material.snackbar.Snackbar
import android.widget.EditText


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button1 -> {

                    val str1: String = (textView1.text.toString())
                    val str2: String = (textView2.text.toString())
                    try{
                        var indata1: Double = str1.toDouble()
                        var indata2: Double = str2.toDouble()
                        var putdata: Double
                        putdata = indata1 + indata2
                        val intent = Intent(this, SecondCalcApp::class.java)

                        intent.putExtra("VALUE1", putdata)
                        startActivity(intent)
                    } catch (e: Exception) {

                            Snackbar.make(v, "数字を入力してください。", Snackbar.LENGTH_INDEFINITE)
                                .setAction("確認") {}.show()

                    }

            }



            R.id.button2 -> {
                val str1:String= (textView1.text.toString())
                val str2:String=(textView2.text.toString())
                try{
                var indata1 : Double = str1.toDouble()
                var indata2 : Double = str2.toDouble()
                var putdata : Double

                putdata=indata1-indata2
                val intent = Intent(this, SecondCalcApp::class.java)

                intent.putExtra("VALUE1",putdata)
                startActivity(intent)
                } catch (e: Exception) {

                    Snackbar.make(v, "数字を入力してください。", Snackbar.LENGTH_INDEFINITE)
                        .setAction("確認") {}.show()

                }


            }
            R.id.button3 ->{
                val str1:String= (textView1.text.toString())
                val str2:String=(textView2.text.toString())
                try{
                var indata1 : Double = str1.toDouble()
                var indata2 : Double = str2.toDouble()
                var putdata : Double

                putdata=indata1*indata2
                val intent = Intent(this, SecondCalcApp::class.java)

                intent.putExtra("VALUE1",putdata)
                startActivity(intent)
                } catch (e: Exception) {

                    Snackbar.make(v, "数字を入力してください。", Snackbar.LENGTH_INDEFINITE)
                        .setAction("確認") {}.show()

                }

            }
            R.id.button4 ->{
                val str1:String= (textView1.text.toString())
                val str2:String=(textView2.text.toString())
                try{
                var indata1 : Double = str1.toDouble()
                var indata2 : Double = str2.toDouble()
                var putdata : Double

                putdata=indata1/indata2
                val intent = Intent(this, SecondCalcApp::class.java)

                intent.putExtra("VALUE1",putdata)
                startActivity(intent)
                } catch (e: Exception) {

                    Snackbar.make(v, "数字を入力してください。", Snackbar.LENGTH_INDEFINITE)
                        .setAction("確認") {}.show()

                }

            }
        }
    }



}