# TLDR

**Check for new mail**

```session optional pam_mail.so```

**Show standard mail path**

```session optional pam_mail.so standard```

**Custom mail directory**

```session optional pam_mail.so dir=~/Maildir```

**Quiet on empty**

```session optional pam_mail.so nstruc```

# SYNOPSIS

**pam_mail.so** [_options_]

# PARAMETERS

**dir=**_PATH_
> Mail directory.

**standard**
> Use standard mail spool.

**nopen**
> Don't print new mail count.

**quiet**
> Only report if mail exists.

# DESCRIPTION

**pam_mail** notifies users of new mail. Checks mail spool at login.

The module displays mail notifications. Session login feature.

pam_mail checks for mail.

# CAVEATS

Session module. Mail spool dependent. Optional notification.

# HISTORY

pam_mail provides **mail notification** at login for Unix mail spools.

# SEE ALSO

[pam](/man/pam)(8), [mail](/man/mail)(1)

