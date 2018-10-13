package lucas.net.session;

import io.netty.channel.Channel;
import lucas.common.log.Loggers;
import lucas.net.message.INetMessage;
import org.slf4j.Logger;

/**
 * @author lushengkao vip8
 * netty会话持有的session
 * 2018/10/11 18:15
 */
public class NettySession implements ISession {

    private final static Logger LOGGER = Loggers.NET_ERROR_LOGGER;

    private volatile Channel channel;

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public void write(INetMessage message) {

    }

    @Override
    public void write(byte[] message) {

    }

    @Override
    public void close(boolean immediately) {

    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}