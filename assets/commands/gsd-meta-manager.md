# TAGLINE

Terminal dashboard for multiple Get-Shit-Done workflow projects

# TLDR

**Launch the TUI** showing all registered GSD projects

```gsd-meta-manager```

**Register a project directory** in the global registry

```gsd-meta-manager add [path/to/project]```

**Register with a custom alias**

```gsd-meta-manager add [path/to/project] [alias]```

**Remove a project** from the registry by name or alias

```gsd-meta-manager remove [project]```

**List all registered projects** on stdout

```gsd-meta-manager list```

**Use a non-default config file**

```gsd-meta-manager --config [path/to/config.json]```

**Show the version**

```gsd-meta-manager --version```

# SYNOPSIS

**gsd-meta-manager** [_--config FILE_] [_subcommand_] [_args_]

**gsd-meta-manager add** _PATH_ [_ALIAS_]

**gsd-meta-manager remove** _PROJECT_

**gsd-meta-manager list**

# PARAMETERS

**--config** _FILE_
> Override the default config file location.

**--version**
> Print the version number and exit.

**--help**
> Display the help message.

# SUBCOMMANDS

**add** _PATH_ [_ALIAS_]
> Register the GSD project at _PATH_ in the global registry. _ALIAS_ sets a custom display name.

**remove** _PROJECT_
> Remove a project from the registry, identified by its alias or path.

**list**
> Print all registered projects.

**help** [_SUBCOMMAND_]
> Show help for a specific subcommand.

# KEY BINDINGS

**j**, **k**
> Move down or up in the project list.

**Enter**
> Open the detail view for the selected project.

**Tab**, **Shift+Tab**
> Switch between detail tabs.

**/**
> Activate search and filter mode.

**a**
> Add a new project interactively.

**n**
> Create a brand-new GSD project.

**d**
> Delete the selected project from the registry.

**?**
> Display the in-app help.

**q**
> Quit the application.

# DESCRIPTION

**gsd-meta-manager** is a Rust terminal UI that aggregates state from many GSD ("Get Shit Done") workflow projects into a single dashboard. It reads project state directly from disk, auto-detects running Claude Code sessions tied to GSD projects, and shows progress without any background daemon.

Each registered project can be inspected through a 10-tab detail view: **Phases**, **Roadmap** (rendered as an ASCII DAG), **Backlog**, **Git History**, **Pipeline**, **Queue**, **Sessions**, **Archive**, **Config**, and **Docs**. The intent is to make multi-project status the default view rather than something assembled by hand from many terminals.

# CONFIGURATION

**~/.config/gsd-meta-manager/config.json**
> Default registry file. Stores the list of registered project paths and aliases. Overridable with **--config**.

# CAVEATS

The tool only reflects state that already lives in each project on disk; it does not run pipelines, edit code, or push commits. Projects must already follow the GSD layout for tabs such as **Phases** and **Roadmap** to render anything meaningful.

# HISTORY

**gsd-meta-manager** was published by **bitcreed** in 2026 under the MIT license. It is distributed through **crates.io** and requires Rust 1.85 or newer to build from source.

# SEE ALSO

[cargo](/man/cargo)(1), [git](/man/git)(1), [tmux](/man/tmux)(1)
