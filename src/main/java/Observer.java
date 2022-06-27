public interface Observer {

    //observe 인터페이스는 모든 옵저버 클래스에서 구현해야 하며
    //따라서 모든 옵저버들은 update 메소드를 override 해야한다.
    //temp, humidity, pressure 파라미터는 기상 정보가 변경되었을 때 옵저버한테 전달되는 상태값이다.
    void update(float temp, float humidity, float pressure);
}
