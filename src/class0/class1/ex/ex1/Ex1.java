package class0.class1.ex.ex1;

public class Ex1 {
    public static void main(String[] args) {
        // 정보를 담을 배열 생성
        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview review1 = new MovieReview();
        review1.title = "기생충";
        review1.review = "너무너무 재밌어요";

        MovieReview review2 = new MovieReview();
        review2.title = "부산행";
        review2.review = "너무너무 무서워요";

        // 새로 만든 객체를 배열에 입력
        movieReviews[0] = review1;
        movieReviews[1] = review2;


        // 정보 출력하기
        for (MovieReview movieReview : movieReviews) {
            System.out.println(movieReview.title + "은 " + movieReview.review);
        }
    }
}
