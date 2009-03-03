package org.marketcetera.core.position;

import java.math.BigDecimal;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Interface to computed position-related metrics.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id$
 * @since $Release$
 */
@ClassVersion("$Id$")
public interface PositionMetrics {

    /**
     * Returns the number of shares currently held in the position. A positive
     * value indicates a long position and a negative value indicates a short
     * position.
     * 
     * @return the position, null if unknown
     */
    BigDecimal getPosition();

    /**
     * Returns the current P&L value of the incoming position. A positive value
     * indicates a profit and a negative value indicates a loss.
     * 
     * @return the positional P&L, null if unknown
     */
    BigDecimal getPositionPL();

    /**
     * Returns the current P&L value of the day's trading activity. A positive
     * value indicates a profit and a negative value indicates a loss.
     * 
     * @return the trading P&L, null if unknown
     */
    BigDecimal getTradingPL();

    /**
     * Returns the P&L value of the positions closed during the current day. A
     * positive value indicates a profit and a negative value indicates a loss.
     * 
     * @return the realized P&L, null if unknown
     */
    BigDecimal getRealizedPL();

    /**
     * Returns the current P&L value of the open positions. A positive value
     * indicates a profit and a negative value indicates a loss.
     * 
     * @return the unrealized P&L, null if unknown
     */
    BigDecimal getUnrealizedPL();

    /**
     * Returns the current total P&L value which is the sum of the realized and
     * unrealized P&L (it is also the sum of the positional and trading P&L). A
     * positive value indicates a profit and a negative value indicates a loss.
     * 
     * @return the total P&L, null if unknown
     */
    BigDecimal getTotalPL();

}