# TAGLINE

PAM module for anonymous FTP access

# TLDR

**Enable anonymous FTP login** in /etc/pam.d/ftpd, falling back to normal passwords

```auth sufficient pam_ftp.so```

**Treat custom usernames as anonymous** (mapped to the first in the list)

```auth sufficient pam_ftp.so users=ftp,anonymous,guest```

**Do not record the email address** given as password

```auth sufficient pam_ftp.so ignore```

**Let pam_unix reuse the password** typed for a non-anonymous user

```auth required pam_unix.so use_first_pass```

# SYNOPSIS

**pam_ftp.so** [**debug**] [**ignore**] [**users=**_XXX,YYY,..._]

# PARAMETERS

**debug**
> Print debug information to syslog.

**ignore**
> Pay no attention to the email address supplied as password (do not set **PAM_RUSER**/**PAM_RHOST** from it).

**users=**_LIST_
> Comma-separated list of usernames granted anonymous access instead of the default **ftp** and **anonymous**. The username is then set to the first entry in the list.

# DESCRIPTION

**pam_ftp** provides a pluggable anonymous FTP mode of access. It intercepts the username and password: if the name is **ftp** or **anonymous** (or listed in **users=**), the password is treated as an email address and split at the **@** into the **PAM_RUSER** and **PAM_RHOST** items, the username is set to **ftp**, and the module succeeds.

For any other user, the module stores the entered password as **PAM_AUTHTOK** and fails, so a following module such as **pam_unix** with **use_first_pass** can authenticate the real account without prompting again.

Only the **auth** module type is provided.

# CAVEATS

The module is not secure and easily spoofable: the email address is not verified in any way. It only makes sense for services that offer anonymous FTP; modern FTP daemons such as vsftpd handle anonymous login internally.

# HISTORY

**pam_ftp** was written by **Andrew G. Morgan** and has been part of **Linux-PAM** since its early releases.

# SEE ALSO

[pam](/man/pam)(8), [pam.conf](/man/pam.conf)(5), [pam.d](/man/pam.d)(5), [pam_unix](/man/pam_unix)(8), [vsftpd](/man/vsftpd)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man8/pam_ftp.8.html)```

<!-- verified: 2026-11-23 -->
