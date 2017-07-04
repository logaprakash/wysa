package alpha.wysa;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
<<<<<<< HEAD
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
=======
>>>>>>> origin/master
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    TextView titleText,midText,belowText,extra;
    CheckBox check;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleText = (TextView)findViewById(R.id.titleText);
        midText = (TextView)findViewById(R.id.midText);
        belowText = (TextView)findViewById(R.id.belowText);
        extra = (TextView)findViewById(R.id.extra) ;
        check = (CheckBox)findViewById(R.id.check);
        img = (ImageView)findViewById(R.id.img);

<<<<<<< HEAD
       Animation fade =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade);
        Animation move =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.move);
        img.setAnimation(fade);
        extra.setAnimation(fade);
        titleText.setAnimation(fade);
        //midText.setAnimation(move);
=======
        TextView titleText = (TextView)findViewById(R.id.titleText);
        TextView midText = (TextView)findViewById(R.id.midText);
        TextView belowtext = (TextView)findViewById(R.id.belowText);
        TextView extra = (TextView)findViewById(R.id.extra) ;

        final CheckBox check = (CheckBox)findViewById(R.id.check);


>>>>>>> origin/master

        //Adding Custom Font
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Handwritten_Crystal_v2.ttf");
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(),  "fonts/Lato-Regular.ttf");

        titleText.setTypeface(custom_font);
<<<<<<< HEAD
        midText.setTypeface(custom_font1);
        belowText.setTypeface(custom_font);
        extra.setTypeface(custom_font);


        //Adding Links
        SpannableString ss = new SpannableString("I agree to wysa\'s terms of use and privacy policy");

=======
        midText.setTypeface(custom_font);
        belowtext.setTypeface(custom_font);
        extra.setTypeface(custom_font);

        SpannableString ss = new SpannableString("I agree to wysa\'s terms of use and privacy policy");
>>>>>>> origin/master
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View textView) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://beta.touchkin.com/wysa.html"));
                startActivity(browserIntent);
            }
            @Override
<<<<<<< HEAD
            public void updateDrawState(TextPaint paint) {
                super.updateDrawState(paint);
                paint.setUnderlineText(true);
            }
        };

=======
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(true);
            }
        };
>>>>>>> origin/master
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View textView) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://beta.touchkin.com/privatepolicy.html"));
                startActivity(browserIntent);
            }
            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(true);
            }
        };
        ss.setSpan(clickableSpan1, 18, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan2, 35,49,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        midText.setText(ss);
        midText.setMovementMethod(LinkMovementMethod.getInstance());
        midText.setHighlightColor(Color.TRANSPARENT);


<<<<<<< HEAD

        belowText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check.isChecked())
                    Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"Please select the checkbox to proceed",Toast.LENGTH_SHORT).show();
            }
        });
=======
>>>>>>> origin/master

        belowtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check.isChecked())
                    Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"Please select the checkbox to proceed",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
