# TAGLINE

Command-line Todoist client in Rust

# TLDR

**Log in** with OAuth

```tod auth login```

**Save** an API token

```tod auth token [token]```

**Import** projects

```tod project import```

**Quick-add** a task with natural language

```tod task quick-add --content [Buy more milk today]```

**Create** a task in a **project**

```tod task create --content "[Write more rust]" --project [code]```

Get the **next** task

```tod task next```

**Complete** the last fetched task

```tod task complete```

**List** tasks in a project

```tod list view --project [work]```

List tasks by **filter**

```tod list view --filter [overdue,today,tom]```

# SYNOPSIS

**tod** [_OPTIONS_] _COMMAND_ [_ARGS_]

# COMMANDS

**auth login**
> Log into Todoist using OAuth

**auth token**
> Save a Todoist API token to the config

**project import**
> Import your Todoist projects

**task quick-add**
> Create a new task using natural language

**task create**
> Create a new task without natural language processing

**task next**
> Get the next task by priority

**task complete**
> Complete the last task fetched with next

**list view**
> View tasks by project or filter

**list process**
> Work through tasks one at a time interactively

**list schedule**, **list prioritize**
> Schedule or prioritize groups of tasks

**shell completions**
> Generate shell completions

# PARAMETERS

**-c**, **--config** _PATH_
> Absolute path to the configuration file

**-j**, **--json**
> Output results as JSON and suppress interactive prompts

**-t**, **--timeout** _SECONDS_
> Time to wait for API responses (default: 30)

**-v**, **--verbose**
> Display additional debug information

**-h**, **--help**
> Display help, also available per command

# DESCRIPTION

**tod** is an unofficial Todoist command-line client written in Rust. It takes simple input and places it in your inbox or another project, using Todoist's natural language processing to assign due dates, labels and priorities.

Beyond quick capture, it supports importing projects, viewing tasks by project or Todoist filter, and working through tasks one at a time with interactive flows for scheduling, prioritizing and completing them.

# CAVEATS

Requires a Todoist account and either OAuth login or an API token. Projects must be imported before they can be referenced. Older versions used **tod --quickadd** and **tod task list**, which are not part of the current interface.

# HISTORY

**tod** was created by Alan Vardy as a command-line Todoist client in Rust and is now developed under the tod-org GitHub organization.

# SEE ALSO

[taskwarrior](/man/taskwarrior)(1)

# RESOURCES

```[Source code](https://github.com/tod-org/tod)```

<!-- verified: 2026-11-09 -->
