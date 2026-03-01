# TAGLINE

Manage OpenCode sessions

# TLDR

**List** all sessions

```opencode session list```

**Resume** a previous session

```opencode session resume [session_id]```

**Continue** the most recent session

```opencode session continue```

# SYNOPSIS

**opencode session** _subcommand_ [_options_]

# DESCRIPTION

**opencode session** manages OpenCode coding sessions. Sessions persist conversation history, tool calls, and context in a local **SQLite** database. You can list past sessions, resume a specific session by ID, or continue the most recent one. This allows picking up where you left off across terminal restarts.

# SEE ALSO

[opencode](/man/opencode)(1), [opencode-export](/man/opencode-export)(1), [opencode-import](/man/opencode-import)(1)
