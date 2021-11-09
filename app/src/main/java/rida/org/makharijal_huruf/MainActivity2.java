package rida.org.makharijal_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button hal,lah,tar,sha,nit,lis,ghu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        hal=(Button) findViewById(R.id.button2);
        hal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("btn","halqiyah");
                startActivity(intent);
            }
        });
        lah=(Button) findViewById(R.id.button3);
        lah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("btn","lahatiyah");
                startActivity(intent);
            }
        });
        sha=(Button) findViewById(R.id.button6);
        sha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("btn","shajariyah");
                startActivity(intent);
            }
        });
        tar=(Button) findViewById(R.id.button5);
        tar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("btn","tarfiyah");
                startActivity(intent);
            }
        });
        nit=(Button) findViewById(R.id.button4);
        nit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("btn","niteeyah");
                startActivity(intent);
            }
        });
        lis=(Button) findViewById(R.id.button7);
        lis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("btn","lisaveyah");
                startActivity(intent);
            }
        });
        ghu=(Button) findViewById(R.id.button8);
        ghu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("btn","ghunna");
                startActivity(intent);
            }
        });
    }
}