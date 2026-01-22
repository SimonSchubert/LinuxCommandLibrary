# TLDR

**Check** configuration

```sudo postfix check```

Check **status**

```sudo postfix status```

**Start** Postfix

```sudo postfix start```

**Stop** gracefully

```sudo postfix stop```

**Flush** mail queue

```sudo postfix flush```

**Reload** configuration

```sudo postfix reload```

# SYNOPSIS

**postfix** [**-c** _config_dir_] [**-D**] _command_

# COMMANDS

**check**
> Verify configuration for errors

**start**
> Start the Postfix mail system

**stop**
> Stop the Postfix mail system

**abort**
> Stop immediately without finishing deliveries

**flush**
> Force delivery of queued mail

**reload**
> Reload configuration without restart

**status**
> Check if Postfix is running

# PARAMETERS

**-c _config_dir_**
> Alternate configuration directory

**-D**
> Debug mode

# DESCRIPTION

**postfix** is the control program for the Postfix mail transfer agent. It manages starting, stopping, and reconfiguring the mail system components.

Postfix is designed for security and performance, running multiple separate processes with minimal privileges. The control program coordinates these processes.

# CAVEATS

Requires root privileges for most commands. Mail queue persists across restarts. Check configuration before reload. Abort may lose mail in transit.

# HISTORY

**Postfix** was written by **Wietse Venema** at IBM Research as a secure, fast replacement for Sendmail. Released in 1998, it became one of the most popular MTAs due to its security design and ease of configuration.

# SEE ALSO

[postconf](/man/postconf)(1), [postqueue](/man/postqueue)(1), [sendmail](/man/sendmail)(8)
