# TAGLINE

Remote login to another host

# TLDR

**Log in** to a remote host

```rlogin [remote_host]```

**Log in with a specific username**

```rlogin -l [username] [remote_host]```

**Log in using user@host syntax**

```rlogin [username]@[remote_host]```

**Use a custom escape character** instead of the default tilde

```rlogin -e [^] [remote_host]```

**Force IPv4 connection**

```rlogin -4 [remote_host]```

**Allow 8-bit data** (for non-ASCII locales)

```rlogin -8 [remote_host]```

**Fully transparent session** with no escape character

```rlogin -8 -E [remote_host]```

# SYNOPSIS

**rlogin** [**-468dEKx**] [**-e** _char_] [**-k** _realm_] [**-l** _username_] [_user_**@**]_host_

# PARAMETERS

**-4**, **--ipv4**
> Use IPv4 addresses only.

**-6**, **--ipv6**
> Use IPv6 addresses only.

**-8**, **--8-bit**
> Allow an eight-bit input data path at all times; otherwise parity bits are stripped.

**-d**, **--debug**
> Turn on socket debugging (SO_DEBUG) on the TCP sockets used for communication.

**-E**, **--no-escape**
> Stop any character from being recognized as an escape character. Combined with **-8** this gives a completely transparent connection.

**-e** _char_, **--escape**=_char_
> Set the escape character (default: **~**). A literal character, or \\nnn for octal.

**-l** _username_, **--user**=_username_
> Specify a different username for the remote login (default: current user).

**-k** _realm_, **--realm**=_realm_
> Obtain Kerberos tickets for the remote host in _realm_ (Kerberos builds only).

**-K**, **--kerberos**
> Turn off all Kerberos authentication (Kerberos builds only).

**-x**, **--encrypt**
> Encrypt all data passed via the session (Kerberos builds only).

**-D**
> Set TCP_NODELAY to improve interactive response (BSD rlogin only, not in GNU inetutils).

**-i** _localname_
> Use a different local name for authentication; root only (BSD rlogin only, not in GNU inetutils).

# DESCRIPTION

**rlogin** starts a terminal session on a remote host using Berkeley's rhosts authorization mechanism. It reads **~/.rhosts** and **/etc/hosts.equiv** to decide whether to permit passwordless login from trusted accounts.

The escape character (default **~**), when typed as the first character on a line, enables special actions: **~.** disconnects, **~^Z** suspends the session, and **~~** sends a literal tilde. The remote terminal type (from **TERM**) and window size are propagated from the local environment, and window size changes are forwarded.

If **rlogin** is invoked through a symlink named after a host (e.g. `ln -s /usr/bin/rlogin myhost`), running `myhost` logs in to that host.

# CAVEATS

**Deprecated and insecure**: rlogin transmits credentials, commands, and session data in plaintext over the network, making it trivial to sniff passwords and hijack sessions. The rhosts trust mechanism is also vulnerable to spoofing. Most modern distributions ship it disabled or omit it entirely. **Use [ssh](/man/ssh)(1) instead** for any remote login purpose.

# HISTORY

Originated in **4.2BSD** (1983) as part of the Berkeley "r-commands" suite (**rlogin**, **rsh**, **rcp**). Widely deployed throughout the 1980s and 1990s on Unix networks before being superseded by **ssh** in the late 1990s due to its lack of encryption. On Linux it is typically provided by **GNU inetutils**.

# SEE ALSO

[ssh](/man/ssh)(1), [rsh](/man/rsh)(1), [rcp](/man/rcp)(1), [rexec](/man/rexec)(1), [telnet](/man/telnet)(1)

# RESOURCES

```[Source code](https://cgit.git.savannah.gnu.org/cgit/inetutils.git)```

```[Homepage](https://www.gnu.org/software/inetutils/)```

```[Documentation](https://www.gnu.org/software/inetutils/manual/html_node/rlogin-invocation.html)```

<!-- verified: 2026-11-23 -->
