# TAGLINE

notifies users of new mail

# TLDR

**Check for new mail**

```session optional pam_mail.so```

**Show standard mail path**

```session optional pam_mail.so standard```

**Custom mail directory**

```session optional pam_mail.so dir=~/Maildir```

**Quiet on empty**

```session optional pam_mail.so quiet```

**Suppress new-mail check (login MOTD only)**

```session optional pam_mail.so nopen```

# SYNOPSIS

**pam_mail.so** [_options_]

# PARAMETERS

**dir=**_PATH_
> Mail directory (overrides the MAIL environment variable).

**standard**
> Use the standard mail spool location.

**close**
> Also print a notice at session close if new mail has arrived.

**empty**
> Report even when the mailbox is empty.

**hash=**_N_
> Look in N hashed subdirectories under `dir` (for sites with hashed spools).

**nopen**
> Do not inspect any mailboxes on login (suppresses the status message).

**noenv**
> Do not export the `MAIL` environment variable.

**quiet**
> Only report if there is new mail (no "no mail" message).

# DESCRIPTION

**pam_mail** notifies users of new mail. Checks mail spool at login.

The module displays mail notifications. Session login feature.

# CAVEATS

Session module. Mail spool dependent. Optional notification.

# HISTORY

pam_mail provides **mail notification** at login for Unix mail spools.

# SEE ALSO

[pam](/man/pam)(8), [mail](/man/mail)(1)

