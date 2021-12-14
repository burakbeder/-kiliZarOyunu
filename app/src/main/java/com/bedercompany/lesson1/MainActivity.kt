package com.bedercompany.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var baslaTusu: Button=findViewById(R.id.baslangic) // Baslatusunu tanımladık
        var bitisTusu: Button=findViewById(R.id.button2) // Bitis tusunu tanımladık


        var zarGoster: ImageView=findViewById(R.id.imageView)
        zarGoster.setImageResource(R.drawable.dice_1)
        var zarGoster1: ImageView=findViewById(R.id.imageView2)
        zarGoster1.setImageResource(R.drawable.dice_2)
        var sonGoster:ImageView=findViewById(R.id.imageView3)
        var yaziGöster1:TextView=findViewById(R.id.textView1)
        var yaziGöster2:TextView=findViewById(R.id.textView2)
        var yaziGöster3:TextView=findViewById(R.id.textView3)

        baslaTusu.setOnClickListener{

            var rastgele  = (1..6).random()
            var rastgele1 = (1..6).random()
            yaziGöster1.text= rastgele.toString()
            yaziGöster2.text= rastgele1.toString()
            yaziGöster3.text= "Oyun Başladı"
            //yaziGöster.text=rastgele.toString() // int degerini stringe gore ayarla
            Toast.makeText(this, "Oyun Başladı", Toast.LENGTH_SHORT).show()
            when(rastgele){
                1 -> zarGoster.setImageResource(R.drawable.dice_1)
                2 -> zarGoster.setImageResource(R.drawable.dice_2)
                3 -> zarGoster.setImageResource(R.drawable.dice_3)
                4 -> zarGoster.setImageResource(R.drawable.dice_4)
                5 -> zarGoster.setImageResource(R.drawable.dice_5)
                6 -> zarGoster.setImageResource(R.drawable.dice_6)
            }
            when(rastgele1){
                1 -> zarGoster1.setImageResource(R.drawable.dice_1)
                2 -> zarGoster1.setImageResource(R.drawable.dice_2)
                3 -> zarGoster1.setImageResource(R.drawable.dice_3)
                4 -> zarGoster1.setImageResource(R.drawable.dice_4)
                5 -> zarGoster1.setImageResource(R.drawable.dice_5)
                6 -> zarGoster1.setImageResource(R.drawable.dice_6)
            }

        }
        bitisTusu.setOnClickListener{
            yaziGöster3.text= "Oyun Bitti"
            sonGoster.setImageResource(R.drawable.endfoto)
            Toast.makeText(this, "Oyun Bitti GG", Toast.LENGTH_SHORT).show()
        }

    }
}
