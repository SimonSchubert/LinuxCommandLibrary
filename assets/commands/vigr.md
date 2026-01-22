# TLDR

Edit the **group** file

```vigr```

Edit the **gshadow** file

```vigr -s```

Edit in a **chroot** environment

```vigr -R /path/to/chroot```

Display **version**

```vigr -V```

# SYNOPSIS

**vigr** [_options_]

# DESCRIPTION

**vigr** edits the /etc/group file (or /etc/gshadow with -s) while setting appropriate locks to prevent file corruption. It uses the editor specified by $VISUAL, then $EDITOR, falling back to vi if neither is set.

# PARAMETERS

**-g, --group**
> Edit the group database (default)

**-s, --shadow**
> Edit the gshadow (shadow group) database

**-h, --help**
> Display help message

**-q, --quiet**
> Quiet mode

**-R, --root CHROOT_DIR**
> Apply changes in a chroot environment

# CAVEATS

The vigr command should always be used instead of directly editing /etc/group to prevent file corruption from concurrent access. Changes made require no additional steps to take effect.

# HISTORY

**vigr** is part of the **shadow-utils** package, providing safe editing of group files similar to how vipw edits password files.

# SEE ALSO

[vipw](/man/vipw)(8), [group](/man/group)(5), [gshadow](/man/gshadow)(5), [groupadd](/man/groupadd)(8)
