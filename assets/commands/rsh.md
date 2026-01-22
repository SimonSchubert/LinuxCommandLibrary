# TLDR

Execute a **command** on a remote host

```rsh remote_host ls -l```

Execute with **specific username**

```rsh remote_host -l username ls -l```

Execute with **stdin redirected** to /dev/null

```rsh remote_host --no-err ls -l```

# SYNOPSIS

**rsh** [_options_] _host_ [_command_]

# PARAMETERS

**-l**, **--user** _username_
> Specify remote username

**--no-err**
> Redirect stdin from /dev/null

# DESCRIPTION

**rsh** (remote shell) executes commands on a remote host using the RSH protocol. It provides basic remote command execution capabilities.

Note: rsh transmits data unencrypted and is insecure. Use SSH for secure remote command execution.

# CAVEATS

Transmits credentials and data in plain text. Not recommended for use over untrusted networks. SSH is the secure alternative.

# HISTORY

Part of **GNU inetutils**, providing classic Unix networking utilities. Superseded by SSH for security reasons.

# SEE ALSO

[ssh](/man/ssh)(1), [rlogin](/man/rlogin)(1), [rcp](/man/rcp)(1)
