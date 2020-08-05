package com.example.calculadorasimples;

import android.util.Log;
import android.view.View;

public class Controlador_do_BTCalcular implements View.OnClickListener{
    MainActivity mainActivity;

    public Controlador_do_BTCalcular(MainActivity p_mainActivity){
        this.mainActivity=p_mainActivity;
    }
    @Override
    public void onClick(View view) {
        Log.v("PDM","Valor2:"+this.mainActivity.oper1.getText());


        double numOper1 = Double.parseDouble(this.mainActivity.oper1.getText().toString());
        double numOper2 = Double.parseDouble(this.mainActivity.oper2.getText().toString());
        double res=0;



        switch (this.mainActivity.operacao){
            case 0:
                res= numOper1+numOper2;

                break;
    }
        Log.v("PDM","Valor Res:"+res);

    }
}
