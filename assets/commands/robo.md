# TLDR

**List tasks**

```robo```

**Run task**

```robo [task-name]```

**Run with arguments**

```robo [task-name] [--arg=value]```

**Use specific file**

```robo -f [RoboFile.php] [task]```

**Verbose output**

```robo [task] -v```

**Dry run**

```robo [task] --simulate```

# SYNOPSIS

**robo** [_-f file_] [_options_] [_task_] [_args_]

# PARAMETERS

**-f** _FILE_
> RoboFile path.

**-v**
> Verbose output.

**--simulate**
> Dry run mode.

**--load-from** _DIR_
> Load from directory.

**-n**
> No interaction.

**--help**
> Show help.

# DESCRIPTION

**robo** runs PHP tasks. It's a task runner framework.

Defines tasks in PHP. Object-oriented approach.

Built-in file operations. Copy, move, watch.

SSH and exec support. Remote commands.

Parallel execution. Run tasks concurrently.

# CAVEATS

Requires PHP. RoboFile.php needed. Composer recommended.

# HISTORY

**Robo** was created as a modern PHP task runner, providing a clean API for automation tasks in PHP projects.

# SEE ALSO

[composer](/man/composer)(1), [make](/man/make)(1), [rake](/man/rake)(1)
