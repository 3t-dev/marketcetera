package org.marketcetera.util.auth;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.lang.StringUtils;
import org.marketcetera.core.ClassVersion;
import org.marketcetera.util.log.I18NBoundMessage;

/**
 * A setter for a character array holder that obtains the data via a
 * command-line.
 *
 * @author tlerios@marketcetera.com
 * @since 0.5.0
 * @version $Id$
 */

/* $License$ */

@ClassVersion("$Id$")
public class CliSetterCharArray
    extends CliSetter<Holder<char[]>>
{

    // CONSTRUCTORS.

    /**
     * Constructor mirroring superclass constructor.
     *
     * @see CliSetter#CliSetter(Holder,I18NBoundMessage,String,String,I18NBoundMessage)
     */

    public CliSetterCharArray
        (Holder<char[]> holder,
         I18NBoundMessage usage,
         String shortForm,
         String longForm,
         I18NBoundMessage description)
    {
        super(holder,usage,shortForm,longForm,description);
    }


    // CliSetter.

    @Override
    public void setValue
        (CommandLine commandLine)
    {
        String value=commandLine.getOptionValue(getShortForm());
        if ((value!=null) && !StringUtils.EMPTY.equals(value)) {
            getHolder().setValue(value.toCharArray());
        }
    }
}
