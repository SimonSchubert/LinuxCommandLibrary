# TLDR

**Start Dovecot** daemon

```dovecot```

**Check configuration**

```dovecot -n```

**Show full configuration**

```dovecot -a```

**Reload configuration**

```dovecot reload```

**Stop Dovecot**

```dovecot stop```

**Show running version**

```dovecot --version```

# SYNOPSIS

**dovecot** [_options_]

# PARAMETERS

**-n**
> Print non-default configuration.

**-a**
> Print all configuration.

**-c** _CONFIG_
> Use specified configuration file.

**reload**
> Reload configuration.

**stop**
> Stop daemon.

**--build-options**
> Show build options.

**--version**
> Show version.

**--help**
> Display help information.

# DESCRIPTION

**Dovecot** is an open-source IMAP and POP3 email server for Unix-like systems. It provides secure, fast, and standards-compliant access to email stored on the server.

The server supports various authentication methods, virtual users, and mailbox formats including Maildir and mbox. It's designed for both small and large-scale deployments with features like quota management and full-text search.

Dovecot's modular architecture allows plugins for LDAP authentication, Sieve filtering, and integration with other mail system components.

# CAVEATS

Requires proper configuration before use. Certificate setup needed for TLS. Permission issues common with mailbox access. Complex setups may need multiple config files.

# HISTORY

Dovecot was created by **Timo Sirainen** and first released in **2002**. It was designed as a secure, fast alternative to existing IMAP servers, emphasizing correctness and standards compliance.

# SEE ALSO

[postfix](/man/postfix)(1), [doveadm](/man/doveadm)(1), [sievec](/man/sievec)(1)
