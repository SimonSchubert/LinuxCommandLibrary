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

**Limit and filter by date**

```wacli messages search "budget" --chat 491234567890@s.whatsapp.net --after 2026-01-01 --limit 5 --json```

# SYNOPSIS

**wacli** **messages** **search** _query_ [_options_]

# DESCRIPTION

**wacli messages search** performs a full-text search (SQLite FTS5) over the locally synced message bodies. It supports optional filters for chat, sender, date range, and message type. Results include context snippets when possible.

The search is fast and works completely offline once the store has been synced.

# PARAMETERS

_query_
> Search terms. Supports simple terms; exact phrases with quotes in some shells.

**--chat** _jid_
> Limit search to one chat.

**--from** _jid_
> Limit to messages from this sender.

**--after**, **--before**
> Date filters (YYYY-MM-DD).

**--type** _type_
> Filter by message content type: text, image, video, audio, document, etc.

**--limit** _n_
> Maximum results.

**--json**
> JSON output.

# CAVEATS

Search only covers messages that have been synced into the local store. History is best-effort; use `history backfill` for older messages.

# SEE ALSO

wacli, wacli-messages-list, wacli-messages-show

# RESOURCES

```[Source code](https://github.com/openclaw/wacli)```

```[Documentation](https://wacli.sh/messages.html)```

<!-- verified: 2026-07-09 -->
