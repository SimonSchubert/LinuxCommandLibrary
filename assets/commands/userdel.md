# TLDR

**Remove** a user

```sudo userdel username```

Remove user with **home directory** and mail spool

```sudo userdel -r username```

**Force** remove user even if logged in

```sudo userdel -f username```

Remove user from **chroot** environment

```sudo userdel -R /path/to/chroot username```

# SYNOPSIS

**userdel** [_options_] _LOGIN_

# DESCRIPTION

**userdel** removes user accounts and deletes associated entries from system files. On Debian systems, the higher-level **deluser** command is often preferred.

# PARAMETERS

**-f, --force**
> Force removal even if user is logged in; also removes home directory and mail spool regardless of ownership

**-r, --remove**
> Remove home directory and mail spool

**-R, --root CHROOT_DIR**
> Apply changes in a chroot environment

**-P, --prefix PREFIX_DIR**
> Apply changes in a prefix directory

**-Z, --selinux-user**
> Remove SELinux user mappings

**-h, --help**
> Display help message

# CAVEATS

The **-f** option is dangerous and may leave the system in an inconsistent state. User files outside the home directory are not removed automatically. Running processes owned by the user should be terminated before deletion.

# HISTORY

**userdel** is part of the **shadow-utils** package. On Debian systems, **deluser** provides additional features like backup creation.

# SEE ALSO

[deluser](/man/deluser)(8), [useradd](/man/useradd)(8), [usermod](/man/usermod)(8), [groupdel](/man/groupdel)(8)
