# TAGLINE

ContextCodeCache generator for AI coding agents

# TLDR

**Scan a project and generate the cache**

```ccc scan```

**Scan and also produce a token stream**

```ccc scan . --tokens```

**Check whether the committed cache is up to date (CI)**

```ccc check .```

**Install the binary to PATH (Linux)**

```ccc install```

# SYNOPSIS

**ccc** scan [_PATH_] [--tokens]

**ccc** check [_PATH_] [--format json]

**ccc** tokenize [_PATH_]

**ccc** install [--dir DIR] [--force]

# DESCRIPTION

ccc scans a source tree and produces a compact, machine-readable `.ccc/` directory containing per-file summaries: constants, functions (with types and doc summaries), call-graph edges inside the file, and marker comments (TODO, FIXME, etc.).

The cache is designed to be committed and consumed by AI agents so they have a cheap, always-fresh structural index instead of repeatedly grepping or re-reading source.

Supported languages: Rust, Python, JavaScript, TypeScript, Go.

# INSTALL

cargo build --release
./target/release/ccc install

The `ccc install` subcommand copies the binary to `~/.local/bin` (or a directory you choose).

# PARAMETERS

**scan**  
> Regenerate the `.ccc` directory for the given path (defaults to current directory).

**--tokens**  
> Also emit a pre-encoded token stream (tokens.bin + tokens.json) for models that can consume raw token IDs.

**check**  
> Exit non-zero if the on-disk cache is stale relative to current sources. Useful in CI.

**--format json**  
> Machine-readable output listing changed files.

# CAVEATS

The token stream uses approximate tiktoken IDs and is noted as such; it is not guaranteed to match Anthropic tokenizers exactly. Use the Markdown form of the cache with Claude.

Regenerate the cache whenever source files that affect the index change.

# SEE ALSO

[colwill/ccc](https://github.com/colwill/ccc)

```[Source code](https://github.com/colwill/ccc)
<!-- verified: 2026-07-04 -->
```