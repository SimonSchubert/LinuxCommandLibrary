# TAGLINE

Terminal task and note board

# TLDR

**Display all tasks and notes**

```tb```

**Create a new task**

```tb -t [Buy groceries]```

**Create a task on a specific board**

```tb -t @[work] [Finish report]```

**Create a note**

```tb -n [Remember to call John]```

**Check/uncheck tasks** as complete

```tb -c [1] [2]```

**Set task priority** (1=normal, 2=medium, 3=high)

```tb -p [1] [3]```

**Delete items**

```tb -d [1] [2]```

**Search for items**

```tb -f [keyword]```

**Display timeline view**

```tb -i```

# SYNOPSIS

**tb** [_options_] [_arguments_]

# PARAMETERS

**-t**, **--task** _description_
> Create a new task; use @board to assign to boards

**-n**, **--note** _body_
> Create a new note

**-c**, **--check** _ids_
> Toggle completion status of tasks

**-b**, **--begin** _ids_
> Start or pause tasks

**-s**, **--star** _ids_
> Star or unstar items

**-p**, **--priority** _id_ _level_
> Set task priority (1=normal, 2=medium, 3=high)

**-m**, **--move** _id_ _@board_
> Move item to a different board

**-d**, **--delete** _ids_
> Delete items (moves to archive)

**-e**, **--edit** _id_ _description_
> Edit item description

**-f**, **--find** _keywords_
> Search items by keywords

**-l**, **--list** _attributes_
> List items filtered by attributes

**-a**, **--archive**
> Display archived items

**-r**, **--restore** _ids_
> Restore items from archive

**--clear**
> Delete all checked (completed) tasks

**-y**, **--copy** _ids_
> Copy item descriptions to clipboard

**-i**, **--timeline**
> Display items grouped by creation date

**-h**, **--help**
> Show help information

**-v**, **--version**
> Show version number

# DESCRIPTION

**tb** (Taskbook) is a command-line task and note manager organized around boards. It provides a minimal interface for creating, organizing, and tracking tasks and notes directly from the terminal.

Items are organized into boards using the **@boardname** syntax. Tasks without a board assignment go to the default "My Board". Multiple boards can be assigned to a single item. The interface displays completion statistics showing pending, done, and note counts.

Tasks can have priorities (shown with different colors), be starred for emphasis, and marked as in-progress with the begin command. Deleted items are archived and can be restored. The timeline view groups items by creation date instead of boards.

Data is stored in JSON format at **~/.taskbook/storage**. Configuration options can be set in **~/.taskbook.json**.

# CAVEATS

Taskbook requires Node.js and npm for installation. The archive grows over time with deleted items; periodic manual cleanup may be needed. Board names are case-sensitive.

# HISTORY

**Taskbook** was created by **Klaus Sinani** (klaudiosinani) and released on **GitHub** in **2018**. Written in JavaScript for Node.js, it was designed to bring task management directly into the terminal workflow, emphasizing simplicity and a minimal learning curve.

# SEE ALSO

[task](/man/task)(1), [todo.txt-cli](/man/todo.txt-cli)(1), [todoist](/man/todoist)(1)
