# TLDR

**Add a new task**

```task add "[description]"```

**Add a task with project and due date**

```task add "[description]" project:[project_name] due:[tomorrow]```

**List all pending tasks**

```task list```

**Mark a task as done**

```task [task_id] done```

**Modify an existing task**

```task [task_id] modify priority:[H] due:[friday]```

**Delete a task**

```task [task_id] delete```

**Show detailed info** about a task

```task [task_id] info```

**Start working on a task**

```task [task_id] start```

# SYNOPSIS

**task** [_global_options_] [_filter_] _command_ [_arguments_]

# PARAMETERS

**add**
> Add a new task to the task list.

**done**
> Mark a task as completed.

**delete**
> Delete a task from the list.

**modify**
> Modify attributes of an existing task.

**start**
> Mark a task as started (active).

**stop**
> Mark a task as no longer active.

**annotate**
> Add an annotation to a task.

**list**
> Display pending tasks using the default report.

**info**
> Show all data and metadata for a task.

**undo**
> Revert the most recent change.

**log**
> Add a task that is already completed.

**duplicate**
> Create a copy of a task.

**projects**
> List all projects with task counts.

**tags**
> List all tags in use.

**--rc** _file_
> Use an alternative configuration file.

**--force**
> Suppress confirmation prompts.

**--verbose**
> Show more detailed output.

**--quiet**
> Suppress non-essential output.

**--debug**
> Enable debugging output.

**--version**
> Display version information.

# DESCRIPTION

**Taskwarrior** is a command-line task management application that maintains a list of tasks with support for projects, tags, priorities, due dates, and custom attributes. It provides powerful filtering and reporting capabilities.

Tasks can have attributes like **project**, **priority** (H/M/L), **due** dates, **tags**, **wait** dates, and user-defined attributes. Filters allow selecting tasks based on any combination of attributes. Reports provide customizable views of task data.

Configuration is stored in **~/.taskrc** and task data in **~/.task/**. These locations can be overridden via environment variables **TASKRC** and **TASKDATA**. All commands can be abbreviated as long as the prefix is unique.

# CAVEATS

Task IDs are temporary and may change after sync or undo operations. For scripts and automation, use UUIDs instead. The **undo** command only reverts the most recent operation. Synchronization with a Taskserver requires additional setup.

# HISTORY

Taskwarrior was created by **Paul Beckingham** and first released in **2006**. It has grown from a simple todo list to a sophisticated task management system with sync capabilities, hooks, and extensive customization. The project is maintained by the **Gothenburg Bit Factory** and has inspired numerous frontends and integrations. Version 3.0, released in **2024**, introduced significant architectural changes and improved performance.

# SEE ALSO

[taskrc](/man/taskrc)(5), [todo.txt-cli](/man/todo.txt-cli)(1), [remind](/man/remind)(1), [calcurse](/man/calcurse)(1)
