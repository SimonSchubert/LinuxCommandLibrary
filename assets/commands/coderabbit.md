# TAGLINE

AI-powered code review tool for the terminal

# TLDR

**Review** all changes interactively

```coderabbit```

**Review** all changes with plain text output

```coderabbit --plain```

**Review** only uncommitted changes

```coderabbit --type uncommitted```

**Compare** current branch against a base branch

```coderabbit --base [develop]```

**Provide** custom review instructions

```coderabbit --config [./claude.md]```

**Authenticate** with CodeRabbit

```cr auth login```

**Update** CLI to latest version

```coderabbit update```

# SYNOPSIS

**coderabbit** [_review_] [_options_]
**cr** [_review_] [_options_]

# PARAMETERS

**--plain**
> Output detailed feedback in plain text format.

**--prompt-only**
> Show minimal output optimized for AI agents.

**-t**, **--type** _type_
> Review type: all, committed, uncommitted (default: all).

**-c**, **--config** _files..._
> Additional instruction files for the AI.

**--base** _branch_
> Base branch for comparison.

**--base-commit** _commit_
> Base commit hash on the current branch for comparison.

**--cwd** _path_
> Set working directory (must contain a Git repository).

**--api-key** _key_
> API key for usage-based access.

**--self-hosted**
> Enable self-hosted authentication mode.

**--no-color**
> Disable colored terminal output.

# SUBCOMMANDS

**review**
> Run AI-driven code review (default when no subcommand given).

**auth login**
> Authenticate with CodeRabbit account.

**auth logout**
> Log out from CodeRabbit.

**auth status**
> Show current authentication status.

**auth org**
> Switch between organizations.

**update**
> Check for and install the latest CLI version.

# DESCRIPTION

**CodeRabbit CLI** brings AI-powered code reviews directly into the terminal. It analyzes code changes -- whether uncommitted, staged, committed, or across branches -- and provides line-by-line review comments identifying potential issues such as security vulnerabilities, performance problems, code smells, logical errors, and missed unit tests. **cr** is a short alias for **coderabbit**.

The tool operates in three output modes: interactive mode (default) with a browsable TUI, plain text mode (**--plain**) with detailed feedback for scripting, and prompt-only mode (**--prompt-only**) for integration with AI coding agents.

# CAVEATS

Requires an initialized Git repository in the working directory. Authentication is recommended for enhanced analysis but the tool can be used without it (with rate limits). Free tier has rate limits; Pro plan provides higher limits. Available on macOS and Linux natively; Windows is supported via WSL. The CLI tool is closed-source.

# HISTORY

**CodeRabbit** was founded in **2023** by **Harjot Gill**. The company initially launched as a GitHub/GitLab bot for reviewing pull requests. The **CLI tool was launched on September 16, 2025**, extending the platform to support pre-commit reviews directly in the terminal. CodeRabbit is headquartered in El Dorado Hills, California.

# SEE ALSO

[gh](/man/gh)(1), [git](/man/git)(1), [semgrep](/man/semgrep)(1)
