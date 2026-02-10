# TAGLINE

generates Unix /etc/group from Windows

# TLDR

**List local groups**

```mkgroup -l```

**List domain groups**

```mkgroup -d```

**Output to file**

```mkgroup -l > [/etc/group]```

**List specific domain**

```mkgroup -d -D [DOMAIN]```

**Show SID information**

```mkgroup -s```

# SYNOPSIS

**mkgroup** [_options_]

# PARAMETERS

**-l**
> List local groups.

**-d**
> List domain groups.

**-D** _DOMAIN_
> Specify domain.

**-s**
> Include SID info.

**--help**
> Display help information.

# DESCRIPTION

**mkgroup** generates Unix /etc/group from Windows. It's part of Cygwin for Windows integration.

The tool converts Windows group information to Unix format. Used for Cygwin setup.

# CAVEATS

Cygwin specific. Windows environment only. Maps Windows to Unix groups.

# HISTORY

mkgroup is a **Cygwin** utility for generating Unix group file from Windows user database.

# SEE ALSO

[mkpasswd](/man/mkpasswd)(1), [cygwin](/man/cygwin)(1), [groupadd](/man/groupadd)(8)

