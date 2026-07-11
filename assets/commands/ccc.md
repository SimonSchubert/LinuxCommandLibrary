# TAGLINE

ContextCodeCache generator for AI coding agents

# TLDR

**Scan a project** and generate the `.ccc/` cache

```ccc scan```

**Scan and also produce a token stream**

```ccc scan . --tokens```

**Check whether the committed cache is up to date** (CI)

```ccc check .```

**Install the binary to PATH** (Linux)

```ccc install```

# SYNOPSIS

**ccc** scan [_PATH_] [--tokens]

**ccc** check [_PATH_] [--format json]

**ccc** tokenize [_PATH_]

**ccc** install [--dir DIR] [--force]

# DESCRIPTION

ccc scans a source tree and produces a compact, machine-readable `.ccc/` directory containing per-file summaries: constants, functions (with types and doc summaries), call-graph edges inside the file, and marker comments (TODO, FIXME, etc.).

The cache is designed to be committed and consumed by AI agents so they have a cheap, always-fresh structural index instead of repeatedly grepping or re-reading source.

Supported languages: Rust, Python, JavaScript, TypeScript (+ TSX), and Go (via tree-sitter). Unsupported files are skipped; hidden dirs, common build/vendor dirs, and `.gitignore` rules are honored.

# INSTALL

Requires Rust ≥ 1.77 and a recent cargo:

```bash
cargo build --release
./target/release/ccc install
```

The `ccc install` subcommand copies the binary to `~/.local/bin` (or a directory you choose with `--dir`). Use `--force` to overwrite an existing install.

# PARAMETERS

**scan** [_PATH_]
> Regenerate the `.ccc` directory for the given path (defaults to current directory).

**--tokens**
> Also emit a pre-encoded token stream (`tokens.bin` + `tokens.json`) for models that can consume raw token IDs.

**check** [_PATH_]
> Exit non-zero if the on-disk cache is stale relative to current sources. Useful in CI.

**--format json**
> Machine-readable output listing changed files (`{ root, up_to_date, files[], changes[] }`).

**tokenize** [_PATH_]
> Pre-encode an existing `.ccc` into `tokens.bin` + `tokens.json` without a full rescan.

**install** [--dir DIR] [--force]
> Copy the running binary onto your PATH (Linux). Default dir: `~/.local/bin`.

# CAVEATS

The token stream uses approximate tiktoken IDs (OpenAI vocabulary, e.g. `o200k_base`) and is **not compatible with Anthropic models**. Use the Markdown form of the cache with Claude.

Regenerate the cache whenever source files that affect the index change. A CI step of `ccc check .` fails the build if the cache is out of date.

# RESOURCES

```[Source code](https://github.com/colwill/ccc)```

<!-- verified: 2026-07-11 -->
