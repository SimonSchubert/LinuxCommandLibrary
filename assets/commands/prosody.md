# TLDR

**Start Prosody**

```prosodyctl start```

**Stop Prosody**

```prosodyctl stop```

**Add user**

```prosodyctl adduser [user@domain]```

**Check configuration**

```prosodyctl check```

**Show status**

```prosodyctl status```

# SYNOPSIS

**prosodyctl** _command_ [_options_]

# PARAMETERS

**start**
> Start the server.

**stop**
> Stop the server.

**restart**
> Restart the server.

**status**
> Show server status.

**adduser** _jid_
> Add XMPP user.

**passwd** _jid_
> Change password.

**deluser** _jid_
> Delete user.

**check**
> Check configuration.

# DESCRIPTION

**Prosody** is a lightweight XMPP/Jabber server written in Lua. It's designed to be easy to set up and configure while remaining extensible through modules.

# EXAMPLES

```bash
# Start server
prosodyctl start

# Add user
prosodyctl adduser alice@example.com

# Change password
prosodyctl passwd alice@example.com

# Check configuration
prosodyctl check config

# Check DNS records
prosodyctl check dns

# View certificates
prosodyctl check certs
```

# CONFIGURATION

```lua
-- /etc/prosody/prosody.cfg.lua
VirtualHost "example.com"
  enabled = true

admins = { "admin@example.com" }

modules_enabled = {
  "roster"; "saslauth"; "tls";
}
```

# CAVEATS

Requires Lua. Configuration in /etc/prosody/. Certificates needed for TLS.

# HISTORY

Prosody was created by **Matthew Wild** starting in 2008 as a modern, lightweight XMPP server.

# SEE ALSO

[ejabberd](/man/ejabberd)(1), [openfire](/man/openfire)(1), [xmpp](/man/xmpp)(7)
