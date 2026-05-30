# TAGLINE

Catch AI-generated code smells and low-quality patterns left by coding agents

# TLDR

Scan the current directory for AI slop

```aislop scan```

Scan only changed files and output JSON for CI

```aislop scan --changes --json```

Auto-fix mechanical issues

```aislop fix```

Install a hook that runs after every agent edit (Claude Code example)

```aislop hook install --claude```

Run in CI mode and fail the build below a threshold

```aislop ci```

Scan staged files only

```aislop scan --staged```

Run with a custom config and fail CI if score drops below 80

```aislop ci --fail-below 80```

Print the prompt you can hand to an agent for the remaining issues

```aislop fix --prompt```

# SYNOPSIS

**aislop** [_command_] [_options_] [_path_]

# DESCRIPTION

**aislop** is a fast, deterministic CLI that detects the characteristic patterns left behind by AI coding agents (Claude Code, Cursor, Codex, etc.). It scores code on a 0–100 scale and can automatically fix many mechanical issues.

Instead of relying on LLMs at runtime, aislop uses a combination of formatters, linters, AST analysis, and a large set of hand-written rules targeting narrative comments, trivial comments, `as any` casts, hallucinated imports, swallowed exceptions, dead code, oversized functions, and other "slop" patterns that compile and pass tests but degrade long-term maintainability.

The tool supports TypeScript/JavaScript, Python, Go, Rust, Ruby, PHP, and Java. It is designed to run in editors, pre-commit hooks, CI pipelines, and as a quality gate before accepting agent-generated changes.

# PARAMETERS

**scan**  
> Analyze code and report issues (default command when no subcommand given)

**fix**  
> Automatically fix issues that can be fixed mechanically

**ci**  
> Run in CI mode (JSON output, exits non-zero below threshold)

**hook**  
> Manage per-edit hooks for Claude, Cursor, and other agents

**rules**  
> List all active rules

**init**  
> Create a .aislop/config.yml file

Common flags:

**--json**  
> Output machine-readable JSON

**--sarif**  
> Output SARIF 2.1.0 for GitHub Code Scanning

**-f**, **--force** (with fix)  
> Apply aggressive fixes (unused dependencies, files, etc.)

# CONFIGURATION

Create `.aislop/config.yml` to tune behavior:

```yaml
ci:
  failBelow: 75

rules:
  ai-slop/narrative-comment: warning
  security/hardcoded-secret: error

exclude:
  - "**/*.generated.ts"
```

# SEE ALSO

[oxlint](/man/oxlint), [ruff](/man/ruff), [clippy](/man/clippy), [biome](/man/biome)
