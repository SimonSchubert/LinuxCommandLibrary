# TAGLINE

Debug and inspect unique identifiers (UUID, ULID, etc.)

# TLDR

**Inspect a UUID**

```uuinfo [01941f29-7c00-7aaa-aaaa-aaaaaaaaaaaa]```

**Pipe a UUID from stdin**

```echo "[some-uuid]" | uuinfo -```

**Output as JSON**

```uuinfo -o json [id]```

# SYNOPSIS

**uuinfo** [_options_] _ID_

# DESCRIPTION

**uuinfo** parses and displays detailed information about compound unique identifiers including UUID versions 1-8, ULID, Snowflake, and more. It shows color-coded bit breakdowns, timestamps, entropy, and version information. Supports auto-detection and forced format parsing.

# HISTORY

**uuinfo** was created by **Ronaldo Ferreira** (Racum) and is written in **Rust**.

# SEE ALSO

[uuidgen](/man/uuidgen)(1)
