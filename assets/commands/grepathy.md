# TAGLINE

Distill AI coding-agent decisions into commit-ready why files

# TLDR

**Initialize** hooks and `.ai/why` in a repository

```grepathy init```

**Show status** of distillation and health

```grepathy status```

**Run health checks** (doctor)

```grepathy doctor```

**Show why entries** that apply to a path

```grepathy context [path]```

**Distill and commit** why notes now (never pushes)

```grepathy sync```

**Disable** grepathy hooks temporarily

```grepathy off```

**Re-enable** grepathy hooks

```grepathy on```

**Remove** grepathy from the project

```grepathy uninstall```

# SYNOPSIS

**grepathy** _command_ [_options_]

# DESCRIPTION

**grepathy** records the *why* behind agent-written code so humans and future agents can review decisions without digging through chat transcripts. It reads coding-agent session transcripts **locally**, extracts decisions, and writes a per-branch markdown file under **.ai/why/** that you can commit with the code.

It is designed to run via git/Claude Code hooks rather than mid-task agent logging: after work on a branch, grepathy distills a why-pack, shows it for human review, and respects permanent edits or deletions of entries. It does not block pushes, does not stage unrelated files, and never pushes for you. A pointer in project agent docs and a pre-edit hook can inject relevant why entries when an agent touches matching paths.

Privacy-oriented: transcripts stay on the machine; only the sanitized markdown summary is meant for the repo. Summaries avoid quoting user messages, strip secrets, and pass deterministic scanners before you review.

Writing why files currently targets Claude Code session data; anything can read the committed markdown. Requires Node.js 20+ for install and use via **npx grepathy** or a local build.

# PARAMETERS

**init**
> Install hooks and directories. Safe to re-run. May offer to backfill existing sessions.

**status**
> Report distillation state and what looks stale.

**doctor**
> Health checks for installation and configuration.

**context** _path_
> Print why-pack entries that apply to the given file or path.

**sync**
> Distill and commit why content immediately (still never pushes).

**distill**
> Run distillation without the full sync flow (see **--help**).

**repair**
> Repair grepathy state or hooks.

**off** / **on**
> Temporarily disable or re-enable hooks.

**uninstall**
> Remove grepathy integration from the repository.

# CAVEATS

Does not stop agents from refactoring away important code; it only captures reasoning that is not visible in the source. Write-side support is Claude Code-oriented today. Why files are only as good as the summarizer and your review before commit. Empty or expired local transcripts cannot be recovered after the agent deletes them.

# SEE ALSO

[git](/man/git)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/evansjp/grepathy)```

<!-- verified: 2026-07-15 -->
