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
> Print strings without JSON quoting.

**-R**, **--raw-input**
> Read input as raw strings, one per line.

**-s**, **--slurp**
> Collect all input values into a single array.

**-c**, **--compact-output**
> Emit JSON on a single line.

**-S**, **--sort-keys**
> Sort object keys in the output.

**--indent** _N_
> Use _N_ spaces per indent level (default **2**).

**--tab**
> Use a tab for each indent level.

**-C**, **--color-output**
> Force colored output even when stdout is not a TTY.

**-M**, **--monochrome-output**
> Disable colored output.

**-i**, **--in-place**
> Rewrite each input file with the result of the filter.

**--from** _FORMAT_
> Input format: **json**, **yaml**, **cbor**, **toml**, **xml**, **csv**, **tsv**, **raw**, **raw0**, **xjon**.

**--to** _FORMAT_
> Output format (same set as **--from**).

**-n**, **--null-input**
> Use **null** as the input value.

# DESCRIPTION

**jaq** is a clone of the JSON processing tool **jq**, focused on correctness, speed, and simplicity. It is available as both a command-line program (a near drop-in replacement for jq) and as a Rust library. Beyond standard JSON, jaq supports **YAML**, **CBOR**, **TOML**, and **XML** formats.

jaq aims to provide more correct and predictable behavior than jq in edge cases, while maintaining compatibility for common usage. Its core has been security-audited by **Radically Open Security**.

# CAVEATS

While highly compatible with jq, some edge-case behaviors differ intentionally for correctness. Not all jq built-in functions are implemented. Custom jq modules are not supported.

# HISTORY

**jaq** was created by **Michael Färber** (01mf02) and is written in **Rust**. It was motivated by concerns about jq's start-up time and edge-case correctness, and has been benchmarked to be faster than jq on most operations.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1)
