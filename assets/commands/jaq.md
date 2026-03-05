# TAGLINE

Fast jq clone focused on correctness and speed

# TLDR

**Filter JSON** from stdin

```echo '{"name": "world"}' | jaq '.name'```

**Process a JSON file**

```jaq '.[0]' [path/to/file.json]```

**Filter and format output**

```jaq -r '.[] | .name' [path/to/file.json]```

**Read YAML input**

```jaq --from yaml '.' [path/to/file.yaml]```

**Convert JSON to YAML**

```jaq --to yaml '.' [path/to/file.json]```

# SYNOPSIS

**jaq** [**-r**] [**--from** _format_] [**--to** _format_] _filter_ [_file_...]

# PARAMETERS

**-r**, **--raw-output**
> Output raw strings without quotes

**-R**, **--raw-input**
> Read input as raw strings

**-s**, **--slurp**
> Read entire input into an array

**-c**, **--compact-output**
> Compact output format

**--from** _FORMAT_
> Input format (json, yaml, cbor, toml)

**--to** _FORMAT_
> Output format (json, yaml, cbor, toml)

**-n**, **--null-input**
> Use null as input

# DESCRIPTION

**jaq** is a clone of the JSON processing tool **jq**, focused on correctness, speed, and simplicity. It is available as both a command-line program (a near drop-in replacement for jq) and as a Rust library. Beyond standard JSON, jaq supports **YAML**, **CBOR**, **TOML**, and **XML** formats.

jaq aims to provide more correct and predictable behavior than jq in edge cases, while maintaining compatibility for common usage. Its core has been security-audited by **Radically Open Security**.

# CAVEATS

While highly compatible with jq, some edge-case behaviors differ intentionally for correctness. Not all jq built-in functions are implemented. Custom jq modules are not supported.

# HISTORY

**jaq** was created by **Michael Färber** (01mf02) and is written in **Rust**. It was motivated by concerns about jq's start-up time and edge-case correctness, and has been benchmarked to be faster than jq on most operations.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1)
