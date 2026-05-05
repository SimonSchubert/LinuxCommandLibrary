# TAGLINE

Share terminal as a web application

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
> Basic authentication credentials in the form user:pass.

**-r**, **--random-url**
> Add a random string to the URL path.

**-t**, **--tls**
> Enable TLS/SSL.

**--tls-crt** _PATH_
> Path to TLS certificate file.

**--tls-key** _PATH_
> Path to TLS key file.

**--reconnect**
> Allow client to reconnect after the connection is closed.

**--once**
> Quit after the first client disconnects.

**--config** _FILE_
> Configuration file path.

**--help**
> Display help information.

# DESCRIPTION

**gotty** shares a terminal command as a web application accessible through a browser. It runs a command and exposes it through HTTP, enabling remote terminal access, log viewing, and collaborative debugging.

Authentication and TLS are supported for secure deployments. The **-w** flag enables browser users to send input to the running command.

# CONFIGURATION

**~/.gotty**
> Configuration file for default settings like port, TLS certificates, and credential options.

# CAVEATS

Security sensitive with -w flag. Use authentication in production. Firewall considerations.

# HISTORY

gotty was created by **Iwasaki Yudai** to share terminal sessions through web browsers.

# SEE ALSO

[ttyd](/man/ttyd)(1), [tmux](/man/tmux)(1)
