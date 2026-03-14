# TAGLINE

secure IMAP and POP3 email server

# TLDR

**Start Dovecot** daemon

```dovecot```

**Run in foreground** (do not daemonize)

```dovecot -F```

**Show non-default configuration** settings

```dovecot -n```

**Show full configuration** (all settings)

```dovecot -a```

**Use alternate configuration** file

```dovecot -c [/path/to/dovecot.conf]```

**Reload configuration** without restarting

```dovecot reload```

**Stop Dovecot** daemon

```dovecot stop```

**Show version**

```dovecot --version```

# SYNOPSIS

**dovecot** [_options_] [_command_]

# PARAMETERS

**-F**
> Run in foreground, do not daemonize

**-n**
> Print non-default configuration and exit

**-a**
> Print all configuration settings and exit

**-c** _config_file_
> Use specified configuration file instead of /etc/dovecot/dovecot.conf

**-p**
> Prompt for SSL key password on startup

**reload**
> Reload configuration without restarting

**stop**
> Stop the running daemon

**--build-options**
> Show build options and exit

**--version**
> Show version and exit

# CONFIGURATION

**/etc/dovecot/dovecot.conf**
> Main configuration file for protocols, authentication, and mail storage settings.

**/etc/dovecot/conf.d/**
> Modular configuration directory for protocol-specific and feature-specific settings.

# DESCRIPTION

**Dovecot** is an open-source IMAP and POP3 email server for Unix-like systems. It provides secure, fast, and standards-compliant access to email stored on the server.

The server supports various authentication methods, virtual users, and mailbox formats including Maildir and mbox. It is designed for both small and large-scale deployments with features like quota management and full-text search.

Dovecot's modular architecture allows plugins for LDAP authentication, Sieve filtering, and integration with other mail system components. The **-F** flag is commonly used in container environments or with process supervisors.

# CAVEATS

Requires proper configuration before use. TLS certificate setup needed for secure connections. Permission issues common with mailbox access. Use **dovecot -n** to verify configuration before deploying changes.

# HISTORY

Dovecot was created by **Timo Sirainen** and first released in **2002**. It was designed as a secure, fast alternative to existing IMAP servers, emphasizing correctness and standards compliance.

# SEE ALSO

[postfix](/man/postfix)(1), [doveadm](/man/doveadm)(1)
