// Justin Chipman n01598472
package justin.chipman.n01598472;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<String> selectedProvince = new MutableLiveData<>();
    private final MutableLiveData<Integer> selectedIndex = new MutableLiveData<>();

    public void selectProvince(String province, int index) {
        selectedProvince.setValue(province);
        selectedIndex.setValue(index);
    }

    public LiveData<String> getSelectedProvince() {
        return selectedProvince;
    }

    public LiveData<Integer> getSelectedIndex() {
        return selectedIndex;
    }
}

