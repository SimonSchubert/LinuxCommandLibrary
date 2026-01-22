# TLDR

**Show mail senders**

```from```

**Show for specific** user

```from [username]```

**Show sender and** subject

```from -s```

**Count messages**

```from -c```

**Check specific mailbox**

```from -f [/var/mail/user]```

# SYNOPSIS

**from** [_options_] [_user_]

# PARAMETERS

_USER_
> Username to check mail for.

**-s**
> Show Subject line with sender.

**-c**
> Print count of messages only.

**-f** _FILE_
> Mailbox file to read.

**-n**
> Don't check for new mail.

**--help**
> Display help information.

# DESCRIPTION

**from** displays the mail header summary showing who mail is from. It reads the system mailbox and shows sender information for each message.

The tool provides a quick overview of pending mail without opening a mail client. With -s, it shows subjects for quick scanning of message content.

from is useful for checking mail status in shell scripts or quick terminal checks.

# CAVEATS

Only works with mbox format mailboxes. May not work with modern mail systems. Limited to local mail.

# HISTORY

from is a classic **BSD utility** for checking local mail. It predates modern mail systems and works with traditional Unix mbox files.

# SEE ALSO

[mail](/man/mail)(1), [biff](/man/biff)(1), [mailx](/man/mailx)(1)
