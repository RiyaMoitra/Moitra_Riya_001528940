/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

/**
 *
 * @author harshalneelkamal
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("average of likes per comments: " + likeNumber / commentNumber);
            
    }
   
   
    public void postWithMostLikedComments(){
        Map<Integer, Integer> postwithmostLikesCount = new HashMap<>();
        Map<Integer, Post>posts=DataStore.getInstance().getPosts();
        for(Post p: posts.values()){
            
            for(Comment comment : p.getComments()){
                int likes =0;
                if(postwithmostLikesCount.containsKey(p.getPostId())){
                    likes = postwithmostLikesCount.get(p.getPostId());
                }
                likes += comment.getLikes();
                postwithmostLikesCount.put(p.getPostId(), likes);
            }
            
        }
        int max = 0;
        int maxid = 0;
        for(int id : postwithmostLikesCount.keySet()){
            if(postwithmostLikesCount.get(id) > max){
                max = postwithmostLikesCount.get(id);
                maxid = id;
            }
        }
        System.out.println("post with most liked comments" +"\n"+"postid : "+ maxid + " with likes : " + max);
    }
    
    public void postWithMostComments(){
        
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        int maxCommentSize = 0;
        int postid = 0;
        for(Post p: posts.values()){
            
            if(p.getComments().size() > maxCommentSize){
                maxCommentSize = p.getComments().size();
                postid = p.getPostId();
            }
        }
        
        System.out.println("post with most comments" +"\n"+"postid : "+ postid + " with comment size : " + maxCommentSize);
        
    }

    
    public void inactiveUsersBasedOnPosts(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Integer> users = new HashMap<>();
        
        Map<Integer, Integer> sort = new HashMap<>();
        
       
        
        for(Post p: posts.values()){
            if(!(users.containsKey(p.getUserId()))){
                users.put(p.getUserId(),1);
            }
            else{
                users.put(p.getUserId(),users.get(p.getUserId())+1);
            }
            
        }
        
          Set<Map.Entry<Integer, Integer>> entrySet = users.entrySet();
          Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                Integer value1 = entry1.getValue();
                Integer value2 = entry2.getValue();
                return value1.compareTo(value2);
            }
        };

        List<Map.Entry<Integer, Integer>> listOfEntries = new ArrayList<>(entrySet);
        Collections.sort(listOfEntries, comparator);

        System.out.println("Top 5 Inactive Users on the basis of posts:");
        if (users.size() > 5) {
            int j = 0;
            for (int i = 0; i < 5; i++) {
                j = i + 1;
                System.out.println(" user id " + listOfEntries.get(i).getKey()
                        + " with number of posts: " + listOfEntries.get(i).getValue());
            }
        }
        System.out.println();
        
    }
    

    public void inactiveUsersBasedOnComments(){
        Map<Integer, User> user = DataStore.getInstance().getUsers();
        Map<Integer, Integer> commentSize = new HashMap<>();
        
        for(User u: user.values()){
            commentSize.put(u.getId(),u.getComments().size());
        }
        
        Set<Map.Entry<Integer, Integer>> entrySet = commentSize.entrySet();
          Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                Integer value1 = entry1.getValue();
                Integer value2 = entry2.getValue();
                return value1.compareTo(value2);
            }
        };

        List<Map.Entry<Integer, Integer>> listOfEntries = new ArrayList<>(entrySet);
        Collections.sort(listOfEntries, comparator);

        System.out.println("Top 5 Inactive Users on the basis of comments:");
        if (commentSize.size() > 5) {
            int j = 0;
            for (int i = 0; i < 5; i++) {
                j = i + 1;
                System.out.println(" user id " + listOfEntries.get(i).getKey()
                        + " with number of comments: " + listOfEntries.get(i).getValue());
            }
        }
        System.out.println();

}

    public void inactiveUsersOverAll(){
        Map<Integer, User> user = DataStore.getInstance().getUsers();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        Map<Integer, Integer> inactiveOverall = new HashMap<>();
        
        for(User u: user.values()){
            inactiveOverall.put(u.getId(), u.getComments().size());
        }
        
        for(Post p: posts.values()){
            inactiveOverall.put(p.getUserId(), inactiveOverall.get(p.getUserId())+1);
        }
        
        for(Comment c : comments.values()){
            inactiveOverall.put(c.getUserId(), inactiveOverall.get(c.getUserId()) + c.getLikes());
        }
        
        
        Set<Map.Entry<Integer, Integer>> entrySet = inactiveOverall.entrySet();
          Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                Integer value1 = entry1.getValue();
                Integer value2 = entry2.getValue();
                return value1.compareTo(value2);
            }
        };

        List<Map.Entry<Integer, Integer>> listOfEntries = new ArrayList<>(entrySet);
        Collections.sort(listOfEntries, comparator);

        System.out.println("Top 5 Inactive Users based on overall criteria:");
        if (inactiveOverall.size() > 5) {
            int j = 0;
            for (int i = 0; i < 5; i++) {
                j = i + 1;
                System.out.println(" user id " + listOfEntries.get(i).getKey()
                        + " with sum of posts, comments and likes: " + listOfEntries.get(i).getValue());
            }
        }
        System.out.println();
        
    }
   
    public void proactiveUsersOverAll(){
           Map<Integer, User> user = DataStore.getInstance().getUsers();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        Map<Integer, Integer> proactiveOverall = new HashMap<>();
        
        for(User u: user.values()){
            proactiveOverall.put(u.getId(), u.getComments().size());
        }
        
        for(Post p: posts.values()){
            proactiveOverall.put(p.getUserId(), proactiveOverall.get(p.getUserId())+1);
        }
        
        for(Comment comment : comments.values()){
            proactiveOverall.put(comment.getUserId(), proactiveOverall.get(comment.getUserId()) + comment.getLikes());
        }
        
        
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(proactiveOverall.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        System.out.println("\n:\nTop 5 proactive users by overall criterias:");
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
            if (count >= 5) {
                return;
            }
            System.out.println("User Id = " + entry.getKey() + " Sum of post, likes and comments = " + entry.getValue());
            count++;
        }
    }
    }




