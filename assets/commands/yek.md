# TAGLINE

Serialize code repositories for LLM consumption

# TLDR

**Serialize current directory** for LLM consumption

```yek```

**Serialize specific directories**

```yek [src/] [tests/]```

**Serialize with token limit**

```yek --tokens [128k]```

**Serialize with size limit**

```yek --max-size [10MB]```

**Pipe output** to clipboard

```yek | pbcopy```

**Include line numbers** in output

```yek --line-numbers```

**Include directory tree** header

```yek --tree-header```

**Output as JSON**

```yek --json```

**Use glob patterns**

```yek "[src/**/*.ts]"```

# SYNOPSIS

**yek** [_options_] [_input-paths_...]

# PARAMETERS

**--tokens** _count_
> Limit output by approximate token count (e.g., 128k, 100)

**--max-size** _size_
> Limit output by byte size (e.g., 10MB, 128K); default: 10MB

**--json**
> Output results in JSON format

**--output-dir** _path_
> Directory for output files; uses temp directory if not specified

**--output-name** _name_
> Filename written to current directory

**--output-template** _template_
> Custom format using FILE_PATH and FILE_CONTENT placeholders

**--ignore-patterns** _patterns_
> Additional patterns to ignore (extends .gitignore)

**--unignore-patterns** _patterns_
> Override built-in ignore rules

**--line-numbers**
> Include line numbers in output

**-t**, **--tree-header**
> Include directory tree at the start of output

**--tree-only**
> Show only directory structure without file contents

**--no-config**
> Skip loading configuration files

**--config-file** _path_
> Use specific configuration file

**--debug**
> Enable debug logging

# DESCRIPTION

**yek** (Farsi for "one") is a fast Rust-based CLI tool that serializes code repositories into text optimized for LLM (Large Language Model) consumption. It combines files into a single output with intelligent ordering and automatic filtering.

The tool respects **.gitignore** rules, uses Git history to prioritize important files, and automatically skips binary and large files. Output can be split into chunks based on token count or byte size.

When output is piped, yek automatically streams content instead of writing to files. This enables workflows like **yek | pbcopy** to quickly copy a codebase to clipboard for pasting into an LLM chat.

Configuration can be stored in **yek.toml** or **yek.yaml** files for project-specific settings.

# CAVEATS

Token counting is approximate and may vary from actual LLM tokenization. Very large repositories may need chunking with **--tokens** or **--max-size**. Glob patterns must be quoted to prevent shell expansion.

# HISTORY

**yek** was created by **Mohsen Azimi** as a high-performance tool for preparing code for LLM analysis. Written in **Rust**, it achieved significant speed improvements over similar tools—benchmarks show it running 230× faster than alternatives like Repomix. The name means "one" in Farsi (یک), reflecting its purpose of combining files into one output.

# SEE ALSO

[tree](/man/tree)(1), [find](/man/find)(1), [cat](/man/cat)(1), [rg](/man/rg)(1)
