package chainofresponsibility;

// こちらは省略
public class OddSupport extends Support {

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
