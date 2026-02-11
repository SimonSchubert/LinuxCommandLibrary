# TAGLINE

Define and manage Pixi project tasks

# TLDR

**Add task to project**

```pixi task add [name] [command]```

**List tasks**

```pixi task list```

**Remove task**

```pixi task remove [name]```

**Add task with alias**

```pixi task alias [name] [existing_task]```

# SYNOPSIS

**pixi** **task** _command_ [_options_]

# PARAMETERS

**add** _name_ _command_
> Add new task.

**list**
> List all tasks.

**remove** _name_
> Remove task.

**alias** _name_ _target_
> Create task alias.

**--depends-on** _tasks_
> Task dependencies.

# DESCRIPTION

**pixi task** manages project tasks. Tasks are defined commands that can be run within the project environment. Similar to npm scripts or Makefile targets. Supports dependencies between tasks.

# SEE ALSO

[pixi](/man/pixi)(1), [pixi-run](/man/pixi-run)(1)

