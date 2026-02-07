# TAGLINE

Display mail sender information from a mailbox

# TLDR

**Show who has sent mail to your mailbox**

```bsd-from```

**Show only a count of messages**

```bsd-from -c```

**Show mail from a specific sender**

```bsd-from -s [sender]```

**Examine a different mailbox file**

```bsd-from -f [path/to/mailbox]```

**Check another user's mailbox**

```bsd-from [username]```

# SYNOPSIS

**bsd-from** [**-c**] [**-f** _file_] [**-s** _sender_] [_user_]

# DESCRIPTION

**bsd-from** (also known as **from**) prints the mail header lines from a mailbox, showing the names of people who have sent mail. By default, it examines the invoker's mailbox.

The command provides a quick way to see pending mail without opening a full mail client. It displays the "From" lines of messages, giving an overview of who has sent mail.

# PARAMETERS

**-c**
> Print only a count of messages and exit

**-f** _file_
> Examine the specified file instead of the default mailbox. Use **-** to read from standard input

**-s** _sender_
> Only print mail from addresses containing the specified string

**user**
> Examine the specified user's mailbox instead of the invoker's (requires appropriate privileges)

# CAVEATS

When using the **-f** option, the user argument should not be specified. Examining other users' mailboxes requires elevated privileges.

The default mailbox location is determined by the **MAIL** environment variable, or **/var/mail** if not set.

# HISTORY

The **from** command first appeared in **BSD 3.0** in 1979 as part of the Berkeley Software Distribution mail utilities.

# SEE ALSO

[biff](/man/biff)(1), [mail](/man/mail)(1)
