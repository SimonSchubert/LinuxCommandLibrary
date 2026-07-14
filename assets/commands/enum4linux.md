# TAGLINE

enumerate information from Windows and Samba systems

# TLDR

Enumerate using **all** methods

```enum4linux -a [remote_host]```

Enumerate using given **credentials**

```enum4linux -u [user_name] -p [password] [remote_host]```

List **usernames** from a host

```enum4linux -U [remote_host]```

List **shares**

```enum4linux -S [remote_host]```

Get **OS** information

```enum4linux -o [remote_host]```

# SYNOPSIS

**enum4linux** [_options_] _target_

# DESCRIPTION

**enum4linux** enumerates information from Windows and Samba systems using SMB. It extracts user lists, share information, group membership, password policies, and operating system details.

A Perl wrapper around tools like smbclient, rpcclient, and nmblookup for penetration testing.

# PARAMETERS

**-a**
> Do all simple enumeration

**-U**
> Get user list

**-S**
> Get share list

**-o**
> Get OS information

**-u** _user_
> Username for authentication

**-p** _password_
> Password for authentication

**-G**
> Get group information

**-P**
> Get password policy

**-r**
> Enumerate users via RID cycling (works even when RestrictAnonymous blocks direct listing)

**-M**
> Get machine list

**-d**
> Be detailed, applies to -U and -S

**-w** _workgroup_
> Specify the workgroup or domain manually

# CAVEATS

Security testing tool. Use only on systems you have permission to test. Some enumeration requires valid credentials or a null session, which modern Windows blocks by default. May trigger security alerts. The original Perl enum4linux is effectively unmaintained; **enum4linux-ng**, a Python rewrite, is the actively developed successor and produces cleaner, machine-readable output.

# SEE ALSO

[smbclient](/man/smbclient)(1), [rpcclient](/man/rpcclient)(1), [nmap](/man/nmap)(1), [nmblookup](/man/nmblookup)(1)

# RESOURCES

```[Source code](https://github.com/CiscoCXSecurity/enum4linux)```

<!-- verified: 2026-07-14 -->
