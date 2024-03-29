package com.project.soulsoundapp.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.soulsoundapp.R;
import com.project.soulsoundapp.adapter.AlbumAdpater;
import com.project.soulsoundapp.model.Album;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    private RecyclerView rvDiscover;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addControl(view);
    }

    private void addControl(View view) {
        rvDiscover = view.findViewById(R.id.rvDiscover);

        AlbumAdpater albumAdpater = new AlbumAdpater(getContext());
        albumAdpater.setAlbums(laydulieu());

        LinearLayoutManager managerDiscover = new LinearLayoutManager(getContext());
        managerDiscover.setOrientation(LinearLayoutManager.HORIZONTAL);

        rvDiscover.setLayoutManager(managerDiscover);
        rvDiscover.setAdapter(albumAdpater);
    }

    private List<Album> laydulieu() {
        List<Album> albums = new ArrayList<>();
        albums.add(new Album("A001", "ABC", new Date(2020, 12, 30), "Gi Gi Do", R.drawable.img_kpop));
        albums.add(new Album("A001", "ABC", new Date(2020, 12, 30), "Gi Gi Do", R.drawable.img_kpop));
        albums.add(new Album("A001", "ABC", new Date(2020, 12, 30), "Gi Gi Do", R.drawable.img_kpop));
        albums.add(new Album("A001", "ABC", new Date(2020, 12, 30), "Gi Gi Do", R.drawable.img_kpop));
        albums.add(new Album("A001", "ABC", new Date(2020, 12, 30), "Gi Gi Do", R.drawable.img_kpop));
        albums.add(new Album("A001", "ABC", new Date(2020, 12, 30), "Gi Gi Do", R.drawable.img_kpop));
        albums.add(new Album("A001", "ABC", new Date(2020, 12, 30), "Gi Gi Do", R.drawable.img_kpop));
        albums.add(new Album("A001", "ABC", new Date(2020, 12, 30), "Gi Gi Do", R.drawable.img_kpop));
        albums.add(new Album("A001", "ABC", new Date(2020, 12, 30), "Gi Gi Do", R.drawable.img_kpop));
        albums.add(new Album("A001", "ABC", new Date(2020, 12, 30), "Gi Gi Do", R.drawable.img_kpop));
        albums.add(new Album("A001", "ABC", new Date(2020, 12, 30), "Gi Gi Do", R.drawable.img_kpop));
        albums.add(new Album("A001", "ABC", new Date(2020, 12, 30), "Gi Gi Do", R.drawable.img_kpop));
        albums.add(new Album("A001", "ABC", new Date(2020, 12, 30), "Gi Gi Do", R.drawable.img_kpop));
        return albums;

    }

}