# TAGLINE

Review and inspect past CLI command executions.

# TLDR

**List recent CLI command history**

```aws history list```

**Show detailed information** about a specific command

```aws history show [command-id]```

**Enable CLI history** recording

```aws configure set cli_history enabled```

# SYNOPSIS

**aws history** _command_ [_options_]

# DESCRIPTION

**aws history** provides access to the history of AWS CLI commands executed over time. It allows reviewing past commands, their arguments, API calls made, and responses received for debugging and auditing purposes.

History recording must be enabled by setting **cli_history = enabled** in the **~/.aws/config** file. Once enabled, the CLI records all command invocations for later inspection.

# COMMANDS

**list**
> Display a list of previously executed commands with their IDs, timestamps, arguments, and return codes

**show**
> Display detailed information about a specific command execution including API calls and responses

# PARAMETERS

**--debug**
> Enable debug logging

**--output**
> Output format (json, text, table)

**--query**
> JMESPath query to filter results

**--profile**
> Use a specific named profile

# CAVEATS

History is stored locally and is not synced across machines. Enabling history may expose sensitive data in the stored records. The history database can grow large over time and should be periodically cleaned. History only records CLI commands, not SDK or console actions.

# HISTORY

The **aws history** command was introduced in **AWS CLI version 2** to provide better debugging and audit capabilities. It replaced the need for manual logging of CLI operations and integrates with the CLI's structured output system.

# INSTALL

```dnf: sudo dnf install aws```

```pacman: sudo pacman -S aws-cli```

```apk: sudo apk add aws-cli```

```zypper: sudo zypper install aws-cli```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[aws](/man/aws)(1), [aws-configure](/man/aws-configure)(1)

# RESOURCES

```[Source code](https://github.com/aws/aws-cli)```

```[Homepage](https://aws.amazon.com/cli/)```

```[Documentation](https://docs.aws.amazon.com/cli/latest/reference/history/index.html)```

<!-- verified: 2026-06-18 -->
