// Justin Chipman n01598472
package justin.chipman.n01598472;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;


public class HomeFragment extends Fragment {

    ProgressBar progressBar;
    ImageButton imageButton;
    int clickCounter;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        progressBar = view.findViewById(R.id.JusprogressBar);
        imageButton = view.findViewById(R.id.JusimageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter++;
                String input = getString(R.string.justin) + " " + clickCounter;
                Toast.makeText(getActivity(), input, Toast.LENGTH_SHORT).show();
                progressBar.setProgress(clickCounter);
                if (clickCounter == 5) {
                    progressBar.setVisibility(View.GONE);
                }

                if (clickCounter == 8) {
                    getActivity().finish();
                    System.exit(0);
                }
            }
        });
    }
}