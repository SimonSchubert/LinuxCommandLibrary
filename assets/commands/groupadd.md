# TLDR

Create a **new group**

```sudo groupadd group_name```

Create a **system group**

```sudo groupadd -r group_name```

Create group with specific **group ID**

```sudo groupadd -g 1001 group_name```

Create group with **initial members**

```sudo groupadd -U user1,user2 group_name```

# SYNOPSIS

**groupadd** [_options_] _NEWGROUP_

# DESCRIPTION

**groupadd** creates a new group account using command-line options and system defaults. The new group information is recorded in the system files.

# PARAMETERS

**-f, --force**
> Exit successfully if group exists; use next available GID if specified one is taken

**-g, --gid GID**
> Set numerical group ID (must be unique unless -o used)

**-K, --key KEY=VALUE**
> Override /etc/login.defs defaults

**-o, --non-unique**
> Allow creation with duplicate GID

**-p, --password PASSWORD**
> Set encrypted group password

**-r, --system**
> Create a system group

**-U, --users USER1,USER2**
> Add users as group members

**-R, --root CHROOT_DIR**
> Apply changes in chroot environment

**-P, --prefix PREFIX_DIR**
> Apply changes in prefix directory

# CAVEATS

Group names must be 32 characters maximum and cannot start with dash, plus, or tilde. Names cannot contain colons, commas, whitespace, or be entirely numeric.

# HISTORY

**groupadd** is part of the **shadow-utils** package for managing group accounts on Unix-like systems.

# SEE ALSO

[groupdel](/man/groupdel)(8), [groupmod](/man/groupmod)(8), [gpasswd](/man/gpasswd)(1), [useradd](/man/useradd)(8)
