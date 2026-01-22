# TLDR

**Generate temp email**

```mailsy generate```

**Check inbox**

```mailsy check```

**List messages**

```mailsy list```

**Read message**

```mailsy read [message_id]```

**Delete email**

```mailsy delete```

**Get current address**

```mailsy me```

# SYNOPSIS

**mailsy** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation to perform.

**generate**
> Create new temp email.

**check**
> Check for new messages.

**list**
> List all messages.

**read** _ID_
> Read specific message.

**delete**
> Delete email address.

**me**
> Show current address.

**--help**
> Display help information.

# DESCRIPTION

**mailsy** creates temporary disposable emails. It generates random addresses for receiving mail.

The tool is useful for sign-ups and testing. Addresses are automatically deleted after a period.

mailsy manages temp emails.

# CAVEATS

Depends on external service. Emails expire. Not for production use.

# HISTORY

mailsy provides CLI access to **temporary email** services for disposable addresses.

# SEE ALSO

[tmpmail](/man/tmpmail)(1), [mail](/man/mail)(1)

