package android.myapp.app.snackbar;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
ConstraintLayout con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     button=(Button) findViewById(R.id.btn);
     con=(ConstraintLayout) findViewById(R.id.snackbar);

     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

           /*  --->> Simple Toast
             Toast.makeText(getApplicationContext(),"Welcome simple Toast",Toast.LENGTH_LONG).show();
*/

           /* ---->>> Coustom Tast
             LayoutInflater inflater = getLayoutInflater();
             View view =inflater.inflate(R.layout.toast_cust,(ViewGroup) findViewById(R.id.custom_toast));
             Toast toast = new Toast(getApplicationContext());
             toast.setDuration(Toast.LENGTH_LONG);
             toast.setGravity(Gravity.CENTER|Gravity.FILL_HORIZONTAL,0,0);
             toast.setView(view);
             toast.show();

*/
           /*---->> Simple Snackbar
             Snackbar.make(con,"Welcome to SNACKBAR",Snackbar.LENGTH_LONG).show();

*/

           Snackbar bar = Snackbar.make(con,"Welcome to SNACKBAR",Snackbar.LENGTH_INDEFINITE);
           bar.setAction("Close", new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                 // bar.dismiss();
                   Toast.makeText(getApplicationContext(),"you closed snackbar",Toast.LENGTH_LONG).show();
               }
           });
            View view = bar.getView();
            view.setBackgroundColor(Color.parseColor("#FF00FF"));
            bar.setActionTextColor(Color.BLUE);
             TextView txt =(TextView) view.findViewById(android.support.design.R.id.snackbar_text);
             txt.setTextColor(Color.YELLOW);
           bar.show();


         }



     });
    }
}
