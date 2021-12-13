/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projects.wsn1.nodes.timers;

import projects.wsn1.nodes.messages.WsnMsg;
import projects.wsn1.nodes.nodeImplementations.SimpleNode;
import projects.wsn1.nodes.nodeImplementations.SinkNode;
import sinalgo.nodes.timers.Timer;

/*
    @authors: pozza/jm-marcel
*/

// Timer Class - Sets the Rounds through the broadcast
public class WsnMessageTimer extends Timer {

    // Message Instance
    private WsnMsg message = null;

    // Message Attribute Setter
    public WsnMessageTimer(WsnMsg message) {
        this.message = message;
    }

    // Fires the timer setter through the broadcast
    @Override
    public void fire() {
        try {
            // Sets the Message Round to False (No Message to be Sent)
            ((SimpleNode) node).setFlag(false);
            // Gets the Next Node to Send the Message
            ((SimpleNode) node).sendDirect(message, ((SimpleNode) node).getNextNodeToBaseStation());
        } catch (ClassCastException e) {
            // Broadcast the Message
            ((SinkNode) node).broadcast(message);
        }
    }

}
