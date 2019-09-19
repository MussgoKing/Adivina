package martinez.jimenez.adivinaelnum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acertado.*
import kotlinx.android.synthetic.main.activity_main.*

class Acertado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acertado)

        btAgain.setOnClickListener{
            val x = Intent(this,MainActivity::class.java)
            startActivity(x)
        }
    }
}
