// Justin Chipman n01598472
package justin.chipman.n01598472;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationBarView;

public class ChipmanActivity7 extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    NavigationBarView bottomNavBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bottomNavBar = findViewById(R.id.JusbottomNavigationView);
        bottomNavBar.setOnItemSelectedListener(this);
        bottomNavBar.setSelectedItemId(R.id.Jushome);
    }
    PersonFragment person = new PersonFragment();
    HomeFragment home = new HomeFragment();
    SettingsFragment settings = new SettingsFragment();
    JustinFragment justin = new JustinFragment();


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.Jusperson) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.JusflFragment, person)
                    .commit();
            return true;
        } else if (item.getItemId() == R.id.Jushome) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.JusflFragment, home)
                    .commit();
            return true;
        } else if (item.getItemId() == R.id.Justsettings) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.JusflFragment, settings)
                    .commit();
            return true;
        } else if (item.getItemId() == R.id.Justin) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.JusflFragment, justin)
                    .commit();
            return true;
        }
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.Jusaction_settings) {
            // Launch device settings
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}