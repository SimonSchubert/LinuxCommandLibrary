# TLDR

**Connect** to a remote host

```rpcclient -U domain\username%password ip_address```

Connect **without password**

```rpcclient -U username -W domain -N ip_address```

Connect with **password hash**

```rpcclient -U domain\username --pw-nt-hash ip_address```

Execute **shell commands**

```rpcclient -U domain\username%password -c "command1;command2" ip_address```

Display **domain users** (interactive)

```rpcclient $> enumdomusers```

Display **user information** (interactive)

```rpcclient $> queryuser username```

**Create** a domain user (interactive)

```rpcclient $> createdomuser username```

# SYNOPSIS

**rpcclient** [_options_] _server_

# PARAMETERS

**-U**, **--user** _user_
> Username for authentication (domain\user%password format)

**-W**, **--workgroup** _domain_
> Workgroup or domain name

**-N**, **--no-pass**
> Connect without password

**--pw-nt-hash**
> Password is an NT hash

**-c**, **--command** _commands_
> Execute semicolon-separated commands

# DESCRIPTION

**rpcclient** is an MS-RPC client tool from the Samba suite. It allows executing RPC commands against Windows systems and Samba servers for user management, enumeration, and administration.

Interactive mode provides a shell for executing RPC commands like enumdomusers, queryuser, and createdomuser.

# CAVEATS

Requires proper credentials for most operations. Some commands require administrator privileges on the target system.

# HISTORY

Part of **Samba** suite, providing Windows interoperability tools for Unix systems.

# SEE ALSO

[smbclient](/man/smbclient)(1), [net](/man/net)(8)
