package kr.hs.emirim.s2019s38.mirimviewcontainar;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;

public class TapActivityTest extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap);
        TabHost  tabHost= getTabHost();
        TabHost.TabSpec tabSpecPark=tabHost.newTabSpec("PARK").setIndicator("박세리");
        tabSpecPark.setContent(R.id.linear_park);
        tabHost.addTab(tabSpecPark);

        TabHost.TabSpec tabSpecSon=tabHost.newTabSpec("SON").setIndicator("손예진");
        tabSpecSon.setContent(R.id.linear_son);
        tabHost.addTab(tabSpecSon);

        TabHost.TabSpec tabSpecAhn=tabHost.newTabSpec("AHN").setIndicator("안현무");
        tabSpecAhn.setContent(R.id.linear_ahn);
        tabHost.addTab(tabSpecAhn);

        tabHost.setCurrentTab(0);
    }
}