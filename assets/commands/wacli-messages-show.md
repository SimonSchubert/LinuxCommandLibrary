# TAGLINE

Display a specific WhatsApp message by chat and ID

# TLDR

**Show a message** by chat JID and message ID in JSON

```wacli messages show --chat 491234567890@s.whatsapp.net --id ABC123 --json```

**Show using a custom store directory**

```wacli messages show --chat 491234567890@s.whatsapp.net --id ABC123 --json --store /path/to/store```

# SYNOPSIS

**wacli** **messages** **show** **--chat** _jid_ **--id** _msg_id_ [--json] [--store _dir_]

# DESCRIPTION

**wacli messages show** fetches and prints the full record for a single message identified by chat JID and message ID from the local store.

Useful for inspecting details, media references, or scripting when you already have an ID (e.g. from a previous search or list). Deleted messages kept as local tombstones may still appear for direct `show` even when hidden from list/search.

Default store path is `~/.local/state/wacli` on Linux and `~/.wacli` elsewhere.

# PARAMETERS

**--chat** _jid_
> Chat JID that contains the message.

**--id** _msg_id_
> Message identifier within that chat.

**--json**
> Output as JSON (recommended for further processing).

**--store** _dir_
> Use an alternate store location (default `~/.local/state/wacli` on Linux, `~/.wacli` elsewhere).

# SEE ALSO

[wacli](/man/wacli)(1), [wacli-messages-list](/man/wacli-messages-list)(1), [wacli-messages-search](/man/wacli-messages-search)(1), [wacli-messages-context](/man/wacli-messages-context)(1)

# RESOURCES

```[Source code](https://github.com/openclaw/wacli)```

```[Documentation](https://wacli.sh/messages.html)```

<!-- verified: 2026-07-11 -->
