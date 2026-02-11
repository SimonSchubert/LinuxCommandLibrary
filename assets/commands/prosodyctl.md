# TAGLINE

Control and manage the Prosody XMPP server

# TLDR

**Start server**

```prosodyctl start```

**Stop server**

```prosodyctl stop```

**Check status**

```prosodyctl status```

**Add user**

```prosodyctl adduser [user@domain.com]```

**Delete user**

```prosodyctl deluser [user@domain.com]```

**Change password**

```prosodyctl passwd [user@domain.com]```

**Check configuration**

```prosodyctl check```

**Reload configuration**

```prosodyctl reload```

# SYNOPSIS

**prosodyctl** _command_ [_args_]

# PARAMETERS

**start**
> Start Prosody.

**stop**
> Stop Prosody.

**restart**
> Restart Prosody.

**status**
> Show status.

**reload**
> Reload configuration.

**adduser** _JID_
> Create user account.

**deluser** _JID_
> Delete user account.

**passwd** _JID_
> Change password.

**check**
> Validate configuration.

**about**
> Version and paths.

**cert**
> Certificate management.

# DESCRIPTION

**prosodyctl** is the administration tool for the Prosody XMPP/Jabber server, providing service control, user management, and configuration validation from the command line. It can start, stop, restart, and reload the server, with reload applying configuration changes without disconnecting users.

User management commands handle XMPP account lifecycle: creating accounts with **adduser**, removing them with **deluser**, and resetting passwords with **passwd**. All user operations use JID (Jabber ID) format like **user@domain.com**.

The **check** command validates the Prosody configuration, DNS records, and TLS certificates before applying changes, catching common setup errors. Certificate management commands help import, generate, and inspect TLS certificates needed for secure XMPP connections.

# CAVEATS

Requires root for most operations. Some commands need Prosody running. JID format required for users.

# HISTORY

**Prosody** was started by **Matthew Wild** in **2008** as a lightweight XMPP server. It's known for being modular, standards-compliant, and memory-efficient.

# SEE ALSO

[ejabberdctl](/man/ejabberdctl)(1), [prosody](/man/prosody)(8)
