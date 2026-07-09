# TAGLINE

Living wiki for codebases maintained by and for AI coding agents

# TLDR

**Setup** agent instructions and automation

```codealmanac setup --yes```

**Initialize** the wiki in the current repo

```codealmanac init```

**Search** the wiki

```codealmanac search "checkout timeout"```

**Show** a specific page

```codealmanac show getting-started```

**Ingest** material (file, PR, transcript) into the wiki

```codealmanac ingest README.md --using codex```

**Run** the local web viewer

```codealmanac serve```

# SYNOPSIS

**codealmanac** <command> [options]

# DESCRIPTION

CodeAlmanac maintains a plain-markdown wiki (`almanac/`) inside your repository that captures decisions, architecture, invariants, gotchas and workflows that source code alone cannot express. AI agents (via local harnesses such as Claude or Codex) keep the wiki up to date through `ingest` and `garden` operations. All data stays local.

Humans and agents use the same local CLI to search, read and validate the wiki.

# COMMANDS

**setup**
> Install agent instructions and optional automation (sync, garden).

**init**
> Create the initial almanac/ tree and topics.

**search**, **show**, **topics**, **health**, **validate**
> Read and inspect the wiki.

**ingest**, **garden**
> Update the wiki from sources via the configured agent harness.

**sync**, **jobs**, **serve**
> Automation status, job logs, and local web viewer.

# CAVEATS

- Write operations require a working local agent harness (Codex or Claude) and credentials.
- The wiki is committed Markdown; the CLI also maintains derived indexes under ~/.codealmanac/.
- Not a hosted service in the current contract.

# RESOURCES

```[Source code](https://github.com/AlmanacCode/codealmanac)```
```[Homepage](https://codealmanac.com)```
```[Documentation](https://github.com/AlmanacCode/codealmanac#readme)```

<!-- verified: 2026-07-10 -->

# SEE ALSO

claude(1)