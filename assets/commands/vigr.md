# TAGLINE

Edit the group or shadow-group file with locking

# TLDR

**Edit the /etc/group file**

```sudo vigr```

**Edit the /etc/gshadow (shadow group) file**

```sudo vigr -s```

**Edit group files in a chroot environment**

```sudo vigr -R [/path/to/chroot]```

# SYNOPSIS

**vigr** [_options_]

# DESCRIPTION

**vigr** edits the `/etc/group` file (or `/etc/gshadow` with **-s**) while setting appropriate locks to prevent file corruption from concurrent access. It first locks the file, creates a temporary copy, opens it in the user's preferred editor (checking `$VISUAL`, then `$EDITOR`, falling back to `vi`), performs syntax checks after editing, and then atomically replaces the original file.

# PARAMETERS

**-g**, **--group**
> Edit the group database (default).

**-s**, **--shadow**
> Edit the gshadow (shadow group) database.

**-p**, **--passwd**
> Edit the passwd database (equivalent to running vipw).

**-q**, **--quiet**
> Quiet mode.

**-R**, **--root** _CHROOT_DIR_
> Apply changes in a chroot environment.

**-h**, **--help**
> Display help message.

# CAVEATS

The **vigr** command should always be used instead of directly editing `/etc/group` to prevent file corruption from concurrent access. Changes take effect immediately. Requires root privileges. If you edit `/etc/group`, you should also check `/etc/gshadow` for consistency by running `vigr -s`.

# HISTORY

**vigr** is part of the **shadow-utils** package, providing safe editing of group files similar to how vipw edits password files.

# SEE ALSO

[vipw](/man/vipw)(8), [group](/man/group)(5), [gshadow](/man/gshadow)(5), [groupadd](/man/groupadd)(8), [groupmod](/man/groupmod)(8), [groupdel](/man/groupdel)(8)
