package ur.netologi.domain;

public class Post<Reposts, Views, Geo> {
    private int id;
    private int owner_id;
    private int from_id;
    private int created_by;
    private int date;
    private string text;
    private int reply_owner_id;
    private int reply_post_id;
    private int friends_only;
    private CommentsInfo commentsInfo;
    private Likes likes;
    private Reposts reposts;
    private Views views;
    private Geo geo ;
    private Donut donut;
    // + get/set
}
