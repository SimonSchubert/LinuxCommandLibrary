# TAGLINE

List messages from a WhatsApp chat

# TLDR

**List messages** from a specific chat in JSON

```wacli messages list --chat 491234567890@s.whatsapp.net --json```

**List messages received after a date**

```wacli messages list --chat 491234567890@s.whatsapp.net --after 2026-01-01 --json```

**Limit results** and list oldest first

```wacli messages list --chat 491234567890@s.whatsapp.net --limit 20 --asc --json```

**List only messages you sent**

```wacli messages list --from-me --limit 20 --json```

**List messages in a date range**

```wacli messages list --chat 491234567890@s.whatsapp.net --after 2026-01-01 --before 2026-01-31 --json```

# SYNOPSIS

**wacli** **messages** **list** [--chat _jid_] [--sender _jid_] [--from-me|--from-them] [--asc] [--limit _n_] [--after _date_] [--before _date_] [--forwarded] [--starred] [--json] [--store _dir_]

# DESCRIPTION

**wacli messages list** retrieves messages from the local SQLite store, optionally filtered to a single chat (JID), sender, direction, flags, and/or a time window. Output is human-readable by default; use `--json` for machine consumption.

WhatsApp status broadcasts are stored separately and are not returned by `messages list`.

The local store is populated by `wacli sync` (or `sync --follow`). Default store path is `~/.local/state/wacli` on Linux and `~/.wacli` elsewhere (existing `~/.wacli` on Linux continues to work).

# PARAMETERS

**--chat** _jid_
> Restrict to messages in this chat JID (e.g. `491234567890@s.whatsapp.net` or a group JID).

**--sender** _jid_
> Restrict to messages from this sender JID.

**--from-me**, **--from-them**
> Only messages sent by you, or only messages from others.

**--asc**
> Sort ascending (oldest first). Default order is newest first.

**--after** _date_
> Only messages on or after this time (RFC3339 or `YYYY-MM-DD`).

**--before** _date_
> Only messages before this time (RFC3339 or `YYYY-MM-DD`).

**--limit** _n_
> Maximum number of messages to return.

**--forwarded**
> Only forwarded messages.

**--starred**
> Only starred messages.

**--json**
> Emit JSON instead of a human-readable table.

**--store** _dir_
> Override the store directory (cannot be combined with `--account`).

# SEE ALSO

[wacli](/man/wacli)(1), [wacli-messages-search](/man/wacli-messages-search)(1), [wacli-messages-show](/man/wacli-messages-show)(1), [wacli-messages-context](/man/wacli-messages-context)(1)

# RESOURCES

```[Source code](https://github.com/openclaw/wacli)```

```[Documentation](https://wacli.sh/messages.html)```

<!-- verified: 2026-07-11 -->
