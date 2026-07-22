# TAGLINE

Command-line task and todo manager

# TLDR

**Add a new task**

```task add [Buy groceries]```

**List all pending tasks**

```task list```

**Mark task as done**

```task [1] done```

**Add task with project and priority**

```task add [description] project:[Home] priority:[H]```

**Add task with due date**

```task add [description] due:[tomorrow]```

**Add task with tags**

```task add [description] +[work] +[urgent]```

**Start working on a task**

```task [1] start```

**View detailed task information**

```task [1] info```

**Delete a task**

```task [1] delete```

**Synchronize tasks**

```task sync```

# SYNOPSIS

**task** [_filter_] [_command_] [_modifications_]

# COMMANDS

**add** _description_: Create a new task.

**done**: Mark task(s) as completed.

**delete**: Delete task(s).

**start**: Mark task(s) as started.

**stop**: Mark task(s) as stopped.

**modify**: Change task attributes.

**annotate**: Add note to task.

**edit**: Edit task in text editor.

**list**: Show pending tasks.

**all**: Show all tasks including completed.

**next**: Show most urgent tasks.

**active**: Show started tasks.

**blocked**: Show blocked tasks.

**projects**: List all projects.

**tags**: List all tags.

**reports**: List available reports.

**sync**: Synchronize with a sync server or cloud backend.

**undo**: Revert the last change.

**purge**: Permanently remove deleted tasks.

**shell**: Interactive task shell.

**config**: Modify configuration.

# MODIFICATIONS

**project:**_name_: Assign to project.

**priority:**_H|M|L_: Set priority (High/Medium/Low).

**due:**_date_: Set due date.

**scheduled:**_date_: Set scheduled date.

**until:**_date_: Set expiration date.

**recur:**_freq_: Set recurrence (daily, weekly, monthly).

**wait:**_date_: Hide until date.

**+**_tag_: Add tag.

**-**_tag_: Remove tag.

**depends:**_id_: Set task dependency.

# DESCRIPTION

**Taskwarrior** (the `task` command) is a command-line TODO list manager. It provides flexible task management with support for projects, priorities, tags, due dates, recurrence, and dependencies.

Tasks can be filtered using any attribute, dates, or logical expressions. The tool generates various reports including lists, calendars, and burndown charts.

Configuration is stored in `~/.taskrc` with extensive customization options. The tool supports hooks for automation and sync for sharing tasks across devices.

Starting with **Taskwarrior 3.0** (2024), data is stored in a local SQLite database (`taskchampion.sqlite3`) and synchronization uses a new backend supporting AWS S3, Google Cloud Storage, or `taskchampion-sync-server`. The legacy `taskd` server is no longer supported.

# CAVEATS

First run creates `~/.taskrc`. Task IDs change as tasks are completed; use UUID for permanent references in scripts. Some reports require sufficient terminal width for proper display. Taskwarrior 3.x storage is not compatible with file-sync tools like Syncthing or rsync since data lives in a SQLite database.

# HISTORY

**Taskwarrior** was created by Paul Beckingham and Federico Hernandez. The first version was released in 2006, with the project growing into a task management ecosystem. Taskwarrior 3.0 (2024) replaced the file-based store and `taskd` server with the TaskChampion library and a new sync protocol.

# INSTALL

```zypper: sudo zypper install taskwarrior```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[timew](/man/timew)(1), [todo.txt-cli](/man/todo.txt-cli)(1)
