# TAGLINE

Lint and enforce commit message conventions

# TLDR

**Lint the most recent commit**

```gitlint```

**Lint a specific commit**

```gitlint --commit [commit-hash]```

**Lint a range of commits**

```gitlint --commits [HEAD~5..HEAD]```

**Lint a message from stdin**

```echo "Fix bug" | gitlint --stdin-msg```

**Generate a default config file**

```gitlint generate-config```

**Install as a commit-msg git hook**

```gitlint install-hook```

**Uninstall the commit-msg hook**

```gitlint uninstall-hook```

**Lint with a specific config file**

```gitlint --config [.gitlint] --commits [main..HEAD]```

# SYNOPSIS

**gitlint** [_options_] [_command_]

# PARAMETERS

**--commit** _SHA_
> Check a specific commit.

**--commits** _RANGE_
> Check a range of commits.

**--stdin-msg**
> Read commit message from stdin instead of git log.

**--msg-filename** _FILE_
> Read commit message from a file.

**-c** _RULE.OPTION=VALUE_
> Set a rule option on the command line.

**-C**, **--config** _FILE_
> Use a specific config file.

**--ignore** _RULES_
> Comma-separated list of rules to ignore.

**--contrib** _RULES_
> Comma-separated list of contrib rules to enable (e.g., contrib-title-conventional-commits).

**--target** _DIRECTORY_
> Path of the target git repository (default: current working directory).

**-e**, **--extra-path** _PATH_
> Path to a directory or Python module with extra user-defined rules.

**--ignore-stdin**
> Ignore any stdin data. Useful for running in CI server.

**--staged**
> Smart detection of metadata for staged commits.

**--fail-without-commits**
> Hard fail when the target commit range is empty.

**-v**, **--verbose**
> Verbosity, use multiple times for more output (e.g., -v, -vv, -vvv).

**-s**, **--silent**
> Silent mode (no output). Takes precedence over -v.

**-d**, **--debug**
> Enable debug output.

**--version**
> Show version and exit.

**--help**
> Display help information.

# COMMANDS

**lint**
> Lint a git repository (default command).

**generate-config**
> Create a default .gitlint configuration file.

**install-hook**
> Install gitlint as a git commit-msg hook.

**uninstall-hook**
> Remove the gitlint commit-msg hook.

**run-hook**
> Run the gitlint commit-msg hook.

# DESCRIPTION

**gitlint** enforces commit message conventions by checking that messages follow configured rules for format, length, and content. This ensures consistent, readable commit history across a project.

Default rules include title max length (72 chars), title not ending with a period, body max line length (80 chars), and a blank line between title and body. Contrib rules add support for Conventional Commits and other formats.

Custom Python rules can be written to enforce project-specific conventions. The tool integrates naturally into CI pipelines by linting commit ranges with **--commits**.

# CONFIGURATION

**.gitlint**
> Project-level configuration file defining commit message rules, ignored rules, and custom settings. Uses INI format with sections for each rule.

# CAVEATS

Requires Python 3. When used as a hook, only the latest commit message is checked. The **--commits** flag is needed for CI to check all commits in a branch. Custom rules require writing Python classes.

# SEE ALSO

[git-commit](/man/git-commit)(1), [pre-commit](/man/pre-commit)(1)
