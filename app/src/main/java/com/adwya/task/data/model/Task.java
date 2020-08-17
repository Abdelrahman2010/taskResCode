package com.adwya.task.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Task {


    public Task.feed getFeed() {
        return feed;
    }

    public void setFeed(Task.feed feed) {
        this.feed = feed;
    }

    @Expose
    @SerializedName("feed")
    private feed feed;


    public static class feed {

        public ArrayList<Task.feed.entry> getEntry() {
            return entry;
        }

        public void setEntry(ArrayList<Task.feed.entry> entry) {
            this.entry = entry;
        }

        @Expose
        @SerializedName("entry")
        private ArrayList<entry> entry;


        public static class entry {


            public Task.feed.entry.content getContent() {
                return content;
            }

            public void setContent(Task.feed.entry.content content) {
                this.content = content;
            }

            @Expose
            @SerializedName("content")
            private content content;

            public static class content {

                public String get$t() {
                    return $t;
                }

                public void set$t(String $t) {
                    this.$t = $t;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                @Expose
                @SerializedName("$t")
                private String $t;

                @Expose
                @SerializedName("type")
                private String type;


            }

        }


    }
}
