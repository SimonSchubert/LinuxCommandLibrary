# TAGLINE

performs SMB protocol operations for security testing

# TLDR

**Spray credentials** against an entire subnet

```nxc smb [192.168.1.0/24] -u [user] -p [password]```

**Enumerate shares and access levels**

```nxc smb [target] -u [user] -p [password] --shares```

**Enumerate domain users** via SAMR

```nxc smb [target] -u [user] -p [password] --users```

**Authenticate against the local SAM** (not the domain)

```nxc smb [target] -u [user] -p [password] --local-auth```

**Execute a cmd.exe command**

```nxc smb [target] -u [admin] -p [password] -x [whoami]```

**Execute a PowerShell command**

```nxc smb [target] -u [admin] -p [password] -X "[Get-Process]"```

**Pass the hash** (NTLM)

```nxc smb [target] -u [user] -H [NTLM_hash]```

**Dump the SAM hashes**

```nxc smb [target] -u [admin] -p [password] --sam```

**Run a NetExec module**

```nxc smb [target] -u [admin] -p [password] -M [spider_plus]```

# SYNOPSIS

**nxc smb** _target_ [_options_]

# PARAMETERS

**-u** _USER_
> Username or username file (prefix with **@** to read from file).

**-p** _PASS_
> Password or password file.

**-H** _HASH_
> NTLM hash (LM:NT or just NT).

**-d**, **--domain** _DOMAIN_
> Authenticate against the given domain.

**--local-auth**
> Authenticate locally (use the machine's SAM, skip domain lookup).

**-x** _CMD_
> Execute _CMD_ via **cmd.exe**.

**-X** _CMD_
> Execute _CMD_ via **PowerShell**.

**--exec-method** _METHOD_
> Remote-execution technique: **wmiexec**, **atexec**, or **smbexec**.

**--shares**
> Enumerate SMB shares and the current user's permissions on each.

**--users**
> Enumerate domain users via SAMR.

**--groups**
> Enumerate local or domain groups.

**--sessions**
> List active SMB sessions on the target.

**--loggedon-users**
> List users currently logged on to the target.

**--pass-pol**
> Retrieve the effective password policy.

**--sam**
> Dump the local SAM hash database (requires admin).

**--lsa**
> Dump cached LSA secrets.

**-M**, **--module** _NAME_
> Run a NetExec module (see **nxc smb -L** for the full list).

# DESCRIPTION

**nxc smb** performs SMB protocol operations for security testing. Part of **NetExec** (the community-maintained successor to **CrackMapExec**). It enumerates shares, users, sessions, groups, and password policies; validates credentials across entire subnets; and can execute commands remotely through WMI, scheduled tasks, or named pipes.

# CAVEATS

For authorized security assessments only. Requires proper authorization.

# SEE ALSO

[nxc](/man/nxc)(1), [smbclient](/man/smbclient)(1)

