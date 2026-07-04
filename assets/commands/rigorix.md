# TAGLINE

Deterministic coding-agent runtime that compiles intent into executable DAGs

# TLDR

**Initialize a project**

```rigorix init```

**Generate and review a plan** before executing

```rigorix plan "Add a new API endpoint"```

**Run a task**

```rigorix run "Refactor the user module"```

**Show the dashboard / interactive TUI**

```rigorix```

# SYNOPSIS

**rigorix** [_options_] <command> [_args_...]

Common commands: init, plan, run, update

# DESCRIPTION

Rigorix turns natural-language development tasks into deterministic, auditable Directed Acyclic Graphs (DAGs). Planning is separated from execution: an LLM generates a plan according to templates; Rigorix validates the plan, then executes it under policy, permission, and budget controls.

Key benefits over open-ended agent loops:

- Repeatable execution graphs
- Explicit quality gates and policy enforcement
- Full audit trail
- Safe to run in CI/CD contexts

It supports Rust, TypeScript, Python and Go codebases (TypeScript is the most mature).

# INSTALL

cargo install --git https://github.com/arman-jalili/rigorix-oss rigorix-cli

Or build from source and place the rigorix binary on your PATH.

Set your LLM API key, e.g.:

export RIGORIX__LLM__API_KEY="sk-ant-..."

# PARAMETERS

Most configuration lives in the project after `rigorix init`. Command line flags control planning vs. execution, provider selection, and non-interactive mode.

# CAVEATS

Rigorix is intentionally less flexible than free-form chat agents. It excels at repeatable, governed workflows rather than exploratory conversation.

# SEE ALSO

[arman-jalili/rigorix-oss](https://github.com/arman-jalili/rigorix-oss)

```[Source code](https://github.com/arman-jalili/rigorix-oss)
<!-- verified: 2026-07-04 -->
```