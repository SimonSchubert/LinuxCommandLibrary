# TLDR

**Start project**

```tmuxinator start [project]```

**Create new project**

```tmuxinator new [project]```

**Edit project**

```tmuxinator edit [project]```

**List projects**

```tmuxinator list```

**Delete project**

```tmuxinator delete [project]```

**Copy project**

```tmuxinator copy [existing] [new_name]```

**Stop project**

```tmuxinator stop [project]```

**Show project config**

```tmuxinator debug [project]```

# SYNOPSIS

**tmuxinator** [_start_] [_new_] [_edit_] [_list_] [_delete_] [_options_] [_project_]

# PARAMETERS

**start** _PROJECT_
> Start project session.

**new** _PROJECT_
> Create new project.

**edit** _PROJECT_
> Edit project config.

**open** _PROJECT_
> Alias for edit.

**list**, **ls**
> List projects.

**delete** _PROJECT_
> Delete project.

**stop** _PROJECT_
> Kill project session.

**copy** _SRC_ _DEST_
> Copy project.

**debug** _PROJECT_
> Show generated script.

**doctor**
> Check configuration.

**version**
> Show version.

**-p** _FILE_
> Use project file.

**-n** _NAME_
> Override session name.

# DESCRIPTION

**tmuxinator** automates tmux session setup. Project files define windows, panes, and commands that start with a single command.

YAML configuration describes session layout. Windows have names, working directories, and pane configurations.

Commands run automatically when panes open. Development servers, editors, and monitoring tools start in their designated locations.

Layout presets handle common pane arrangements. Custom layouts specify exact pane dimensions.

Project files live in ~/.config/tmuxinator. They're portable across machines and can be version controlled.

Starting a project creates or attaches to the tmux session. Subsequent starts attach without recreating.

# CAVEATS

Requires Ruby. Complex layouts need careful configuration. Some tmux versions may have compatibility issues.

# HISTORY

**Tmuxinator** was created around **2010** to automate tmux session creation. It became the standard tool for managing development environment configurations.

# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1), [byobu](/man/byobu)(1)
