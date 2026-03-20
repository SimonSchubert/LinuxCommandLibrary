# TAGLINE

Lock terminal with an away message

# TLDR

**Lock terminal** and set an away message

```away [message]```

Lock terminal and **enable mail check**

```away -c message```

Lock terminal and **disable mail check**

```away -C message```

Set **background task interval** in seconds

```away -t seconds message```

Lock terminal and **persist mail checking** until all mailboxes receive mail

```away -p message```

# SYNOPSIS

**away** [_options_] _message_

# DESCRIPTION

**away** locks the terminal and displays an away message to anyone who sees the screen. It optionally monitors for new mail and can manage background task timing.

The terminal remains locked until the user authenticates. The away message is visible to other users who may access the terminal.

# PARAMETERS

**-c**, **--mail**
> Enable checking of mail

**-C**, **--nomail**
> Disable checking of mail

**-f**, **--rcfile**=_FILE_
> Specify an alternative configuration file instead of ~/.awayrc

**-F**, **--norcfile**
> Ignore user configuration file

**-m**, **--message**
> Treat the remainder of the command line as the message

**-t**, **--time**=_SECONDS_
> Set the number of seconds away sleeps before performing background tasks

**-T**, **--notime**
> Ignore time interval options and use the default

**-p**, **--persist**
> Continue checking mail as long as at least one mailbox has not received new mail

**-P**, **--nopersist**
> Stop checking mail if any mailbox is found to have new mail

**-h**, **--help**
> Display help information

**-v**, **--version**
> Display version information

# CAVEATS

The lock mechanism relies on system authentication. Mail checking requires properly configured mail spool directories. The away message is visible to anyone with physical access to the terminal.

# SEE ALSO

[vlock](/man/vlock)(1), [screen](/man/screen)(1)
