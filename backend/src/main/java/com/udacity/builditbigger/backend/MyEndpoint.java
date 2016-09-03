/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.udacity.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.gradle.joke.Joker;

/** An endpoint class we are exposing */
@Api(
  name = "myApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.builditbigger.udacity.com",
    ownerName = "backend.builditbigger.udacity.com",
    packagePath=""
  )
)
public class MyEndpoint {

    /** An endpoint method that provides a random joke */
    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {

        Joker joker = new Joker();
        String joke = joker.getJoke();

        MyBean response = new MyBean();
        response.setData(joke);

        return response;
    }

}
