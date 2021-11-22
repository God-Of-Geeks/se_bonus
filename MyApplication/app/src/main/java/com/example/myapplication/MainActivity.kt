package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // creating variables for our text view and button
    lateinit var tvsec: TextView
    lateinit var tvMain: TextView
    lateinit var bac: Button
    lateinit var bc: Button
    lateinit var bbrac1: Button
    lateinit var bbrac2: Button
    lateinit var bsin: Button
    lateinit var bcos: Button
    lateinit var btan: Button
    lateinit var blog: Button
    lateinit var bln: Button
    lateinit var bfact: Button
    lateinit var bsquare: Button
    lateinit var bsqrt: Button
    lateinit var binv: Button
    lateinit var b0: Button
    lateinit var b9: Button
    lateinit var b8: Button
    lateinit var b7: Button
    lateinit var b6: Button
    lateinit var b5: Button
    lateinit var b4: Button
    lateinit var b3: Button
    lateinit var b2: Button
    lateinit var b1: Button
    lateinit var bpi: Button
    lateinit var bmul: Button
    lateinit var bminus: Button
    lateinit var bplus: Button
    lateinit var bequal: Button
    lateinit var bdot: Button
    lateinit var bdiv: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // initializing variables -- navya
        tvsec = findViewById(R.id.idTVSecondary)
        tvMain = findViewById(R.id.idTVprimary)
        bac = findViewById(R.id.bac)
        bc = findViewById(R.id.bc)
        bbrac1 = findViewById(R.id.bbrac1)
        bbrac2 = findViewById(R.id.bbrac2)
        bsin = findViewById(R.id.bsin)
        bcos = findViewById(R.id.bcos)
        btan = findViewById(R.id.btan)
        blog = findViewById(R.id.blog)
        bln = findViewById(R.id.bln)
        bfact = findViewById(R.id.bfact)
        bsquare = findViewById(R.id.bsquare)
        bsqrt = findViewById(R.id.bsqrt)
        binv = findViewById(R.id.binv)
        b0 = findViewById(R.id.b0)
        b9 = findViewById(R.id.b9)
        b8 = findViewById(R.id.b8)
        b7 = findViewById(R.id.b7)
        b6 = findViewById(R.id.b6)
        b5 = findViewById(R.id.b5)
        b4 = findViewById(R.id.b4)
        b3 = findViewById(R.id.b3)
        b2 = findViewById(R.id.b2)
        b1 = findViewById(R.id.b1)
        bpi = findViewById(R.id.bpi)
        bmul = findViewById(R.id.bmul)
        bminus = findViewById(R.id.bminus)
        bplus = findViewById(R.id.bplus)
        bequal = findViewById(R.id.bequal)
        bdot = findViewById(R.id.bdot)
        bdiv = findViewById(R.id.bdiv)
        // adding on click listener to our all buttons.
        b1.setOnClickListener {
            // on below line we are appending
            // the expression to our text view.
            tvMain.text = (tvMain.text.toString() + "1")
        }
        b2.setOnClickListener {
            // on below line we are appending
            // the expression to our text view.
            tvMain.text = (tvMain.text.toString() + "2")
        }
        b3.setOnClickListener {
            // on below line we are appending
            // the expression to our text view.
            tvMain.text = (tvMain.text.toString() + "3")
        }
        b4.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "4")
        }
        b5.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "5")
        }
        b6.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "6")
        }
        b7.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "7")
        }
        b8.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "8")
        }
        b9.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "9")
        }
        b0.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "0")
        }
        bdot.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + ".")
        }
        bplus.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "+")
        }
        bdiv.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "/")
        }
        bbrac1.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "(")
        }
        bbrac2.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + ")")
        }
        bpi.setOnClickListener {
            // on clicking on pi button we are adding
            // pi value as 3.142 to our current value.
            tvMain.text = (tvMain.text.toString() + "3.142")
            tvsec.text = (bpi.text.toString())
        }
        bsin.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "sin")
        }
        bcos.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "cos")
        }
        btan.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "tan")
        }
        binv.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "^" + "(-1)")
        }
        bln.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "ln")
        }
        blog.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "log")
        }

        bminus.setOnClickListener {
            // on clicking on minus we are checking if
            // the user has already a minus operation on screen.
            // if minus operation is already present
            // then we will not do anything.
            val str: String = tvMain.text.toString()
            if (!str.get(index = str.length - 1).equals("-")) {
                tvMain.text = (tvMain.text.toString() + "-")
            }
        }
        bmul.setOnClickListener {
            // if mul sign is not present in our
            // text view then only we are adding
            // the multiplication operator to it.
            val str: String = tvMain.text.toString()
            if (!str.get(index = str.length - 1).equals("*")) {
                tvMain.text = (tvMain.text.toString() + "*")
            }
        }
        bsqrt.setOnClickListener {
            if (tvMain.text.toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                val str: String = tvMain.text.toString()
                // on below line we are calculation
                // square root of the given number.
                val r = Math.sqrt(str.toDouble())
                // on below line we are converting our double
                // to string and then setting it to text view.
                val result = r.toString()
                tvMain.setText(result)
            }
        }
        bequal.setOnClickListener {
            val str: String = tvMain.text.toString()
            // on below line we are calling an evaluate
            // method to calculate the value of expressions.
            val result: Double = evaluate(str)
            // on below line we are getting result
            // and setting it to text view.
            val r = result.toString()
            tvMain.setText(r)
            tvsec.text = str
        }
        bac.setOnClickListener {
            // on clicking on ac button we are clearing
            // our primary and secondary text view.
            tvMain.setText("")
            tvsec.setText("")
        }
        bc.setOnClickListener {
            // on clicking on c button we are clearing
            // the last character by checking the length.
            var str: String = tvMain.text.toString()
            if (!str.equals("")) {
                str = str.substring(0, str.length - 1)
                tvMain.text = str
            }
        }
        bsquare.setOnClickListener {
            if (tvMain.text.toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                // on below line we are getting the expression and then calculating the square of the number
                val d: Double = tvMain.getText().toString().toDouble()
                // on below line we are calculating the square.
                val square = d * d
                // after calculating the square we
                // are setting it to text view.
                tvMain.setText(square.toString())
                // on below line we are setting
                // the d to secondary text view.
                tvsec.text = "$d²"
            }
        }
        bfact.setOnClickListener {
            if (tvMain.text.toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                // on below line we are getting int value
                // and calculating the factorial value of the entered number.
                val value: Int = tvMain.text.toString().toInt()
                val fact: Int = factorial(value)
                tvMain.setText(fact.toString())
                tvsec.text = "$value`!"
            }

        }

    }

    fun factorial(n: Int): Int {
        // this method is use to find factorial
        return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
    }

    fun evaluate(str: String): Double {
        return object : Any() {
            // on below line we ar creating variable
            // for tracking the position and char pos.
            var pos = -1
            var ch = 0

            // below method is for moving to next character.
            fun nextChar() {
                // on below line we are incrementing our position
                // and moving it to next position.
                ch = if (++pos < str.length) str[pos].toInt() else -1
            }

            // this method is use to check the extra space
            // present int the expression and removing it.
            fun eat(charToEat: Int): Boolean {
                while (ch == ' '.toInt()) nextChar()
                // on below line we are checking the char pos
                // if both is equal then we are returning it to true.
                if (ch == charToEat) {
                    nextChar()
                    return true
                }
                return false
            }

            // below method is to parse our
            // expression and to get the ans
            // in this we are calling a parse
            // expression method to calculate the value.
            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                return x
            }

    }
} 