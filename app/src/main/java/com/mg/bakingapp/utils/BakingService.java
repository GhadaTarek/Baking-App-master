package com.mg.bakingapp.utils;

import com.mg.bakingapp.models.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BakingService {

    @GET(BakingApi.BAKING_PATH)
    Call<List<Recipe>> getRecipes();
}
