# TAGLINE

Show messages surrounding a specific WhatsApp message (context)

# TLDR

**Show surrounding context** for a message ID

```wacli messages context AABBCC1122334455 --json```

**Use a different store**

```wacli messages context AABBCC1122334455 --json --store ~/.wacli-work```

# SYNOPSIS

**wacli** **messages** **context** _message_id_ [--json] [--store _dir_]

# DESCRIPTION

**wacli messages context** returns the target message together with a window of messages immediately before and after it in the same chat. This helps understand conversation flow around a particular message.

# PARAMETERS

_message_id_
> ID of the central message.

**--json**
> JSON output.

**--store**
> Alternate store path.

# SEE ALSO

wacli, wacli-messages-show, wacli-messages-list

# RESOURCES

```[Source code](https://github.com/openclaw/wacli)```

```[Documentation](https://wacli.sh/messages.html)```

<!-- verified: 2026-07-09 -->
