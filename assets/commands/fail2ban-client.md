# TLDR

Retrieve current **status** of a jail

```fail2ban-client status [jail]```

**Remove** IP from jail ban list

```fail2ban-client set [jail] unbanip [ip_address]```

Verify server is **alive**

```fail2ban-client ping```

# SYNOPSIS

**fail2ban-client** _command_ [_arguments_]

# DESCRIPTION

**fail2ban-client** configures and controls the fail2ban server. Fail2ban monitors log files and bans IP addresses that show malicious behavior like repeated failed login attempts.

Used for managing jail status, banning/unbanning IPs, and server control.

# PARAMETERS

**status** [_jail_]
> Show jail status

**set** _jail_ _action_ _value_
> Configure jail settings

**unbanip** _ip_
> Remove IP from ban list

**ping**
> Check server is alive

**start**
> Start the server

**stop**
> Stop the server

**reload**
> Reload configuration

# CAVEATS

Requires fail2ban-server to be running. Jail names are defined in configuration files. May require root privileges for most operations.

# SEE ALSO

[fail2ban-server](/man/fail2ban-server)(1), [iptables](/man/iptables)(8)
