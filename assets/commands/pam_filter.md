# TAGLINE

PAM filter module for terminal I/O

# TLDR

**Run a filter** on authentication I/O

```auth required pam_filter.so run1 /path/to/filter```

**Run a filter** on session open with debug output

```session required pam_filter.so debug run1 /path/to/filter```

**Run a filter** with a new pseudo-terminal allocated

```session required pam_filter.so new_term run1 /path/to/filter```

# SYNOPSIS

**pam_filter.so** [debug] [new_term] [non_term] run1|run2 _filter_ [_..._]

# PARAMETERS

**debug**
> Print debug information to syslog.

**new_term**
> Set PAM_TTY to the filtered pseudo-terminal. The default action is to set PAM_TTY to indicate the terminal the user is using to connect.

**non_term**
> Do not try to set the PAM_TTY item.

**run1** _FILTER_
> Run the filter at the first stage. For auth: pam_authenticate. For session: pam_open_session. For password: PAM_PRELIM_CHECK phase.

**run2** _FILTER_
> Run the filter at the second stage. For auth: pam_setcred. For session: pam_close_session. For password: PAM_UPDATE_AUTHTOK phase.

# DESCRIPTION

**pam_filter** is a PAM module intended to be a platform for providing access to all of the input/output that passes between the user and the application. It is only suitable for tty-based and stdin/stdout applications.

The filter is always called with the filter as argv[0], followed by the connection type and the PAM service type. All module types (auth, account, password, and session) are provided.

# CAVEATS

This is an experimental module. The filter must be an executable binary. Only suitable for tty-based and stdin/stdout applications. There are no known filters provided with the standard PAM distribution.

# SEE ALSO

[pam](/man/pam)(8), [pam_tty_audit](/man/pam_tty_audit)(8)

