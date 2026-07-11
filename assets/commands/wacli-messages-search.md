# TAGLINE

Search WhatsApp message history using full-text search

# TLDR

**Search all messages** for a keyword

```wacli messages search "meeting notes" --json```

**Search within a specific chat**

```wacli messages search "project" --chat 491234567890@s.whatsapp.net --json```

**Search messages from a sender**

```wacli messages search "report" --from 491234567890@s.whatsapp.net --json```

**Search by message type** (image, video, etc.)

```wacli messages search "" --type image --json```

**Search documents that have media**

```wacli messages search "invoice" --has-media --type document --json```

**Limit and filter by date**

```wacli messages search "budget" --chat 491234567890@s.whatsapp.net --after 2026-01-01 --limit 5 --json```

# SYNOPSIS

**wacli** **messages** **search** _query_ [--chat _jid_] [--from _jid_] [--has-media] [--type _type_] [--forwarded] [--starred] [--limit _n_] [--after _date_] [--before _date_] [--json] [--store _dir_]

# DESCRIPTION

**wacli messages search** performs a full-text search over the locally synced message bodies. It uses SQLite FTS5 when the binary was built with `-tags sqlite_fts5`, and falls back to `LIKE` otherwise. Optional filters cover chat, sender, date range, media, type, and starred/forwarded flags.

Search works completely offline once the store has been synced. Status broadcasts are not included.

Default store path is `~/.local/state/wacli` on Linux and `~/.wacli` elsewhere.

# PARAMETERS

_query_
> Search terms. Supports simple terms; quote phrases as needed for the shell.

**--chat** _jid_
> Limit search to one chat.

**--from** _jid_
> Limit to messages from this sender.

**--has-media**
> Only messages that include media.

**--type** _type_
> Filter by content type: `text`, `image`, `video`, `audio`, or `document`.

**--forwarded**
> Only forwarded messages.

**--starred**
> Only starred messages.

**--after**, **--before** _date_
> Date filters (RFC3339 or `YYYY-MM-DD`).

**--limit** _n_
> Maximum results.

**--json**
> JSON output.

**--store** _dir_
> Override the store directory (cannot be combined with `--account`).

# CAVEATS

Search only covers messages that have been synced into the local store. History is best-effort; use `wacli history backfill` for older messages.

# SEE ALSO

[wacli](/man/wacli)(1), [wacli-messages-list](/man/wacli-messages-list)(1), [wacli-messages-show](/man/wacli-messages-show)(1), [wacli-messages-context](/man/wacli-messages-context)(1)

# RESOURCES

```[Source code](https://github.com/openclaw/wacli)```

```[Documentation](https://wacli.sh/messages.html)```

<!-- verified: 2026-07-11 -->
