import java.util.*;
import java.util.stream.Collectors;

class News {
	
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;

    public News(int newsId, String postedByUser, String commentByUser, String comment) {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }


    public int getNewsId() {
        return newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public String getComment() {
        return comment;
    }
    
    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", postedByUser='" + postedByUser + '\'' +
                ", commentByUser='" + commentByUser + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

}


public class Assignment2 {

    public static int maxComments(List<News> news) {
    	
        List<News> news1 = news;
        List<News> list = new ArrayList<>();
        int mx=0;
        list= news.stream()
                 .filter(p->news1.stream()
                         .anyMatch(one->one.getNewsId()==p.getNewsId() && one!=p)).collect(Collectors.toCollection(ArrayList::new));
        
        Map<Integer,Integer> mp=new HashMap<>();
        for(News p:list){
               if(mp.containsKey(p.getNewsId())){
                   mp.put(p.getNewsId(),mp.get(p.getNewsId())+1);
               }
               else{
                   mp.put(p.getNewsId(),1);
               }
        }

        Set s1 = mp.entrySet();
        Iterator itr = s1.iterator();

        int id=0;
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
            if(mx<(int)m1.getValue()) {
                mx = (int) m1.getValue();
                id = (int)m1.getKey();
            }

        }
        System.out.println(mx);
        return id;

    }

    public static int budgetCount (List < News > news) {
    	
        String word= "budget";
        int budgetCount=(int) news.stream()
                .filter(p->p.getComment().contains(word)).count();
        System.out.println(budgetCount);
        return budgetCount;
        
    }


    public static Map<String, Integer> sortMaxCommentsByUser (List < News > news) {

        Map<String,Long> map =new HashMap<>();
        map = news.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));


        List<Map.Entry<String, Long> > list =
                new LinkedList<Map.Entry<String, Long> >(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Long> >() {
            public int compare(Map.Entry<String, Long> o1,
                               Map.Entry<String, Long> o2)
            {
                return -(o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Long> aa : list) {
            temp.put(aa.getKey(), (int) (long)aa.getValue());
        }
        
        return temp;

    }

    public static void main(String[] args) {

        List<News> news = new ArrayList<>();
        news.add(new News(101, "Rahul", "Akash", "Good"));
        news.add(new News(102, "Amit", "Mukesh", "Nice"));
        news.add(new News(103, "Aman", "Kunal", "wow"));
        news.add(new News(104, "Kunal", "Ajay", "ok"));
        news.add(new News(105, "Simran", "Saurabh", "wow"));
        
        maxComments(news);
        budgetCount(news);
        System.out.println( sortMaxCommentsByUser(news));
    }
}