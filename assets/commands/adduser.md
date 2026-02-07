# TAGLINE

Debian-friendly user and group management frontend

# TLDR

Create a new user with a **default home directory** and prompt for a password

```adduser [username]```

Create a new user **without** a home directory

```adduser --no-create-home [username]```

Create a new user with a home directory at a **specified path**

```adduser --home [path/to/home] [username]```

Create a new user with a **specified shell**

```adduser --shell [path/to/shell] [username]```

Create a new user belonging to a **specified group**

```adduser --ingroup [group] [username]```

Add an existing user to a **group**

```adduser [username] [group]```

# SYNOPSIS

**adduser** [_options_] _user_ [_group_]

# DESCRIPTION

**adduser** adds users and groups to the system according to command line options and configuration in /etc/adduser.conf. It is a Debian-specific front end to the **useradd**, **groupadd**, and **usermod** programs with policy-compliant defaults.

The utility chooses appropriate UID/GID values, creates home directories with skeletal configuration files, and supports both regular and system accounts.

# PARAMETERS

**--home dir**
> Specify home directory

**--no-create-home**
> Skip home directory creation

**--shell shell**
> Set login shell

**--uid ID**
> Specify user ID

**--gid GID**
> Set primary group ID

**--ingroup GROUP**
> Set primary group by name

**--system**
> Create system account

**--group**
> Create group (or named group for system user)

**--disabled-login**
> Disable login and set shell to /usr/sbin/nologin

**--disabled-password**
> Prevent password setting

**--comment comment**
> Set GECOS field information

**--add-extra-groups**
> Add user to EXTRA_GROUPS defined in config

**--quiet**
> Suppress messages

**--conf file**
> Use alternate configuration file

# CONFIGURATION

**/etc/adduser.conf**
> Controls default behavior including home directory base path, default shell, skeleton directory, UID/GID ranges, and whether to add users to extra groups automatically.

# CAVEATS

This is a **Debian/Ubuntu specific** frontend; other distributions may use **useradd** directly with different defaults. The adduser command has stricter name validation by default.

# HISTORY

Developed as a **Debian-specific** tool to provide a friendlier interface to user management with policy-compliant defaults.

# SEE ALSO

[useradd](/man/useradd)(8), [deluser](/man/deluser)(8), [usermod](/man/usermod)(8), [passwd](/man/passwd)(1), [addgroup](/man/addgroup)(8)
