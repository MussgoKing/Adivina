package martinez.jimenez.adivinaelnum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acertado.*
import kotlinx.android.synthetic.main.activity_fail.*

class Fail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fail)

        btTryAgain.setOnClickListener{
            val x = Intent(this,MainActivity::class.java)
            startActivity(x)
        }
    }
}
