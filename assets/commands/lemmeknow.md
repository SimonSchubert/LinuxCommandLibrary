# TAGLINE

Fastest way to identify mysterious text and encoded strings

# TLDR

**Identify a string**

```lemmeknow "[string]"```

**Identify strings from a file**

```lemmeknow [path/to/file]```

**Output results as JSON**

```lemmeknow -j "[string]"```

# SYNOPSIS

**lemmeknow** [_options_] _input_

# PARAMETERS

**-j**, **--json**
> Output results in JSON format.

**-b**, **--boundary**
> Only match strings with word boundaries.

# DESCRIPTION

**lemmeknow** is a tool for identifying unknown text, encoded strings, hashes, and other data patterns. It can analyze hard-coded strings from captured network packets, malware, or any other source to determine what kind of data they represent (e.g., API keys, hashes, encoded values, IP addresses).

It is approximately **33x faster** than pywhat for file analysis and **3x faster** for single strings. The tool also supports WebAssembly compilation for browser-based use.

# CAVEATS

Identification is based on pattern matching and may produce false positives for ambiguous strings.

# HISTORY

**lemmeknow** was created by **swanandx** and is written in **Rust**. It is available as both a CLI tool and a library.

# SEE ALSO

[file](/man/file)(1)
