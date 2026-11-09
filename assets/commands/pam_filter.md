# TAGLINE

PAM filter module for terminal I/O

# TLDR

**Run a filter** on authentication I/O

```auth required pam_filter.so run1 /path/to/filter```

**Run a filter** on session open with debug output

```session required pam_filter.so debug run1 /path/to/filter```

**Transpose upper and lower case** after login, using the bundled example filter

```session required pam_filter.so run1 /lib/security/pam_filter/upperLOWER```

**Run a filter** with PAM_TTY set to the filtered pseudo-terminal

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
> Run the filter at the second stage. For auth: pam_setcred. For session: pam_close_session. For password: PAM_UPDATE_AUTHTOK phase. For the account component, either run1 or run2 may be used.

_FILTER_
> Full pathname of the filter to run, followed by any arguments it expects.

# DESCRIPTION

**pam_filter** is a PAM module intended to be a platform for providing access to all of the input/output that passes between the user and the application. It is only suitable for tty-based and stdin/stdout applications.

The filter is always executed with the privilege of the calling application rather than that of the user, so it usually cannot be killed by the user without closing their session. It receives its arguments in the ARGS environment variable, alongside SERVICE, USER and TYPE. All module types (auth, account, password, and session) are provided.

# CAVEATS

Only suitable for tty-based and stdin/stdout applications. The only filter shipped with the module, upperLOWER, transposes upper and lower case in the input and output streams, which is mainly useful as a demonstration and is unkind to termcap-based editors.

# SEE ALSO

[pam](/man/pam)(8), [pam.conf](/man/pam.conf)(5), [pam.d](/man/pam.d)(5), [pam_tty_audit](/man/pam_tty_audit)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man8/pam_filter.8.html)```

<!-- verified: 2026-11-09 -->
