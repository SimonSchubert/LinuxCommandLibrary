# TAGLINE

Terminal-based SSH config manager with groups

# TLDR

**List all configured SSH hosts**

```sshc host list```

**List hosts in a group** matching a name pattern

```sshc host list -g [mygroup] -n [web]```

**Show host details in card format**

```sshc host show [myserver] --style card```

**Create a new host group** with a description

```sshc group create [mygroup] -d "[Production servers]"```

**Create a host** with address, user and extra SSH parameters

```sshc host create [myserver] -a [example.com] -u [admin] -p port [2222] -g [mygroup]```

**Preview a change** as a diff without writing the config

```sshc --diff host set [myserver] -p user [root]```

**Delete a host**

```sshc host delete [myserver]```

**Launch the interactive TUI browser**

```ssht```

# SYNOPSIS

**sshc** [**--config** _file_] [**--stdout**] [**--diff**] _resource_ _action_ [_options_]

**ssht** [**--config** _file_]

# SUBCOMMANDS

**host list**
> List SSH hosts; filter with **-g** _group_ and **-n** _name_, **-v** for verbose output.

**host show** _name_
> Display details for a single host. **--graph** shows the connection/tunnel path.

**host create** _name_
> Add a new host entry.

**host set** _name_ ...
> Modify parameters, info lines or group of existing hosts.

**host rename** _name_ _new-name_
> Rename a host.

**host delete** _name_ ...
> Remove host entries.

**host install** _name_
> Install an SSH key to hosts (experimental).

**group list** / **group show** / **group create** / **group set** / **group rename** / **group delete**
> Manage groups of hosts. **sshc groups** and **sshc hosts** are shortcuts for the list commands.

**config show** / **config set** / **config del**
> Manage SSHClick settings stored as metadata in the SSH config file.

# PARAMETERS

**--config** _PATH_
> Use a specific SSH config file (default `~/.ssh/config`). Can also be set with **SSHC_CONFIG**.

**--stdout**
> Write the modified SSH config to stdout instead of the original file (**SSHC_STDOUT=1**).

**--diff**
> Only show the difference a change would make, without applying it (**SSHC_DIFF=1**).

**--style** _STYLE_
> Host output style for **host show**: panels (default), card, simple, table, table2, json. Default can be set with **SSHC_HOST_STYLE**.

**-a**, **--address** _HOST_
> Hostname or IP for **host create**.

**-u**, **--user** _USER_
> SSH user for **host create**.

**-p**, **--parameter** _KEY_ _VALUE_
> Set an arbitrary SSH option on a host (e.g. port, identityfile, proxyjump). Repeatable.

**-g**, **--group** _NAME_
> Target group for **host create** / **host set**, or group filter for **host list**.

**-d**, **--desc** _TEXT_
> Group description.

**-i**, **--info** _TEXT_
> Extra info line for a host or group. Repeatable.

**--yes**
> Skip confirmation prompts on delete and bulk set.

**--version**
> Show the version and exit.

# DESCRIPTION

**sshclick** is a CLI and TUI tool for managing SSH configuration files. It parses your SSH config (`~/.ssh/config` by default) and provides commands to list, filter, modify, and view host entries. Through metadata comments (**#@group:**, **#@desc:**, **#@info:**, **#@host:**), it supports abstractions like host groups and descriptions that remain readable in the config file.

The CLI is **sshc**; the companion **ssht** command opens a Textual TUI for browsing groups and hosts and launching ssh/sftp sessions.

# CAVEATS

Commands that modify the config rewrite it in SSHClick's style; comments outside its metadata format may be discarded. Always keep a backup, or use **--diff** first. When the config uses a top-level **Include**, SSHClick switches to read-only mode and refuses to modify files.

# HISTORY

**sshclick** was created by **Karlo Tisaj** (karlot) and is written in **Python** using the Click, Rich and Textual libraries.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-copy-id](/man/ssh-copy-id)(1), [sshs](/man/sshs)(1), [ssh-list](/man/ssh-list)(1)

# RESOURCES

```[Source code](https://github.com/karlot/sshclick)```

<!-- verified: 2026-11-23 -->
