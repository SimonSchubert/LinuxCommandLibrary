# TAGLINE

AI agent loop orchestrator for autonomous task completion

# TLDR

**Run Ralph with a PRD file**

```ralph-tui run --prd [./prd.json]```

**Create a PRD with AI assistance**

```ralph-tui create-prd --chat```

**Initial setup**

```ralph-tui setup```

# SYNOPSIS

**ralph-tui** _command_ [_options_]

# DESCRIPTION

**ralph-tui** is a terminal UI for orchestrating AI coding agents to work through task lists autonomously. It connects your AI coding assistant (Claude Code, OpenCode, Gemini CLI, and others) to your task tracker and runs them in a loop — selecting the highest-priority task, building a prompt, executing the agent, detecting completion, and repeating until all tasks are done.

# CAVEATS

Requires an AI coding agent (such as Claude Code) to be installed and configured.

# HISTORY

**ralph-tui** was created by **subsy** and is written in **TypeScript**.

# SEE ALSO

[claude](/man/claude)(1)
