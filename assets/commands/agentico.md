# TAGLINE

TUI orchestrator for long-running AI coding agents

# TLDR

**Launch the dashboard** and manage features from the terminal

```agentico```

**Install or update** the binary in place

```agentico update```

**Start with specific AI providers** only

```agentico --providers claude,codex```

# SYNOPSIS

**agentico** [_options_]

# DESCRIPTION

**agentico** is the command-line interface for Agentic Orchestrator, a terminal-based workflow manager that turns a high-level feature request into a durable engineering pipeline. It coordinates AI coding agents through isolated Git worktrees, structured planning artifacts, implementation loops, code review, and pull-request publishing, so several complex features can run in parallel without mixing state.

On first launch, agentico walks through a welcome flow to select workspace directories, then opens an interactive dashboard. From there you create features, watch active work, answer approval prompts, and review checkpoints. The orchestrator routes phases to the best available model across installed provider CLIs such as **claude**, **codex**, and **opencode**, while **git** and **gh** handle repository and pull-request operations.

Pipeline depth is chosen per feature: Medium skips upfront research for small changes, Large adds knowledge-base, inquiry, research, and design phases, and Moonshot keeps the same depth with stricter review gates. Human checkpoints can pause on inquiry, research, design, roadmap, and publish decisions.

# PARAMETERS

**--providers** _LIST_
> Restrict orchestration to specific provider CLIs (comma-separated), such as `claude`, `codex`, or `opencode`.

**update**
> Update agentico using the same installation method originally used (Homebrew, release binary, or Go install).

# CAVEATS

agentico requires **git** and the **gh** CLI with GitHub authentication. At least one supported AI provider CLI must be installed, authenticated, and recent enough; missing or outdated providers are skipped at startup with a notice. The tool is designed around multi-repo Git worktrees and long-running agent sessions, so disk space, API quotas, and provider availability matter for large parallel workloads.

# HISTORY

Agentic Orchestrator was open-sourced by **DoorDash OSS** in 2026 as a Go-based TUI for supervising agentic coding workflows. The user-facing binary was named **agentico** to distinguish the local CLI from the broader orchestration system.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [gh](/man/gh)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/doordash-oss/agentic-orchestrator)```

<!-- verified: 2026-06-30 -->