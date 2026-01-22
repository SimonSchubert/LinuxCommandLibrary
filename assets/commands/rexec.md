# TLDR

Execute a **command** on a remote host

```rexec -h remote_host ls -l```

Specify the **remote username**

```rexec -u username -h remote_host ps aux```

Redirect **stdin from /dev/null**

```rexec -n -h remote_host ls -l```

Specify the **remote port**

```rexec -P 1234 -h remote_host ls -l```

# SYNOPSIS

**rexec** [_options_] _command_

# PARAMETERS

**-h**, **--host** _host_
> Specify remote host

**-u**, **--username** _user_
> Specify remote username

**-P**, **--port** _port_
> Specify remote port

**-n**, **--noerr**
> Redirect stdin from /dev/null

# DESCRIPTION

**rexec** executes commands on a remote host using the rexec protocol. It provides basic remote command execution capabilities.

Note: rexec transmits data in plain text and is insecure. Use SSH for encrypted remote command execution.

# CAVEATS

Transmits credentials and data unencrypted. Not recommended for use over untrusted networks. Consider SSH as a secure alternative.

# HISTORY

Part of **GNU inetutils**, providing classic Unix networking utilities. Largely superseded by SSH for security reasons.

# SEE ALSO

[ssh](/man/ssh)(1), [rsh](/man/rsh)(1), [rlogin](/man/rlogin)(1)
