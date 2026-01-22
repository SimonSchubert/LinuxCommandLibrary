# TLDR

Create a **home directory** for a user based on /etc/skel with umask 022

```sudo mkhomedir_helper [username]```

Create a home directory with **custom umask** (037 = owner all, group read)

```sudo mkhomedir_helper [username] [037]```

Create a home directory based on a **custom skeleton** directory

```sudo mkhomedir_helper [username] [umask] [path/to/skeleton_directory]```

Create a home directory with **specific permissions**

```sudo mkhomedir_helper [username] [umask] [/etc/skel] [0700]```

# SYNOPSIS

**mkhomedir_helper** _user_ [_umask_ [_path-to-skel_ [_home_mode_]]]

# PARAMETERS

**user**
> Username for which to create the home directory

**umask**
> File creation mask for contents; default is 0022

**path-to-skel**
> Skeleton directory to copy contents from; default is /etc/skel

**home_mode**
> Permissions for the home directory itself; computed from umask if not specified

# DESCRIPTION

**mkhomedir_helper** is a helper program for the **pam_mkhomedir** PAM module. It creates home directories and populates them with the contents of the specified skeleton directory.

The tool copies files from the skeleton directory (typically /etc/skel) to the new home directory, applying the specified umask to file permissions. It sets ownership to the target user and creates standard configuration files like .bashrc and .profile.

The helper is architecturally separated from the PAM module for security reasons, allowing SELinux domain transitions during execution and preventing direct access from login domains to home directory contents.

# CAVEATS

The tool never modifies existing home directories, preventing accidental overwrites. It requires root privileges to execute. The skeleton directory must exist and be readable. Users must already exist in the system before running this command.

# HISTORY

**mkhomedir_helper** is part of the **Linux-PAM** (Pluggable Authentication Modules) project. It was designed as a security-conscious helper binary for the pam_mkhomedir module, enabling automatic home directory creation during user login for centrally-managed authentication systems like LDAP.

# SEE ALSO

[useradd](/man/useradd)(8), [adduser](/man/adduser)(8), [pam_mkhomedir](/man/pam_mkhomedir)(8)
