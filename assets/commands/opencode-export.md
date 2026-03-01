# TAGLINE

Export OpenCode session data

# TLDR

**Export** the current session as JSON

```opencode export```

**Export** a specific session by ID

```opencode export [session_id]```

# SYNOPSIS

**opencode export** [_session_id_]

# DESCRIPTION

**opencode export** exports session data from OpenCode as JSON. Sessions contain the full conversation history, tool calls, and context from an AI coding session. If no session ID is specified, the current or most recent session is exported. The output can be redirected to a file for archival or sharing.

# SEE ALSO

[opencode](/man/opencode)(1), [opencode-import](/man/opencode-import)(1), [opencode-session](/man/opencode-session)(1)
