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

**Only look up a single group**

```mkgroup -g [GROUPNAME]```

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
> Print the current (primary) group of the user.

**-S**, **--separator** _CHAR_
> Use _CHAR_ instead of '+' as domain\group separator in groupname.

**-o**, **--id-offset** _OFFSET_
> Change the default offset (0x10000) added to GIDs from non-local domains.

**-g**, **--group** _GROUPNAME_
> Only return information for the specified group.

**-b**, **--no-builtin**
> Don't print the BUILTIN groups.

**-U**, **--unix** _GROUPLIST_
> Print UNIX groups when using **-l** on a UNIX Samba server.

**-h**, **--help**
> Display help.

**-v**, **--version**
> Print version information.

# DESCRIPTION

**mkgroup** is a Cygwin helper that prints group information in the format used by Unix `/etc/group` (name:passwd:gid:members), derived from Windows user/group databases (SAM for local accounts, Active Directory for domain accounts).

Modern Cygwin reads group information directly from Windows via the `nsswitch.conf` mechanism, so a static `/etc/group` file is usually unnecessary. Generating one with **mkgroup** is still useful when the machine is frequently disconnected from its domain controller, when you need deterministic GIDs, or when integrating with Samba.

# CAVEATS

Cygwin-only; has no effect on native Linux systems (use `getent group` or edit `/etc/group` directly there). Since Cygwin 1.7.34, a static `/etc/group` is optional and in most cases not recommended. Generated GIDs for non-local accounts are offset by 0x10000 by default to avoid collisions.

# HISTORY

**mkgroup** is part of the **Cygwin** base-files package, alongside **mkpasswd**. It dates back to the early days of Cygwin when `/etc/passwd` and `/etc/group` were mandatory for POSIX compatibility on Windows. As of Cygwin 1.7.34 (2014), direct lookup via the Windows API became the default, making the tool optional.

# SEE ALSO

[mkpasswd](/man/mkpasswd)(1), [groupadd](/man/groupadd)(8)
