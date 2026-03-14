# TAGLINE

displays message of the day

# TLDR

**Display message of the day**

```session optional pam_motd.so```

**Custom motd location**

```session optional pam_motd.so motd=/etc/custom_motd```

**Multiple motd files**

```session optional pam_motd.so motd_dir=/etc/motd.d```

**Disable for non-login shells**

```session optional pam_motd.so noupdate```

# SYNOPSIS

**pam_motd.so** [_options_]

# PARAMETERS

**motd=**_FILE_
> MOTD file path.

**motd_dir=**_DIR_
> Directory with MOTD files.

**noupdate**
> Don't run motd scripts.

# DESCRIPTION

**pam_motd** is a PAM module that displays the "message of the day" to users upon login. By default it shows the contents of **/etc/motd**. It can also run executable scripts in a motd directory (e.g., **/etc/update-motd.d/**) to generate dynamic messages showing system information, security updates, or custom notices.

The module is configured in PAM service files (typically **/etc/pam.d/login** or **/etc/pam.d/sshd**) as a **session** module. It is always marked **optional** so that login succeeds even if the MOTD cannot be displayed.

# CAVEATS

Scripts in **motd_dir** run as root during login, so they must be carefully audited. Long-running scripts will delay the login process. The **noupdate** option prevents script execution but still displays static MOTD files.

# SEE ALSO

[pam](/man/pam)(8), [motd](/man/motd)(5)

