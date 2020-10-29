package com.lic.sso.ticket;

import lombok.Getter;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:25
 */
@Getter
public class InvalidTicketException extends AbstractTicketException {
    private static final long serialVersionUID = 8833660578860732284L;

    /**
     * The code description.
     */
    private static final String CODE = "INVALID_TICKET";

    private final String ticketId;

    /**
     * Constructs a InvalidTicketException with the default exception code.
     *
     * @param ticketId the ticket id that originally caused this exception to be thrown.
     */
    public InvalidTicketException(final String ticketId) {
        super(CODE);
        this.ticketId = ticketId;
    }

    public InvalidTicketException(final Throwable throwable, final String ticketId) {
        super(CODE, throwable);
        this.ticketId = ticketId;
    }
}
