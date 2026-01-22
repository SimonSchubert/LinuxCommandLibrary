# TLDR

Change **username**

```sudo usermod -l new_username username```

Change **user ID**

```sudo usermod -u 1001 username```

Change user **shell**

```sudo usermod -s /bin/zsh username```

**Add** user to supplementary groups

```sudo usermod -aG group1,group2 username```

**Remove** user from groups

```sudo usermod -rG group1,group2 username```

Change **home directory** and move contents

```sudo usermod -m -d /new/home username```

**Lock** an account

```sudo usermod -L username```

**Unlock** an account

```sudo usermod -U username```

# SYNOPSIS

**usermod** [_options_] _LOGIN_

# DESCRIPTION

**usermod** modifies system account files to change user account attributes. It can update username, user ID, groups, home directory, shell, and account status.

# PARAMETERS

**-a, --append**
> Append to supplementary groups (use with -G)

**-c, --comment COMMENT**
> Change the comment field (GECOS)

**-d, --home HOME_DIR**
> Set new home directory

**-e, --expiredate DATE**
> Set account expiration date (YYYY-MM-DD)

**-f, --inactive DAYS**
> Days after password expires until account disabled

**-g, --gid GROUP**
> Change primary group

**-G, --groups GROUP1,GROUP2**
> Set supplementary groups (replaces existing)

**-l, --login NEW_LOGIN**
> Change username

**-L, --lock**
> Lock the user account

**-m, --move-home**
> Move home directory contents to new location

**-p, --password PASSWORD**
> Set encrypted password

**-r, --remove**
> Remove user from specified groups (use with -G)

**-s, --shell SHELL**
> Change login shell

**-u, --uid UID**
> Change user ID

**-U, --unlock**
> Unlock the user account

**-Z, --selinux-user SEUSER**
> Set SELinux user mapping

# CAVEATS

When changing UID, files owned by the user need to be manually updated. Use **-a** with **-G** to add groups without removing existing ones. The user must not have running processes when changing username.

# HISTORY

**usermod** is part of the **shadow-utils** package for managing user accounts on Unix-like systems.

# SEE ALSO

[useradd](/man/useradd)(8), [userdel](/man/userdel)(8), [passwd](/man/passwd)(1), [groupmod](/man/groupmod)(8)
