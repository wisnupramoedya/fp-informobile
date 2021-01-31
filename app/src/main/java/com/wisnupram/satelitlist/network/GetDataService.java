package com.wisnupram.satelitlist.network;

import com.wisnupram.satelitlist.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/Oclemy/SampleJSON/338d9585/spacecrafts.json")
    Call<List<RetroPhoto>> getAllPhotos();
}
