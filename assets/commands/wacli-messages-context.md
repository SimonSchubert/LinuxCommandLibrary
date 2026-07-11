# TAGLINE

Show messages surrounding a specific WhatsApp message (context)

# TLDR

**Show surrounding context** for a message

```wacli messages context --chat 491234567890@s.whatsapp.net --id ABC123 --json```

**Control how many messages** before and after

```wacli messages context --chat 491234567890@s.whatsapp.net --id ABC123 --before 3 --after 3 --json```

**Use a different store**

```wacli messages context --chat 491234567890@s.whatsapp.net --id ABC123 --json --store ~/.wacli-work```

# SYNOPSIS

**wacli** **messages** **context** **--chat** _jid_ **--id** _msg_id_ [--before _n_] [--after _n_] [--json] [--store _dir_]

# DESCRIPTION

**wacli messages context** returns the target message together with a window of messages immediately before and after it in the same chat. This helps understand conversation flow around a particular message.

Default store path is `~/.local/state/wacli` on Linux and `~/.wacli` elsewhere.

# PARAMETERS

**--chat** _jid_
> Chat JID that contains the message.

**--id** _msg_id_
> ID of the central message.

**--before** _n_
> Number of preceding messages to include.

**--after** _n_
> Number of following messages to include.

**--json**
> JSON output.

**--store** _dir_
> Alternate store path (default `~/.local/state/wacli` on Linux, `~/.wacli` elsewhere).

# SEE ALSO

[wacli](/man/wacli)(1), [wacli-messages-show](/man/wacli-messages-show)(1), [wacli-messages-list](/man/wacli-messages-list)(1), [wacli-messages-search](/man/wacli-messages-search)(1)

# RESOURCES

```[Source code](https://github.com/openclaw/wacli)```

```[Documentation](https://wacli.sh/messages.html)```

<!-- verified: 2026-07-11 -->
