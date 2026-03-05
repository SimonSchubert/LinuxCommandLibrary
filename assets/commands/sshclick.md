# TAGLINE

Terminal-based SSH config manager with groups

# TLDR

**List all configured SSH hosts**

```sshc host list```

**Show host details in card format**

```sshc host show [myserver] --style card```

**Create a new host group**

```sshc group create [mygroup] --desc "[Production servers]"```

# SYNOPSIS

**sshc** [_options_] _command_ [_args_]

# DESCRIPTION

**sshclick** is a CLI and TUI tool for managing SSH configuration files. It parses your SSH config and provides commands to list, filter, modify, and view host entries. Through additional metadata comments, it supports abstractions like host groups and descriptions for better organization.

# HISTORY

**sshclick** was created by **Karlo Tisaj** (karlot) and is written in **Python**.

# SEE ALSO

[sshs](/man/sshs)(1), [ssh](/man/ssh)(1), [ssh-list](/man/ssh-list)(1)
