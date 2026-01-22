# TLDR

**Select first field**

```echo "one two three" | choose 0```

**Select third field**

```echo "a b c d e" | choose 2```

**Select range of fields**

```echo "a b c d e" | choose 1:3```

**Select from end (last field)**

```echo "a b c d e" | choose -1```

**Select last three fields**

```echo "a b c d e" | choose -3:```

**Custom field separator**

```echo "a,b,c" | choose -f ',' 1```

**Regex field separator**

```echo "a1b2c" | choose -f '[0-9]' 0:```

**Select exclusive range**

```echo "a b c d e" | choose 1:4 --exclusive```

# SYNOPSIS

**choose** [_options_] _field_[_:end_]

# DESCRIPTION

**choose** is a human-friendly, fast alternative to cut and awk for field selection. Written in Rust. Uses Python-like slice syntax with zero-based indexing and negative indices.

# PARAMETERS

**-f**, **--field-separator** _sep_
> Field separator (regex supported)

**-o**, **--output-field-separator** _sep_
> Output separator (default: space)

**-x**, **--exclusive**
> Exclude end index from range

**-c**, **--character-wise**
> Select characters instead of fields

**-n**, **--non-greedy**
> Use non-greedy field splitting

# FIELD SYNTAX

**N**
> Single field (0-indexed)

**N:M**
> Range from N to M (inclusive)

**N:**
> From N to end

**:M**
> From start to M

**-N**
> Nth field from end

# CAVEATS

Zero-indexed (first field is 0). Faster than cut for long inputs, much faster than awk. Install via cargo or brew install choose-rust.

# SEE ALSO

[cut](/man/cut)(1), [awk](/man/awk)(1), [sed](/man/sed)(1)
