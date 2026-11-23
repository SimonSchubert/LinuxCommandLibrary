# TAGLINE

notifies users of new mail

# TLDR

**Show mail status at login** (in /etc/pam.d/login)

```session optional pam_mail.so standard```

**Use a Maildir in the user's home directory**

```session optional pam_mail.so dir=~/Maildir```

**Only report when there is new mail**

```session optional pam_mail.so quiet```

**Set MAIL without printing anything**

```session optional pam_mail.so nopen```

**Also report mail status on logout**

```session optional pam_mail.so close```

# SYNOPSIS

**pam_mail.so** [**close**] [**debug**] [**dir=**_maildir_] [**empty**] [**hash=**_count_] [**noenv**] [**nopen**] [**quiet**] [**standard**]

# PARAMETERS

**close**
> Also indicate whether the user has mail on logout.

**debug**
> Print debug information.

**dir=**_maildir_
> Look for mail in _maildir_/<login> instead of the default /var/mail/<login>. A leading **~** refers to a path inside the user's home directory.

**empty**
> Also print a message if the user has no mail.

**hash=**_count_
> Mail directory hash depth, e.g. 2 gives /var/spool/mail/u/s/user.

**noenv**
> Do not set the **MAIL** environment variable.

**nopen**
> Do not print any mail information on login; useful to only set **MAIL**.

**quiet**
> Only report when there is new mail.

**standard**
> Old style "You have..." message that does not show the mail spool path. Implies **empty**.

# DESCRIPTION

**pam_mail** provides the "you have new mail" service to the user. It can be plugged into any application with credential or session hooks and prints a single message (e.g. "You have new mail.") about the user's mail folder. It also sets the PAM environment variable **MAIL** to the user's mail location.

If the mail spool path (/var/mail/$USER or the one given with **dir=**) is a directory, it is treated as a Maildir.

The **session** and **auth** (on establishment and deletion of credentials) module types are provided.

# CAVEATS

Usually configured as **optional** so a missing or unreadable spool never blocks login. Shells and **login** may print their own mail notices, which can result in duplicate messages.

# HISTORY

**pam_mail** was written by **Andrew G. Morgan** and is part of **Linux-PAM**.

# SEE ALSO

[pam](/man/pam)(8), [pam.conf](/man/pam.conf)(5), [pam.d](/man/pam.d)(5), [mail](/man/mail)(1), [biff](/man/biff)(1)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man8/pam_mail.8.html)```

<!-- verified: 2026-11-23 -->
