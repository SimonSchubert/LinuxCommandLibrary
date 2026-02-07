# TAGLINE

retrieve mail from remote servers

# TLDR

**Fetch mail from server**

```fetchmail```

**Fetch from specific server**

```fetchmail [mail.example.com]```

**Keep messages on server**

```fetchmail -k```

**Check for mail only**

```fetchmail -c```

**Verbose output**

```fetchmail -v```

**Run as daemon**

```fetchmail -d [300]```

**Use specific config file**

```fetchmail -f [~/.fetchmailrc]```

# SYNOPSIS

**fetchmail** [_options_] [_servers_...]

# DESCRIPTION

**fetchmail** retrieves mail from remote servers and forwards it to the local mail system. It supports POP3, IMAP, ETRN, and ODMR protocols with SSL/TLS encryption.

The tool is configured through ~/.fetchmailrc or command-line options. It can run as a daemon, periodically checking for new mail, and integrates with local MTAs.

# PARAMETERS

**-c**, **--check**
> Check for mail only, don't fetch.

**-k**, **--keep**
> Keep messages on server.

**-a**, **--all**
> Fetch all messages (including seen).

**-d** _seconds_
> Daemon mode with poll interval.

**-f** _file_
> Use alternate config file.

**-u** _user_
> Remote username.

**-p** _proto_
> Protocol (pop3, imap, etc.).

**--ssl**
> Use SSL/TLS.

**-v**, **--verbose**
> Verbose output.

**-q**, **--quit**
> Kill running daemon.

# CONFIGURATION

**~/.fetchmailrc**
> Main configuration file containing server settings, authentication, and delivery options.

# CAVEATS

Passwords in config file need protection. SSL verification recommended. Large mailboxes may be slow. Local MTA must accept forwarded mail.

# HISTORY

**fetchmail** was originally written by **Carl Harris** as popclient in **1993**. **Eric S. Raymond** took over development in **1996**, renaming it fetchmail and adding IMAP support. It became a standard tool for pulling mail from remote servers.

# SEE ALSO

[procmail](/man/procmail)(1), [mutt](/man/mutt)(1), [getmail](/man/getmail)(1), [isstrut](/man/isstrut)(1)
