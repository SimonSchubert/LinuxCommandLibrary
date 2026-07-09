# TAGLINE

Display a specific WhatsApp message by ID

# TLDR

**Show a message** by its ID in JSON format

```wacli messages show AABBCC1122334455 --json```

**Show using a custom store directory**

```wacli messages show AABBCC1122334455 --json --store /path/to/store```

# SYNOPSIS

**wacli** **messages** **show** _message_id_ [--json] [--store _dir_]

# DESCRIPTION

**wacli messages show** fetches and prints the full record for a single message identified by its internal ID from the local store.

Useful for inspecting details, media references, or for scripting when you already have an ID (e.g. from a previous search or list).

# PARAMETERS

_message_id_
> The message identifier (opaque string used by wacli store).

**--json**
> Output as JSON (recommended for further processing).

**--store** _dir_
> Use an alternate store location (default `~/.wacli`).

# SEE ALSO

wacli, wacli-messages-list, wacli-messages-context

# RESOURCES

```[Source code](https://github.com/openclaw/wacli)```

```[Documentation](https://wacli.sh/messages.html)```

<!-- verified: 2026-07-09 -->
