package martinez.jimenez.adivinaelnum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btJugar.setOnClickListener {
            val numazar: Int = (0..10).random()
            val editTextNum = etNum.getText().toString()
            if (editTextNum.equals("")) {
                mensaje("Introduce un numero del 1 al 10!")
            } else {
                var numJuInt = editTextNum.toInt()
                if (numJuInt == numazar) {
                    mensaje("ACERTASTE!!")
                    val i = Intent(this, Acertado::class.java)
                    startActivity(i)
                } else
                    mensaje("Suerte para la próxima")
                mensaje("El numero era: $numazar")

                val f = Intent(this, Fail::class.java)
                startActivity(f)
            }
        }
    }
    fun mensaje(mensaje:String) {
        Toast.makeText(this,mensaje, Toast.LENGTH_LONG).show()
    }
}
