# TAGLINE

Generate /etc/group from Windows group information (Cygwin)

# TLDR

**Write local groups to /etc/group**

```mkgroup -l > /etc/group```

**Print groups from the current domain**

```mkgroup -d```

**Print groups from a specific domain**

```mkgroup -d [DOMAIN]```

**Print local groups from another machine**

```mkgroup -l [MACHINE]```

**Exclude Windows BUILTIN groups**

```mkgroup -l -b```

**Only look up a single local group**

```mkgroup -l -g [GROUPNAME]```

**Print an entry for the current user's group** only

```mkgroup -c```

**Prefix local groups with the machine name** using a custom separator

```mkgroup -L [MACHINE] -S [=]```

# SYNOPSIS

**mkgroup** [_options_] [_machine_ | _domain_]

# PARAMETERS

**-l**, **--local** [_machine_]
> Print local group accounts (of the current machine or a named one).

**-L**, **--Local** [_machine_]
> Like **-l**, but prefix each groupname with the machine name.

**-d**, **--domain** [_domain_]
> Print domain groups (current domain, or the one specified).

**-c**, **--current**
> Print an entry for the current user's group.

**-S**, **--separator** _CHAR_
> For **-L**, use _CHAR_ instead of the default '+' as domain\group separator in groupname.

**-o**, **--id-offset** _OFFSET_
> Change the default offset (0x10000) added to GIDs from non-local domains.

**-g**, **--group** _GROUPNAME_
> Only return information for the specified group. One of **-l** or **-d** must also be given.

**-b**, **--no-builtin**
> Don't print the BUILTIN groups.

**-U**, **--unix** _GROUPLIST_
> Print UNIX groups when using **-l** on a UNIX Samba server. _GROUPLIST_ is a comma-separated list of names or GID ranges (e.g. root,-25,50-100).

**-h**, **--help**
> Display help.

**-v**, **--version**
> Print version information.

# DESCRIPTION

**mkgroup** is a Cygwin helper that prints group information in the format used by Unix `/etc/group` (name:passwd:gid:members), derived from Windows user/group databases (SAM for local accounts, Active Directory for domain accounts).

Without options, it prints local groups on stand-alone machines, plus domain groups on domain controllers and domain member machines. Only trusted domains can be enumerated.

Modern Cygwin reads group information directly from Windows via the `nsswitch.conf` mechanism, so a static `/etc/group` file is usually unnecessary. Generating one with **mkgroup** is still useful when the machine is frequently disconnected from its domain controller, when you need deterministic GIDs, or when integrating with Samba.

# CAVEATS

Cygwin-only; has no effect on native Linux systems (use `getent group` or edit `/etc/group` directly there). Since Cygwin 1.7.34, a static `/etc/group` is optional and in most cases not recommended. Generated GIDs for non-local accounts are offset by 0x10000 by default to avoid collisions. The generated file is static: rerun **mkgroup** after group changes in Windows.

# HISTORY

**mkgroup** ships with the core **cygwin** package's utilities, alongside **mkpasswd**. It dates back to the early days of Cygwin when `/etc/passwd` and `/etc/group` were mandatory for POSIX compatibility on Windows. As of Cygwin 1.7.34 (2015), direct lookup via the Windows API became the default, making the tool optional.

# SEE ALSO

[getent](/man/getent)(1), [groupadd](/man/groupadd)(8), [cygcheck](/man/cygcheck)(1)

# RESOURCES

```[Source code](https://cygwin.com/git/?p=newlib-cygwin.git)```

```[Homepage](https://cygwin.com/)```

```[Documentation](https://cygwin.com/cygwin-ug-net/mkgroup.html)```

<!-- verified: 2026-11-23 -->
