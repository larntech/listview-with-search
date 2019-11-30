package net.larntech.searchview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemsPreviewActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    ItemsModel itemsModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_preview);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        if(intent.getExtras() != null){
            itemsModel = (ItemsModel) intent.getSerializableExtra("items");
            imageView.setImageResource(itemsModel.getImages());
            textView.setText(itemsModel.getName());
        }



    }
}
