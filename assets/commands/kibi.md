# TAGLINE

Text editor in less than 1024 lines of Rust

# TLDR

**Open a file**

```kibi [path/to/file]```

**Create a new file**

```kibi```

# SYNOPSIS

**kibi** [_file_]

# DESCRIPTION

**kibi** is a configurable text editor with UTF-8 support, incremental search, syntax highlighting, and line numbers, written in less than 1024 lines of Rust with minimal dependencies. It supports syntax highlighting configuration for **38+ languages**.

Inspired by **kilo** (created by Salvatore Sanfilippo), kibi aims to be a tiny but functional editor that guarantees memory safety through Rust while keeping the codebase extremely small.

# KEY BINDINGS

**Ctrl+S** — Save
**Ctrl+Q** — Quit
**Ctrl+F** — Find (incremental search)
**Ctrl+G** — Go to line
**Ctrl+D** — Duplicate line

# CAVEATS

Limited feature set by design — no plugin system or advanced editing features. The 1024-line constraint means some features found in full editors are absent.

# HISTORY

**kibi** was created by **Ilaï Deutel** (ilai-deutel) and is written in **Rust**. It is compatible with Linux, macOS, Windows 10, and WASI. The name "kibi" means 1024 (as in kibibyte), referencing the line count constraint.

# SEE ALSO

[nano](/man/nano)(1), [micro](/man/micro)(1), [vim](/man/vim)(1)
