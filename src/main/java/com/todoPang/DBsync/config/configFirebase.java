package com.todoPang.DBsync.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import com.google.firebase.cloud.FirestoreClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.*;

@Configuration
public class configFirebase {

    @Bean
    public Firestore firestore() throws Exception {

        // Fetch AccountInfo
        InputStream serviceAccount = getClass().getClassLoader().getResourceAsStream("teamplan-378214-7724d03b5255.json");
        if (serviceAccount == null) {
            throw new IllegalStateException("Firebase service account file not found");
        }
        // Init Firebase
        GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(credentials)
                .build();
        FirebaseApp.initializeApp(options);
        return FirestoreClient.getFirestore();
    }
}

