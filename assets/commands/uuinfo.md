# TAGLINE

Debug and inspect unique identifiers (UUID, ULID, etc.)

# TLDR

**Inspect a UUID**

```uuinfo [01941f29-7c00-7aaa-aaaa-aaaaaaaaaaaa]```

**Pipe a UUID from stdin**

```echo "[some-uuid]" | uuinfo -```

**Output as JSON**

```uuinfo -o json [id]```

**Show only the ID type and version**

```uuinfo -o short [id]```

**Force parsing as a specific format**

```uuinfo -f [xid] [id]```

**Try every known format**

```uuinfo -e [id]```

**Compare the dates of Snowflake variants**

```uuinfo --compare [2039815312720154892]```

**View the raw bits**

```uuinfo -o binary [id] | xxd -b```

# SYNOPSIS

**uuinfo** [_options_] _ID_

# PARAMETERS

_ID_
> UUID, ULID, Snowflake or other ID. Use **-** to read from stdin.

**-o**, **--output** _FORMAT_
> Output format: card (default), short, json, or binary.

**-f**, **--force** _FORMAT_
> Force a format. See **--help** for the list of values.

**-e**, **--everything**
> Try to parse all known formats. Disables the output options.

**-c**, **--compare**
> Compare times of different Snowflake versions.

**-a**, **--alphabet** _ALPHABET_
> Use a custom alphabet for Sqids and Nano ID.

**-r**, **--relative**
> Show relative time if a timestamp is available.

**--salt** _SALT_
> Custom salt for Hashids.

**--epoch** _SECONDS_
> Override the epoch for time-based IDs, in seconds since 1970-01-01 UTC.

**-h**, **--help**
> Print help.

**-V**, **--version**
> Print version.

# DESCRIPTION

**uuinfo** parses and displays detailed information about compound unique identifiers including UUID versions 1-8, ULID, Snowflake, and more. It shows color-coded bit breakdowns, timestamps, entropy, and version information. Supports auto-detection and forced format parsing.

# CAVEATS

Auto-detection uses basic heuristics on length and popularity, so an ID valid in several formats can be misidentified. Snowflake is a category of formats: the variant cannot be detected and must be given with **-f**, such as **sf-twitter**.

# HISTORY

**uuinfo** was created by **Ronaldo Ferreira** (Racum) and is written in **Rust**.

# SEE ALSO

[uuidgen](/man/uuidgen)(1)

# RESOURCES

```[Source code](https://github.com/Racum/uuinfo)```

<!-- verified: 2026-11-09 -->
