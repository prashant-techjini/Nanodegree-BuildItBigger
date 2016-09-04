package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.text.TextUtils;

import java.util.concurrent.CountDownLatch;

public class JokeDownloaderTaskTest extends AndroidTestCase implements JokeDownloaderTask.JokeDownloadListener {

    private String joke = null;
    CountDownLatch countDownLatch = new CountDownLatch(1);

    public void testJokeDownloadTask() throws InterruptedException {
        new JokeDownloaderTask(this).execute();
        countDownLatch.await();

        assertTrue(!TextUtils.isEmpty(joke));
    }

    @Override
    public void onJokeDownloaded(String joke) {
        this.joke = joke;
        countDownLatch.countDown();
    }
}
