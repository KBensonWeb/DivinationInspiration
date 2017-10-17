package com.kbweb.kelsi.divinationinspiration;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_PRODUCT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ProductDetailFragment frag = (ProductDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int productId = (int) getIntent().getExtras().get(EXTRA_PRODUCT_ID);
        frag.setProduct(productId);
    }
}
