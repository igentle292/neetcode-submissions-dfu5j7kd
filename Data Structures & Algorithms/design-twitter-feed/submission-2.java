class Twitter {
    Map<Integer, Set<Integer>> followMap;   //userid, set<userIDs + self>
    List<int[]> tweets;                     //{userId, tweetId}

    public Twitter() {
        followMap = new HashMap<>();
        tweets = new ArrayList<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        follow(userId, userId);
        int[] arr = {userId, tweetId};
        tweets.add(arr);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        if(tweets.isEmpty()){
            return Collections.emptyList();
        }
        List<Integer> feed = new ArrayList<>();
        int counter = 0;
        for(int i=tweets.size() - 1; i>=0 && counter < 10; i--){
            if(followMap.get(userId).contains(tweets.get(i)[0])){
                feed.add(tweets.get(i)[1]);
                counter++;
            }
        }

        return feed;
    }
    
    public void follow(int followerId, int followeeId) {
        if(followMap.containsKey(followerId)){
            followMap.get(followerId).add(followeeId);
        } else{
            Set<Integer> followSet = new HashSet<>();
            followSet.add(followeeId);
            followSet.add(followerId);
            followMap.put(followerId, followSet);
        }
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(followerId != followeeId && followMap.containsKey(followerId)){
            followMap.get(followerId).remove(followeeId);
        }
    }
}
