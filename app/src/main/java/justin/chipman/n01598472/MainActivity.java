package justin.chipman.n01598472;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    NavigationBarView navBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navBar = findViewById(R.id.bottomNavigationView);

        navBar.setOnItemSelectedListener(this);
        navBar.setSelectedItemId(R.id.Jusperson);
    }
    PersonFragment person = new PersonFragment();
    HomeFragment home = new HomeFragment();
    SettingsFragment settings = new SettingsFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.Jusperson) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, person)
                    .commit();
            return true;
        } else if (item.getItemId() == R.id.Jushome) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, home)
                    .commit();
            return true;
        } else if (item.getItemId() == R.id.Justsettings) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, settings)
                    .commit();
            return true;
        }
        return false;
    }

}