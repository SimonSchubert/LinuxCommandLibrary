# TAGLINE

performs SMB protocol operations for security testing

# TLDR

**Check SMB access**

```nxc smb [192.168.1.0/24] -u [user] -p [password]```

**Enumerate shares**

```nxc smb [target] -u [user] -p [password] --shares```

**Enumerate users**

```nxc smb [target] -u [user] -p [password] --users```

**Execute command**

```nxc smb [target] -u [admin] -p [password] -x [whoami]```

**Pass the hash**

```nxc smb [target] -u [user] -H [NTLM_hash]```

# SYNOPSIS

**nxc smb** _target_ [_options_]

# PARAMETERS

**-u** _user_
> Username.

**-p** _pass_
> Password.

**-H** _hash_
> NTLM hash.

**--shares**
> Enumerate shares.

**--users**
> Enumerate users.

**-x** _cmd_
> Execute command.

**--sam**
> Dump SAM database.

**--lsa**
> Dump LSA secrets.

# DESCRIPTION

**nxc smb** performs SMB protocol operations for security testing. Part of NetExec (formerly CrackMapExec). Enumerates shares, users, and tests credentials across networks.

# CAVEATS

For authorized security assessments only. Requires proper authorization.

# SEE ALSO

[nxc](/man/nxc)(1), [smbclient](/man/smbclient)(1)

