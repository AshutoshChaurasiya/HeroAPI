package heroesapi;

import model.Heroes;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface HeroesAPI {
    //using object
    @POST("heroes")
    Call<Void> addHero(@Body Heroes heroes);

    //using field
    @FormUrlEncoded
    @POST("heroes")
    Call<Void> addHero (@Field("name") String name, @Field("desc") String desc);


}
