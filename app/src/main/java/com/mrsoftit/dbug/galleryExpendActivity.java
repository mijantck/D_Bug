package com.mrsoftit.dbug;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class galleryExpendActivity extends AppCompatActivity {

    CardView cardview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_expend);

        cardview1 = findViewById(R.id.cardview1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShowDialog();
            }
        });

    }

    void ShowDialog(){
        // Create custom dialog object
        final Dialog dialog = new Dialog(galleryExpendActivity.this);
        // Include dialog.xml file
        dialog.setContentView(R.layout.item);
        // Set dialog title
        dialog.setTitle("Custom Dialog");

        ImageView image = (ImageView) dialog.findViewById(R.id.Imageview_itemView);
        image.setImageResource(R.drawable.bitmap);

        dialog.show();

        TextView declineButton = (TextView) dialog.findViewById(R.id.close_dialog);
        // if decline button is clicked, close the custom dialog
        declineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog
                dialog.dismiss();
            }
        });


    }
    }
}