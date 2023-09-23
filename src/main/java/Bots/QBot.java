package Bots;

import com.github.chen0040.rl.learning.qlearn.QAgent;

public class QBot {
    int stateCount;
    int actionCount;
    QAgent agent;

    public QBot(final int stateCount, final int actionCount) {
        this.stateCount = stateCount;
        this.actionCount = actionCount;
        agent = new QAgent(stateCount, actionCount);
    }
}
