package com.example.homework40;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework40.databinding.FragmentDetailBinding;


public class DetailFragment extends Fragment {

    AnimeModel animeModel;
    FragmentDetailBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        assert getArguments() != null;
        animeModel = (AnimeModel) getArguments().getSerializable("key");
        binding.tvAnime.setText(animeModel.getAnimeName());
        binding.tvMainCharacter.setText(animeModel.getMainCharacter());
        binding.episodes.setText(String.valueOf(animeModel.getNumberOfEpisodes()));
    }
}