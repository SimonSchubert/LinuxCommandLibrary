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

**pam_motd** displays message of the day. Shows /etc/motd on login.

The module presents login messages. Supports dynamic MOTD generation.

pam_motd shows login messages.

# CAVEATS

Session module. Can run scripts. Multiple file support.

# HISTORY

pam_motd displays the **message of the day** for login sessions.

# SEE ALSO

[pam](/man/pam)(8), [motd](/man/motd)(5), [update-motd](/man/update-motd)(5)

