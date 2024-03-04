package justin.chipman.n01598472;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SettingsFragment extends Fragment {

    private TextView textViewClock;
    private TextView textViewProvince;
    private TextView textViewIndex;

    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_settings, container, false);
        SharedViewModel model = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        textViewClock = rootView.findViewById(R.id.textViewClock);
        textViewProvince = rootView.findViewById(R.id.textViewProvince);
        textViewIndex = rootView.findViewById(R.id.textViewIndex);

        // Update clock every second
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                String currentTime = new SimpleDateFormat("HH:mm:ss", Locale.CANADA).format(new Date());
                textViewClock.setText(currentTime);
                handler.postDelayed(this, 1000);
            }
        }, 10);

        model.getSelectedProvince().observe(getViewLifecycleOwner(), province -> {
            textViewProvince.setText(province);
        });

        model.getSelectedIndex().observe(getViewLifecycleOwner(), index -> {
            textViewIndex.setText(String.valueOf(index));
        });

        return rootView;
    }
}
