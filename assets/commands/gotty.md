# TLDR

**Share terminal as web**

```gotty [command]```

**Share with write permission**

```gotty -w [bash]```

**Specify port**

```gotty -p [8080] [command]```

**With authentication**

```gotty -c [user:pass] [command]```

**Random URL path**

```gotty --random-url [command]```

# SYNOPSIS

**gotty** [_options_] _command_

# PARAMETERS

_COMMAND_
> Command to share.

**-w**, **--permit-write**
> Allow input from browser.

**-p** _PORT_, **--port** _PORT_
> Server port.

**-c** _CRED_, **--credential** _CRED_
> Basic auth credentials.

**--random-url**
> Generate random URL path.

**--help**
> Display help information.

# DESCRIPTION

**gotty** shares terminal as a web application. It runs a command and exposes it through a web browser, enabling remote terminal access.

The tool enables sharing interactive terminals, viewing logs, and collaborative debugging. Authentication and TLS are supported for security.

gotty provides web-based terminal sharing.

# CAVEATS

Security sensitive with -w flag. Use authentication in production. Firewall considerations.

# HISTORY

gotty was created by **Iwasaki Yudai** to share terminal sessions through web browsers.

# SEE ALSO

[ttyd](/man/ttyd)(1), [tmux](/man/tmux)(1)
