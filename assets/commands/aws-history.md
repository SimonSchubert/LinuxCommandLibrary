# TLDR

**List recent CLI command history**

```aws history list```

**Show detailed information** about a specific command

```aws history show [command-id]```

**Enable CLI history** in AWS config file

```echo "[default]\ncli_history = enabled" >> ~/.aws/config```

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

# SEE ALSO

[aws](/man/aws)(1), [aws-configure](/man/aws-configure)(1)
