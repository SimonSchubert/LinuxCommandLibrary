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

**prosodyctl** manages the Prosody XMPP/Jabber server. It handles service control and user management.

User management creates and removes accounts. Password changes are immediate.

Configuration checking validates setup. This catches errors before restart.

Certificate commands manage TLS. Import, generate, and check certificates.

Service control integrates with init systems. Start, stop, and reload operations.

# CAVEATS

Requires root for most operations. Some commands need Prosody running. JID format required for users.

# HISTORY

**Prosody** was started by **Matthew Wild** in **2008** as a lightweight XMPP server. It's known for being modular, standards-compliant, and memory-efficient.

# SEE ALSO

[ejabberdctl](/man/ejabberdctl)(1), [prosody](/man/prosody)(8)
