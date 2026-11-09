# TAGLINE

Execute commands on remote hosts

# TLDR

Execute a **command** on a remote host, prompting for the password

```rexec -u [username] -p - -h [remote_host] "[ls -l]"```

Pass the **password** on the command line

```rexec -u [username] -p [password] -h [remote_host] "[ps aux]"```

**Disable the stderr** stream

```rexec -n -u [username] -p - -h [remote_host] "[ls -l]"```

Specify the **remote port**

```rexec -P [1234] -u [username] -p - -h [remote_host] "[ls -l]"```

# SYNOPSIS

**rexec** **-u** _user_ **-p** _password_ **-h** _host_ [_options_] _command_

# PARAMETERS

**-h**, **--host** _host_
> Remote host (required)

**-u**, **--user** _user_
> Remote username (required)

**-p**, **--password** _password_
> Password (required). Use **-** to read it from standard input, without echo on a terminal

**-P**, **--port** _port_
> Remote port (default: 512)

**-n**, **--noerr**
> Disable the stderr stream

**-e**, **--error** _port_
> TCP port to use for stderr

**-4**, **--ipv4**
> Use IPv4 only

**-6**, **--ipv6**
> Use IPv6 only

**-a**, **--ipany**
> Allow any address family (default)

# DESCRIPTION

**rexec** executes commands on a remote host using the rexec protocol (TCP port 512). It authenticates with a username and password, then runs the specified command on the remote system.

Note: rexec transmits credentials and data in plain text and is insecure. Use SSH for encrypted remote command execution.

# CAVEATS

Transmits credentials and data unencrypted. Not recommended for use over untrusted networks. Consider SSH as a secure alternative. Options must precede the command, and only the first non-option argument is used, so quote commands containing spaces. A password given on the command line is visible in the process list; prefer **-p -**.

# HISTORY

Part of **GNU inetutils**, providing classic Unix networking utilities. Largely superseded by SSH for security reasons.

# SEE ALSO

[ssh](/man/ssh)(1), [rsh](/man/rsh)(1), [rlogin](/man/rlogin)(1)

# RESOURCES

```[Source code](https://cgit.git.savannah.gnu.org/cgit/inetutils.git)```

```[Homepage](https://www.gnu.org/software/inetutils/)```

```[Documentation](https://www.gnu.org/software/inetutils/manual/)```

<!-- verified: 2026-11-09 -->
