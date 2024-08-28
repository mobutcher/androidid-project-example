
package com.ndk.ndkdemo1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.ndk.ndkdemo1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    static {
                System.loadLibrary("ndkdemoJni");
           }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate and get instance of binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // set content view to binding's roo
        setContentView(binding.getRoot());
        binding.text.setText(demo());
    }
    
    public static native String demo();
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}
