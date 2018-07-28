package poa.senac.a02a01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtHello = edtHello
        var btnHello = btnHello
        var lblHello = lblHello

        btnHello.setOnClickListener {
            lblHello.text = edtHello.text.toString()
            Toast.makeText(this, "Olá seu filho da puta, teu nome vai aparecer ja ja seu arrombado do caralho", Toast.LENGTH_SHORT).show()


        }
    }
}
