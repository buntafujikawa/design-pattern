package chainofresponsibility;

// こちらは省略
public class SpecialSupport extends Support {

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
