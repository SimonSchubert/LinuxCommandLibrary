# TAGLINE

Terminal-based SSH config manager with groups

# TLDR

**List all configured SSH hosts**

```sshc host list```

**Show host details in card format**

```sshc host show [myserver] --style card```

**Create a new host group**

```sshc group create [mygroup] --desc "[Production servers]"```

**Create a host** with parameters

```sshc host create [myserver] --param hostname=[example.com] --param user=[admin] --param port=[22]```

**Delete a host**

```sshc host delete [myserver]```

**Launch the interactive TUI**

```sshc tui```

# SYNOPSIS

**sshc** _resource_ _action_ [_options_]

# SUBCOMMANDS

**host list**
> List all SSH hosts in the config.

**host show** _name_
> Display details for a single host.

**host create** _name_
> Add a new host entry.

**host set** _name_
> Modify an existing host's parameters.

**host delete** _name_
> Remove a host entry.

**group list** / **group show** / **group create** / **group delete**
> Manage groups of hosts.

**tui**
> Launch the interactive terminal UI.

# PARAMETERS

**-f**, **--file** _PATH_
> Use a specific SSH config file (default `~/.ssh/config`).

**--style** _STYLE_
> Output style: table, card, json.

**--param** _key=value_
> Set an SSH option on a host (e.g. hostname, user, port, identityfile).

**--desc** _TEXT_
> Description metadata for hosts or groups.

# DESCRIPTION

**sshclick** is a CLI and TUI tool for managing SSH configuration files. It parses your SSH config (`~/.ssh/config` by default) and provides commands to list, filter, modify, and view host entries. Through additional metadata comments, it supports abstractions like host groups and descriptions for better organization.

The TUI mode provides interactive navigation, search, and editing of hosts and groups.

# CAVEATS

Edits to the SSH config file may reorder or rewrite comments. Always keep a backup before bulk operations.

# HISTORY

**sshclick** was created by **Karlo Tisaj** (karlot) and is written in **Python**.

# SEE ALSO

[ssh](/man/ssh)(1), [sshs](/man/sshs)(1), [ssh-list](/man/ssh-list)(1)
