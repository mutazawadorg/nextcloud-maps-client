package it.danieleverducci.nextcloudmaps.activity.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import it.danieleverducci.nextcloudmaps.model.Geofavorite;
import it.danieleverducci.nextcloudmaps.repository.GeofavoriteRepository;

public class GeofavoriteDetailActivityViewModel extends ViewModel {
    private GeofavoriteRepository mRepo;

    public void init() {
        mRepo = GeofavoriteRepository.getInstance();
    }

    public Geofavorite getGeofavorite(int id) {
        return mRepo.getGeofavorite(id);
    }

    public void saveGeofavorite(Geofavorite geofav) {
        mRepo.saveGeofavorite(geofav);
    }

    public LiveData<HashSet<String>> getCategories(){
        return mRepo.getCategories();
    }

    public LiveData<Boolean> getIsUpdating(){
        return mRepo.isUpdating();
    }

    public LiveData<Boolean> getOnFinished(){
        return mRepo.onFinished();
    }

}
