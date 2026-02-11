# TAGLINE

PHP task runner framework

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

**robo** is a PHP task runner framework that uses an object-oriented approach to define automation tasks. Tasks are written as PHP class methods in a **RoboFile.php**, providing full access to PHP's language features and ecosystem for build automation, deployment, and development workflows.

The framework includes built-in tasks for common operations like file manipulation (copy, move, watch), running shell commands, SSH remote execution, and parallel task execution. The **--simulate** flag enables dry-run mode to preview what commands would be executed without actually running them, which is useful for testing complex task sequences.

Robo integrates naturally with Composer-based PHP projects and serves a similar role to Make, Rake, or Gulp for the PHP ecosystem.

# CAVEATS

Requires PHP. RoboFile.php needed. Composer recommended.

# HISTORY

**Robo** was created as a modern PHP task runner, providing a clean API for automation tasks in PHP projects.

# SEE ALSO

[composer](/man/composer)(1), [make](/man/make)(1), [rake](/man/rake)(1)
