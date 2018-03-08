package ResChain;

/**
 * Created by Blue on 2018/3/8.
 */
public abstract class Handler {
    private Handler handler;
    public int maxDay;

    protected Handler(int maxDay) {
        this.maxDay = maxDay;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    protected void handleRequest(int day) {
        if (day <= maxDay) {
            reply(day);
        } else {
            if (handler != null) {
                handler.handleRequest(day);
            } else {
                System.out.println("没有更高的领导审批了");
            }
        }
    }

    protected abstract void reply(int day);
}
