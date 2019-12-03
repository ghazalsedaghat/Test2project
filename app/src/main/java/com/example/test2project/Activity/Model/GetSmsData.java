package com.example.test2project.Activity.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetSmsData{
        @SerializedName("isNewUser")
        @Expose
        private Boolean isNewUser;
        @SerializedName("isCompleteProfile")
        @Expose
        private Boolean isCompleteProfile;

        public Boolean getNewUser() {
            return isNewUser;
        }

        public void setNewUser(Boolean newUser) {
            isNewUser = newUser;
        }

        public Boolean getCompleteProfile() {
            return isCompleteProfile;
        }

        public void setCompleteProfile(Boolean completeProfile) {
            isCompleteProfile = completeProfile;
        }
}

