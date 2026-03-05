# TAGLINE

Simple SSH manager for organizing server connections

# TLDR

**List all SSH configurations**

```ssm list```

**Add a new SSH configuration**

```ssm add```

**Edit an existing configuration**

```ssm edit [myserver]```

# SYNOPSIS

**ssm** [_global options_] _command_ [_command options_]

# DESCRIPTION

**ssm** (Simple SSH Manager) is a CLI tool for managing SSH configurations across multiple servers. It organizes SSH configs into modular files within a config.d directory structure, allowing you to list, add, edit, and print SSH configurations.

# HISTORY

**ssm** was created by **Elliot** (elliot40404) and is written in **Go**.

# SEE ALSO

[ssh](/man/ssh)(1), [sshs](/man/sshs)(1), [sshclick](/man/sshclick)(1)
