package com.bmsrental.utils;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.drawerlayout.widget.DrawerLayout;

import com.bmsrental.letsgo.common.Common;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Map;

public class UserUtils {

    public static void updateUser(View view, Map<String, Object> updateData) {
        FirebaseDatabase.getInstance().getReference(Common.USER_INFO_REF)
        .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
        .updateChildren(updateData)
        .addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Snackbar.make(view, e.getMessage(),Snackbar.LENGTH_LONG).show();
            }
        }).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Snackbar.make(view, "Updated Information Successfully...",Snackbar.LENGTH_LONG).show();

            }
        });


    }
}
