# TAGLINE

NetExec RDP protocol module

# TLDR

**Check RDP credentials**

```nxc rdp [target] -u [user] -p [password]```

**Authenticate against a domain**

```nxc rdp [target] -u [user] -p [password] -d [domain]```

**Pass the hash**

```nxc rdp [target] -u [user] -H [nt_hash]```

**Screenshot the desktop after a successful login**

```nxc rdp [target] -u [user] -p [password] --screenshot --screentime [10]```

**Screenshot the login screen of hosts without NLA** (no credentials needed)

```nxc rdp [targets.txt] --nla-screenshot```

**Execute a command over RDP**

```nxc rdp [target] -u [user] -p [password] -x [whoami]```

# SYNOPSIS

**nxc** **rdp** _target_ [_options_]

# PARAMETERS

_target_
> IP, hostname, CIDR range, IP range or file containing targets.

**-u** _user_
> Username(s) or file of usernames.

**-p** _password_
> Password(s) or file of passwords.

**-H**, **--hash** _hash_
> NTLM hash(es) or file of hashes for pass-the-hash.

**-d** _domain_
> Domain to authenticate to.

**--local-auth**
> Authenticate to the local account database of each target.

**--port** _port_
> RDP port (default 3389).

**--rdp-timeout** _seconds_
> Socket connection timeout (default 5).

**--nla-screenshot**
> Screenshot the login prompt if Network Level Authentication is disabled.

**--screenshot**
> Take a screenshot after a successful login.

**--screentime** _seconds_
> Time to wait for the desktop image (default 5).

**--res** _WIDTHxHEIGHT_
> Screenshot resolution (default 1024x768).

**-x** _command_
> Execute a cmd command.

**-X** _ps_command_
> Execute a PowerShell command.

**--no-output**
> Do not retrieve command output.

# DESCRIPTION

**nxc rdp** is the RDP protocol module of NetExec. It validates credentials and hashes against Remote Desktop services at scale, reports whether NLA is enabled, takes screenshots, and can execute commands through an RDP session.

Hosts that respond are shown with OS, hostname, domain and NLA status even without credentials.

# CAVEATS

Only use against systems you are authorized to test. Pass-the-hash over RDP requires **Restricted Admin** mode on the target. Successful logins may disconnect an active user session and are logged on the target.

# SEE ALSO

[nxc](/man/nxc)(1), [netexec](/man/netexec)(1), [xfreerdp](/man/xfreerdp)(1), [rdesktop](/man/rdesktop)(1), [hydra](/man/hydra)(1)

# RESOURCES

```[Source code](https://github.com/Pennyw0rth/NetExec)```

```[Documentation](https://www.netexec.wiki/rdp-protocol/)```

<!-- verified: 2026-11-07 -->
