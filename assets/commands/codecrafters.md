# TLDR

**Log in** to CodeCrafters

```codecrafters login```

**Run tests** for the current challenge stage

```codecrafters test```

**Submit your solution** and progress to the next stage

```codecrafters submit```

**Show current challenge status**

```codecrafters status```

**View the current challenge instructions**

```codecrafters instructions```

**Clone a challenge** repository to start

```codecrafters clone [challenge-slug]```

# SYNOPSIS

**codecrafters** _command_ [_options_]

# PARAMETERS

**login**
> Authenticate with your CodeCrafters account.

**test**
> Run tests for the current challenge stage locally.

**submit**
> Submit your solution to CodeCrafters for evaluation.

**status**
> Display the current progress and stage information.

**instructions**
> Show the instructions for the current challenge stage.

**clone** _SLUG_
> Clone a challenge repository to begin working on it.

**logout**
> Log out from your CodeCrafters account.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**codecrafters** is the command-line interface for the CodeCrafters platform, which provides challenges for building real-world software from scratch. Projects include building your own Redis, Git, Docker, SQLite, and other complex systems.

The CLI handles authentication, test execution, and solution submission. It integrates with the CodeCrafters platform to track progress through multi-stage challenges, where each stage introduces new requirements and complexity.

Challenges are completed by implementing code that passes increasingly sophisticated tests. The local test command provides quick feedback during development, while submit validates against the full test suite on CodeCrafters' servers.

# CAVEATS

Requires an active CodeCrafters account. Some challenges require a paid subscription. The CLI needs network connectivity to submit solutions and verify progress. Challenge repositories must be cloned from CodeCrafters to include necessary test configurations.

# HISTORY

CodeCrafters was founded to provide hands-on learning experiences for experienced developers. The platform launched with challenges recreating popular software tools, allowing developers to deeply understand their internals. The CLI was developed to provide a seamless local development experience integrated with the platform.

# SEE ALSO

[git](/man/git)(1), [exercism](/man/exercism)(1)
