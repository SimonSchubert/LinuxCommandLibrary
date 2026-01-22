# TLDR

**Remove** a user

```sudo deluser [username]```

Remove user and **home directory**

```sudo deluser --remove-home [username]```

Remove user, **backup files**, and remove home

```sudo deluser --backup-to [path/to/backup_directory] --remove-home [username]```

Remove user and **all owned files**

```sudo deluser --remove-all-files [username]```

Remove user **from a group**

```sudo deluser [username] [group]```

# SYNOPSIS

**deluser** [_options_] _user_ [_group_]

# DESCRIPTION

**deluser** removes users from the system. It can optionally remove the user's home directory, mail spool, and other files. It's the Debian/Ubuntu counterpart to userdel.

When given both a user and group name, it removes the user from that group without deleting the user account.

# PARAMETERS

**--remove-home**
> Remove user's home directory

**--remove-all-files**
> Remove all files owned by user

**--backup**
> Backup files before removal

**--backup-to** _dir_
> Backup destination directory

**--system**
> Only delete if system user

# CAVEATS

Requires root privileges. Use --backup when removing important users. The user must not be logged in. On non-Debian systems, use userdel instead.

# SEE ALSO

[userdel](/man/userdel)(8), [adduser](/man/adduser)(8), [delgroup](/man/delgroup)(8)
