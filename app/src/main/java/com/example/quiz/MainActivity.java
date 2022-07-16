package com.example.quiz;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int ans[]={0,0,1};
        ArrayList<String> qs=new ArrayList<>();
        qs.add("The Big Apple is a nickname given to Washington D.C in 1971.");
        qs.add("Hamilton the musical is the first Broadway show ever written about Hamilton.");
        qs.add("The film Moneyball is based on a true story.");
        setContentView(R.layout.activity_main);
        //Spinner sp =findViewById(R.id.spinner);
        Button b_false=findViewById(R.id.b_false);
        Button b_true=findViewById(R.id.b_true);
        Button b_det=findViewById(R.id.b_det);
        TextView t_qus= findViewById(R.id.t_qus);
        TextView t_score= findViewById(R.id.t_score);

        b_false.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(i<3) {
                    if (ans[i] == 0) {
                        t_score.setText("Questions number: " + (++i+1) + "/3");
                        t_qus.setText(qs.get(i));
                        Toast.makeText(getBaseContext(),"Good jop :)",Toast.LENGTH_SHORT).show();

                    } else
                        Toast.makeText(getBaseContext(), "Wrong answer,try again", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getBaseContext(), "Questions are over", Toast.LENGTH_LONG).show();
            }
        });
        b_true.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<3) {
                    if (ans[i] == 1) {
                        t_score.setText("Questions number: " + ++i + "/3");
                        t_qus.setText(qs.get(i));
                        Toast.makeText(getBaseContext(),"Good jop :)",Toast.LENGTH_SHORT).show();
                    } else
                        Toast.makeText(getBaseContext(), "Wrong answer, try again", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getBaseContext(), "Questions are over", Toast.LENGTH_LONG).show();
            }
        });

        b_det.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToURL("https://www.geeksforgeeks.org/how-to-implement-dependent-dropdown-in-android/");
            }
            private void goToURL(String str){
                Uri uri= Uri.parse(str);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
/*

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0: //let answere be false
                        t_qus.setText("Q1");
                        b_false.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                score++;
                                t_score.setText("Your Score is "+score+"/3");
                            }
                        });
                        b_true.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(getBaseContext(), "Wrong answer,try again",Toast.LENGTH_LONG).show();
                            }
                        });
                        break;

                    case 1:
                        t_qus.setText("Q2");
                        b_false.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                i++;
                                score++;
                                t_score.setText("Your Score is "+score+"/3");
                            }
                        });
                        b_true.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(getBaseContext(), "Wrong answer,try again",Toast.LENGTH_LONG).show();
                            }
                        });
                        break;

                    case 2:
                        t_qus.setText("Q3");
                        b_false.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                i++;
                                score++;
                                t_score.setText("Your Score is "+score+"/3");
                            }
                        });
                        b_true.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(getBaseContext(), "Wrong answer,try again",Toast.LENGTH_LONG).show();
                            }
                        });
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

 */

/*
        while(i<3){
            switch (i){
                case 0: //let answere be false
                    t_qus.setText("Q1");
                    b_false.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            i++;
                            score++;
                            t_score.setText("Your Score is "+score+"/3");
                        }
                    });
                    b_true.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(getBaseContext(), "Wrong answer,try again",Toast.LENGTH_LONG).show();
                        }
                    });
                    break;

                case 1:
                    t_qus.setText("Q2");
                    b_false.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            i++;
                            score++;
                            t_score.setText("Your Score is "+score+"/3");
                        }
                    });
                    b_true.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(getBaseContext(), "Wrong answer,try again",Toast.LENGTH_LONG).show();
                        }
                    });
                    break;

                case 2:
                    t_qus.setText("Q3");
                    b_false.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            i++;
                            score++;
                            t_score.setText("Your Score is "+score+"/3");
                        }
                    });
                    b_true.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(getBaseContext(), "Wrong answer,try again",Toast.LENGTH_LONG).show();
                        }
                    });
                    break;


            }

        }
*/
    }
}