# TAGLINE

displays message of the day

# TLDR

**Display message of the day**

```session optional pam_motd.so```

**Custom motd location**

```session optional pam_motd.so motd=/etc/custom_motd```

**Show a motd file and a directory of motd files**

```session optional pam_motd.so motd=/etc/motd motd_dir=/etc/motd.d```

**Skip the update-motd scripts** (Debian and Ubuntu)

```session optional pam_motd.so noupdate```

**Silence a packaged message**

```ln -s /dev/null /etc/motd.d/[my_motd]```

# SYNOPSIS

**pam_motd.so** [_options_]

# PARAMETERS

**motd=**_FILE_
> MOTD file path. Multiple paths to try can be given as a colon-separated list. Default: /etc/motd:/run/motd:/usr/lib/motd.

**motd_dir=**_DIR_
> Directory whose files are all displayed, in lexicographic order. Multiple directories can be given as a colon-separated list. Default: /etc/motd.d:/run/motd.d:/usr/lib/motd.d.

**noupdate**
> Don't run the scripts in /etc/update-motd.d to refresh the motd file. Debian and Ubuntu only.

# DESCRIPTION

**pam_motd** is a PAM module that displays the "message of the day" to users upon login. By default it shows the first of **/etc/motd**, **/run/motd** and **/usr/lib/motd** that exists, plus the files in the matching **motd.d** directories. Files in **/etc/motd.d** override files of the same name in **/run/motd.d** and **/usr/lib/motd.d**. On Debian and Ubuntu, the module can also run the scripts in **/etc/update-motd.d** to refresh the motd file.

The environment variable **MOTD_SHOWN=pam** is set after the files are shown.

The module is configured in PAM service files (typically **/etc/pam.d/login** or **/etc/pam.d/sshd**) as a **session** module. Only the **session** type is provided, and the suggested control flag is **optional**.

# CAVEATS

Specifying either **motd=** or **motd_dir=** disables the default behavior of both. Each message is limited to 64KB. On Debian and Ubuntu, long-running **update-motd.d** scripts delay the login process. The **noupdate** option prevents script execution but still displays the motd files.

# SEE ALSO

[pam](/man/pam)(8), [motd](/man/motd)(5)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man8/pam_motd.8.html)```

<!-- verified: 2026-11-09 -->
