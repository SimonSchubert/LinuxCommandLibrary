# TLDR

**Show logged-in users**

```pinky```

**Show specific user**

```pinky [username]```

**Long format**

```pinky -l [username]```

**Short format**

```pinky -s```

**Omit full names**

```pinky -f```

**Omit remote host**

```pinky -h```

# SYNOPSIS

**pinky** [_-l_] [_-s_] [_-f_] [_-h_] [_options_] [_users_]

# PARAMETERS

**-l**
> Long output format.

**-s**
> Short output format.

**-f**
> Omit full name.

**-h**
> Omit remote host.

**-w**
> Omit home directory.

**-b**
> Omit home in long format.

**-p**
> Omit project in long format.

**--help**
> Show help.

# DESCRIPTION

**pinky** displays information about logged-in users. It's a lightweight alternative to finger.

Default output shows login name, full name, terminal, idle time, login time, and host.

Long format adds home directory, shell, and plan/project files. Similar to finger's detailed view.

Short format shows minimal information. Useful for quick user listing.

The command reads system utmp and user information. No network queries are made.

# CAVEATS

Less feature-complete than finger. No remote host queries. Plan files may not exist.

# HISTORY

**pinky** is part of GNU coreutils, created as a lighter-weight local alternative to the **finger** command. It doesn't support network finger protocol.

# SEE ALSO

[finger](/man/finger)(1), [who](/man/who)(1), [w](/man/w)(1), [users](/man/users)(1)
