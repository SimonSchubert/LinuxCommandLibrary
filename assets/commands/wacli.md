# TAGLINE

WhatsApp CLI for local sync, search, and messaging

# TLDR

**Authenticate** by scanning a QR code from your primary WhatsApp device

```wacli auth```

**Search** synced message history for a keyword

```wacli messages search "[keyword]"```

**Send a text message** to a contact

```wacli send text --to [phone_number] --message "[message]"```

**Send a file** with a caption

```wacli send file --to [phone_number] --file [path/to/file] --caption "[caption]"```

**List** all chats

```wacli chats list```

**Run a continuous sync** loop in the background

```wacli sync --follow```

**Request older messages** from primary device

```wacli history backfill --chat [chat_jid] --count [50]```

# SYNOPSIS

**wacli** \<command\> [options]

# PARAMETERS

**auth**
> Interactive login via QR code and initial data sync

**sync**
> Non-interactive sync loop; requires prior authentication

**sync --follow**
> Keep syncing continuously

**messages search** _query_
> Search synced messages using FTS5 full-text search

**messages list** [_--chat jid_] [_--limit n_]
> List messages, optionally filtered by chat

**history backfill** **--chat** _jid_ [_--count n_] [_--requests n_]
> Fetch older messages from primary device

**media download** **--chat** _jid_ **--id** _msg_id_
> Download media for a specific message

**send text** **--to** _recipient_ **--message** _text_
> Send a text message to a contact or group

**send file** **--to** _recipient_ **--file** _path_ [_--caption text_] [_--filename name_]
> Send a file with optional caption and display name override

**chats list**
> List all chats

**groups list**
> List all groups

**groups rename** **--jid** _group_jid_ **--name** _new_name_
> Rename a group

**doctor**
> Run diagnostics on the local store

**--store** _DIR_
> Override default store directory (default: ~/.wacli)

**--json**
> Machine-readable JSON output

# DESCRIPTION

**wacli** is a command-line interface for WhatsApp built on the **whatsmeow** library. It provides best-effort local synchronization of message history, fast offline full-text search, message sending, and contact and group management, all from the terminal.

Authentication is performed by scanning a QR code displayed in the terminal from your primary WhatsApp device. Once authenticated, wacli stores session data, messages, contacts, and media references in a local SQLite database at **~/.wacli** by default. The sync command captures incoming messages continuously, while history backfill requests older messages from the primary device on demand.

Search uses SQLite FTS5 for fast full-text queries with LIKE fallback, returning results with contextual snippets. All output defaults to human-readable format with **--json** available for scripting and automation.

# CAVEATS

wacli is a **third-party tool** that uses the WhatsApp Web protocol via whatsmeow and is **not affiliated with WhatsApp**. WhatsApp actively bans accounts using third-party clients, and bans are often permanent with no appeal process. History backfill is best-effort and requires the primary device to be online. Media downloads depend on WhatsApp's content retention policies.

# HISTORY

wacli was created by **Peter Steinberger** (steipete) and written in **Go**. The project was first released in **2025** with a focus on providing a native terminal experience for WhatsApp, enabling local message synchronization and offline search capabilities that the official WhatsApp clients do not offer.

# SEE ALSO

[signal-cli](/man/signal-cli)(1), [neomutt](/man/neomutt)(1)
