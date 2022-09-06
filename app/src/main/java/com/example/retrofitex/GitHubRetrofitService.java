package com.example.retrofitex;

import com.example.retrofitex.Models.Source;

import java.util.LinkedHashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GitHubRetrofitService {

    @GET("/users/{user}/repos")
    Call<List<Source>> getGitHubData(@Path("user") String user);


}
