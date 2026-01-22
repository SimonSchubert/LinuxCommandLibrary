# TLDR

Create a **new user**

```sudo useradd username```

Create user with specific **user ID**

```sudo useradd -u 1001 username```

Create user with specific **shell**

```sudo useradd -s /bin/zsh username```

Create user with **additional groups**

```sudo useradd -G group1,group2 username```

Create user with **home directory**

```sudo useradd -m username```

Create user with **skeleton directory** template

```sudo useradd -k /etc/skel -m username```

Create a **system user** without home directory

```sudo useradd -r username```

# SYNOPSIS

**useradd** [_options_] _LOGIN_

# DESCRIPTION

**useradd** is a low-level utility for adding users to the system. It updates system files and optionally creates home directories with initial files. On Debian-based systems, the higher-level **adduser** command is often preferred.

# PARAMETERS

**-c, --comment COMMENT**
> Set user's full name or description (GECOS field)

**-d, --home-dir HOME_DIR**
> Specify custom home directory path

**-e, --expiredate DATE**
> Set account expiration date (YYYY-MM-DD)

**-f, --inactive DAYS**
> Days after password expires until account is disabled

**-g, --gid GROUP**
> Assign primary group

**-G, --groups GROUP1,GROUP2**
> Add to supplementary groups

**-k, --skel SKEL_DIR**
> Specify skeleton directory for home directory files

**-m, --create-home**
> Create the user's home directory

**-M, --no-create-home**
> Do not create home directory

**-p, --password PASSWORD**
> Set encrypted password

**-r, --system**
> Create a system account

**-s, --shell SHELL**
> Set login shell

**-u, --uid UID**
> Assign specific user ID

**-U, --user-group**
> Create a group with same name as user

**-N, --no-user-group**
> Do not create a matching group

**-D**
> Display or modify default values

# CAVEATS

The **-p** option requires an already-encrypted password. Do not use plain text passwords on the command line. Prefer using **passwd** to set passwords after user creation.

# HISTORY

**useradd** is part of the **shadow-utils** package, managing user account security on Unix systems. On Debian systems, **adduser** provides a friendlier interface.

# SEE ALSO

[adduser](/man/adduser)(8), [userdel](/man/userdel)(8), [usermod](/man/usermod)(8), [passwd](/man/passwd)(1), [groupadd](/man/groupadd)(8)
