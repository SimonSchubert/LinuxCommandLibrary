# TAGLINE

Execute commands on remote hosts

# TLDR

Execute a **command** on a remote host

```rexec -h remote_host ls -l```

Specify the **remote username**

```rexec -u username -h remote_host ps aux```

Suppress **error stream** creation

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
> Do not create a separate error stream

**-d**, **--password** _password_
> Specify password (use '-' to read from stdin)

# DESCRIPTION

**rexec** executes commands on a remote host using the rexec protocol (TCP port 512). It authenticates with a username and password, then runs the specified command on the remote system.

Note: rexec transmits credentials and data in plain text and is insecure. Use SSH for encrypted remote command execution.

# CAVEATS

Transmits credentials and data unencrypted. Not recommended for use over untrusted networks. Consider SSH as a secure alternative.

# HISTORY

Part of **GNU inetutils**, providing classic Unix networking utilities. Largely superseded by SSH for security reasons.

# SEE ALSO

[ssh](/man/ssh)(1), [rsh](/man/rsh)(1), [rlogin](/man/rlogin)(1)
