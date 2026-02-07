# TAGLINE

ejabberd XMPP server control utility

# TLDR

**Start ejabberd server**

```sudo ejabberdctl start```

**Stop ejabberd server**

```sudo ejabberdctl stop```

**Check server status**

```ejabberdctl status```

**Register new user**

```ejabberdctl register [user] [domain] [password]```

**Unregister user**

```ejabberdctl unregister [user] [domain]```

**List registered users**

```ejabberdctl registered_users [domain]```

**Restart server**

```sudo ejabberdctl restart```

# SYNOPSIS

**ejabberdctl** [_options_] _command_ [_args_]

# PARAMETERS

**start**
> Start ejabberd server.

**stop**
> Stop ejabberd server.

**restart**
> Restart ejabberd server.

**status**
> Show server status.

**register** _user_ _host_ _password_
> Register new user.

**unregister** _user_ _host_
> Remove user.

**registered_users** _host_
> List users on host.

**connected_users**
> List online users.

**kick_user** _user_ _host_
> Disconnect user.

**reload_config**
> Reload configuration.

**backup** _file_
> Backup database.

**restore** _file_
> Restore database.

# CONFIGURATION

**/etc/ejabberd/ejabberd.yml**
> Main ejabberd configuration file controlling server behavior, virtual hosts, and modules.

# DESCRIPTION

**ejabberdctl** is the command-line administration tool for ejabberd, an open-source XMPP (Jabber) instant messaging server. It manages server operations, user accounts, and configuration.

The tool communicates with the running ejabberd node through Erlang RPC, allowing administration without accessing the web interface. It supports all administrative functions available through the web admin.

# CAVEATS

Requires ejabberd to be installed and configured. Some commands need root privileges. Server must be running for most commands. Database changes may require restart. Erlang environment must be properly configured.

# HISTORY

ejabberd was developed by **Alexey Shchepin** starting in **2002**, written in Erlang for scalability and fault tolerance. It became one of the most widely deployed XMPP servers, used by WhatsApp and other messaging platforms at scale.

# SEE ALSO

[prosodyctl](/man/prosodyctl)(1), [ejabberd.yml](/man/ejabberd.yml)(5), [xmpp](/man/xmpp)(7)
