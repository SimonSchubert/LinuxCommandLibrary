# TLDR

Check **current status**

```mesg```

**Disallow** messages

```mesg n```

**Allow** messages

```mesg y```

Enable **verbose** mode

```mesg --verbose```

# SYNOPSIS

**mesg** [**y** | **n**]

# DESCRIPTION

**mesg** controls whether other users can send messages to your terminal using the write command. Without arguments, it displays the current setting.

# PARAMETERS

**y**
> Allow messages from other users

**n**
> Disallow messages from other users

**-v, --verbose**
> Print warning if not executed from terminal

# OUTPUT

Without arguments shows:
**is y**: Messages allowed
**is n**: Messages disallowed

# CAVEATS

Affects the current terminal only. Setting is not persistent across sessions. Some terminals may default to denying messages.

# SEE ALSO

[write](/man/write)(1), [talk](/man/talk)(1), [wall](/man/wall)(1)
