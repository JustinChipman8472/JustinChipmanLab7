package justin.chipman.n01598472;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class JustinFragment extends Fragment {

    private RadioGroup radioGroup;

    public JustinFragment() {
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
        return inflater.inflate(R.layout.fragment_justin, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        radioGroup = view.findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Find the radiobutton by returned id
                RadioButton radioButton = view.findViewById(checkedId);
                AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create();
                alertDialog.setIcon(R.drawable.ichigo);
                alertDialog.setTitle(getString(R.string.justin_chipman));
                alertDialog.setMessage(radioButton.getText().toString());
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, getString(R.string.ok),
                        (dialog, which) -> dialog.dismiss());
                alertDialog.setCancelable(false);
                alertDialog.show();
            }
        });
    }
}