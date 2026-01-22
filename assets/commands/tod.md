# TLDR

**Import** projects

```tod project import```

**Quickadd** a task

```tod --quickadd [Buy more milk today]```

**Create** a new task

```tod task create```

Create task in **project**

```tod task create --content "[Write more rust]" --project [code]```

Get **next** task

```tod task next```

Get **scheduled** tasks

```tod task list --scheduled --project [work]```

**List** all tasks

```tod task list --project [work]```

# SYNOPSIS

**tod** [_OPTIONS_] _COMMAND_ [_ARGS_]

# COMMANDS

**project import**
> Import your Todoist projects

**task create**
> Create a new task

**task next**
> Get the next task for a project

**task list**
> List tasks

# PARAMETERS

**--quickadd** _TEXT_
> Quickly create a task with natural language

**--content** _TEXT_
> Task content/description

**--project** _NAME_
> Specify project name

**--scheduled**
> Show only scheduled tasks

# DESCRIPTION

**tod** is a tiny Todoist client written in Rust. It provides a command-line interface for managing tasks in your Todoist account. The tool leverages natural language processing to parse due dates, tags, and other task attributes from simple text input.

Tasks can be quickly added to your inbox or assigned to specific projects. The tool supports viewing scheduled tasks and managing your work queue.

# CAVEATS

Requires Todoist account and API token configuration. Projects must be imported before they can be referenced. Natural language parsing depends on Todoist's processing capabilities.

# HISTORY

**tod** was created as a lightweight, fast command-line Todoist client using Rust, focusing on quick task entry and simple project management workflows.

# SEE ALSO

[taskwarrior](/man/taskwarrior)(1)
