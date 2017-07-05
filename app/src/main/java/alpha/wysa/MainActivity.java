package alpha.wysa;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
        belowText = (TextView) findViewById(R.id.belowText);
        extra = (TextView)findViewById(R.id.extra) ;
        img = (ImageView)findViewById(R.id.img);

       Animation fade =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade);
        Animation upMove =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.up_move);
        Animation leftMove =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.left_move);
        Animation blink =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.blink);

        img.setAnimation(leftMove);
        extra.setAnimation(fade);
        titleText.setAnimation(fade);
       // midText.setAnimation(upMove);

        //Adding Custom Font
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Handwritten_Crystal_v2.ttf");
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(),  "fonts/Lato-Regular.ttf");

        titleText.setTypeface(custom_font);
        midText.setTypeface(custom_font1);
        extra.setTypeface(custom_font);
        belowText.setTypeface(custom_font);





        //Adding Links
        SpannableString ss = new SpannableString("By signing up you agree to Wysa’s Terms of Use and Privacy Policy");

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View textView) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://beta.touchkin.com/wysa.html"));
                startActivity(browserIntent);
            }
            @Override
            public void updateDrawState(TextPaint paint) {
                super.updateDrawState(paint);
                paint.setUnderlineText(false);
            }
        };

        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View textView) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://beta.touchkin.com/privatepolicy.html"));
                startActivity(browserIntent);
            }
            @Override
            public void updateDrawState(TextPaint paint) {

                super.updateDrawState(paint);
                paint.setUnderlineText(false);
            }
        };

        ss.setSpan(clickableSpan1, 33, 46, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan2, 51,65,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(new StyleSpan(Typeface.BOLD), 35, 47, 0);
        ss.setSpan(new StyleSpan(Typeface.BOLD), 51, 65, 0);
        ForegroundColorSpan fcs1 = new ForegroundColorSpan(Color.BLACK);
        ForegroundColorSpan fcs2 = new ForegroundColorSpan(Color.BLACK);
        ss.setSpan(fcs1, 34, 46, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        ss.setSpan(fcs2, 51, 65, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        midText.setText(ss);
        midText.setMovementMethod(LinkMovementMethod.getInstance());
        midText.setHighlightColor(Color.TRANSPARENT);



        belowText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Let's Chat",Toast.LENGTH_SHORT).show();
            }
        });


            titleText.setText("Hi there,\nI\'m wysa");

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    titleText.setText("I\'m here\nto Listen");
                }
            }, 3000);

    }
}
