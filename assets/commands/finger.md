# TAGLINE

display user information and status

# TLDR

**Look up local** user

```finger [username]```

**Look up remote** user

```finger [username]@[host]```

**List all logged** in users

```finger```

**Long format output**

```finger -l [username]```

**Short format** output

```finger -s [username]```

# SYNOPSIS

**finger** [_options_] [_user_...] [_user@host_...]

# PARAMETERS

_USER_
> Username to look up.

_USER@HOST_
> Remote user lookup.

**-l**
> Long format output.

**-s**
> Short format output.

**-m**
> Match exact username only.

**-p**
> Omit .plan and .project files.

**--help**
> Display help information.

# DESCRIPTION

**finger** displays information about system users including name, terminal, login time, and contact information. It reads from system databases and user home directories.

Users can customize their finger output with .plan and .project files in their home directory. Remote finger queries contact the finger daemon on port 79.

finger was once common for finding contact information on multi-user systems and across the early internet.

# CAVEATS

Privacy concerns led to disabling on most systems. Remote finger is often blocked. Information disclosure can be a security risk.

# HISTORY

finger originated at **Stanford** in 1971 and became a standard Unix utility. Once ubiquitous for user lookup, it's now largely deprecated due to privacy and security concerns.

# SEE ALSO

[who](/man/who)(1), [w](/man/w)(1), [pinky](/man/pinky)(1)
