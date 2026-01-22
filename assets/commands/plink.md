# TLDR

**Connect to SSH server**

```plink [user]@[host]```

**Execute remote command**

```plink [user]@[host] [command]```

**Use specific port**

```plink -P [port] [user]@[host]```

**Use private key**

```plink -i [key.ppk] [user]@[host]```

**SSH tunnel**

```plink -L [local_port]:[remote_host]:[remote_port] [user]@[host]```

# SYNOPSIS

**plink** [_options_] [_user_@]_host_ [_command_]

# PARAMETERS

_HOST_
> Remote host.

**-P** _PORT_
> Port number.

**-i** _KEY_
> Private key file.

**-L** _TUNNEL_
> Local port forward.

**-batch**
> Non-interactive mode.

**--help**
> Display help.

# DESCRIPTION

**plink** is PuTTY's command-line SSH client. Remote command execution.

The tool provides SSH connectivity. Part of PuTTY suite.

plink connects via SSH.

# CAVEATS

Part of PuTTY. Uses PPK key format. Windows/Unix versions.

# HISTORY

Plink is part of **PuTTY** for command-line SSH operations.

# SEE ALSO

[ssh](/man/ssh)(1), [putty](/man/putty)(1), [pscp](/man/pscp)(1)

