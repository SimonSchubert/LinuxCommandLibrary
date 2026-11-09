# TAGLINE

Simple SSH manager for organizing server connections

# TLDR

**List all SSH configurations**

```ssm list```

**Filter the list**

```ssm list -f [pattern]```

**Add a new SSH configuration**

```ssm add```

**Preview adding a configuration** without writing it

```ssm add --dry-run```

**Edit an existing configuration**

```ssm edit [myserver]```

**Print an SSH configuration**

```ssm print [myserver]```

# SYNOPSIS

**ssm** [_global options_] _command_ [_command options_] [_arguments_]

# PARAMETERS

**list**, **ls**
> List available SSH configurations. **-f**, **--filter** limits the output.

**add**
> Add a new SSH configuration interactively. **-d**, **--dry-run** does not write the change.

**edit**, **e** [_name_]
> Open an SSH configuration in the default text editor. Without a name, shows a selection menu.

**print** [_name_]
> Print an SSH configuration to stdout.

**help**, **h**
> Show a list of commands or help for a command.

**--help**, **-h**
> Show help.

**--version**, **-v**
> Print the version.

# DESCRIPTION

**ssm** (Simple SSH Manager) is a CLI tool for managing SSH configurations across multiple servers. It organizes SSH configs into modular files within a **~/.ssh/config.d** directory, referenced from **~/.ssh/config** with **Include** lines, allowing you to list, add, edit, and print SSH configurations.

# CAVEATS

Requires both **~/.ssh/config** and **~/.ssh/config.d** to exist. The project describes itself as a work in progress, and password authentication support is listed as a planned feature.

# HISTORY

**ssm** was created by **Elliot** (elliot40404) and is written in **Go**.

# SEE ALSO

[ssh](/man/ssh)(1), [sshs](/man/sshs)(1), [sshclick](/man/sshclick)(1)

# RESOURCES

```[Source code](https://github.com/elliot40404/ssm)```

<!-- verified: 2026-11-09 -->
