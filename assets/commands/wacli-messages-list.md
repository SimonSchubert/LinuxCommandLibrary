# TAGLINE

List messages from a WhatsApp chat

# TLDR

**List messages** from a specific chat in JSON

```wacli messages list --chat 491234567890@s.whatsapp.net --json```

**List messages received after a date**

```wacli messages list --chat 491234567890@s.whatsapp.net --after 2026-01-01 --json```

**Limit results**

```wacli messages list --chat 491234567890@s.whatsapp.net --limit 20 --json```

**List messages in a date range**

```wacli messages list --chat 491234567890@s.whatsapp.net --after 2026-01-01 --before 2026-01-31 --json```

# SYNOPSIS

**wacli** **messages** **list** [--chat _jid_] [--after _date_] [--before _date_] [--limit _n_] [--json]

# DESCRIPTION

**wacli messages list** retrieves messages from the local SQLite store, optionally filtered to a single chat (JID) and/or a time window. Output is human-readable by default; use `--json` for machine consumption.

The local store is populated by the `wacli sync` command (or `sync --follow`).

# PARAMETERS

**--chat** _jid_
> Restrict to messages in this chat JID (e.g. `491234567890@s.whatsapp.net` or group JID).

**--after** _date_
> Only messages received on or after this date (YYYY-MM-DD).

**--before** _date_
> Only messages received before this date.

**--limit** _n_
> Maximum number of messages to return (default unlimited or a high number).

**--json**
> Emit JSON instead of human table.

# SEE ALSO

wacli, wacli-messages-search, wacli-messages-show, wacli-messages-context

# RESOURCES

```[Source code](https://github.com/openclaw/wacli)```

```[Documentation](https://wacli.sh/messages.html)```

<!-- verified: 2026-07-09 -->
