# TLDR

**Connect** to server

```tftp [server_ip] [port]```

Execute **command** directly

```tftp [server_ip] -c [command]```

Connect with **IPv6** and port range

```tftp [server_ip] -6 -R [port:port]```

Set transfer **mode** (interactive)

```mode [binary|ascii]```

**Download** file (interactive)

```get [file]```

**Upload** file (interactive)

```put [file]```

**Exit** (interactive)

```quit```

# SYNOPSIS

**tftp** [_OPTIONS_] [_HOST_ [_PORT_]]

# PARAMETERS

**-c** _COMMAND_
> Execute TFTP command and exit

**-6**
> Use IPv6

**-R** _PORT:PORT_
> Force originating port range

**-v**
> Verbose output

# INTERACTIVE COMMANDS

**get** _file_
> Download file from server

**put** _file_
> Upload file to server

**mode** _binary|ascii_
> Set transfer mode

**status**
> Show current status

**quit**
> Exit client

# DESCRIPTION

**tftp** is a client for the Trivial File Transfer Protocol, a simple protocol for transferring files without authentication. TFTP operates over UDP and is commonly used for network booting (PXE) and firmware updates.

# CAVEATS

No authentication or encryption. UDP-based, may have issues with firewalls. Limited error handling compared to FTP. Maximum file size limited by protocol.

# HISTORY

TFTP was defined in **RFC 1350** (1992) and is one of the oldest file transfer protocols. It's designed for simplicity, making it suitable for embedded systems and network boot environments.

# SEE ALSO

[ftp](/man/ftp)(1), [curl](/man/curl)(1), [wget](/man/wget)(1)
