# TAGLINE

Interactive PHP shell and runtime debugger

# TLDR

**Start PHP REPL**

```psysh```

**Start with specific config file**

```psysh -c [config.php]```

**Start with a specific working directory**

```psysh --cwd [path/to/project]```

**Run non-interactively from stdin**

```echo "echo 'hello';" | psysh -n```

**Start with compact output**

```psysh --compact```

**Start with autoload warming for better tab completion**

```psysh --warm-autoload```

# SYNOPSIS

**psysh** [_options_] [_files_...]

# PARAMETERS

**-c**, **--config** _FILE_
> Use alternate configuration file.

**--cwd** _PATH_
> Use alternate working directory.

**-V**, **--version**
> Display version number.

**-i**, **-a**, **--interactive**
> Force interactive mode.

**-n**, **--no-interactive**
> Force non-interactive mode (reads from stdin).

**-r**, **--raw-output**
> Print var_export-style return values.

**--compact**
> Run with compact output (minimal whitespace).

**-q**, **--quiet**
> Suppress most output except results and errors.

**-v**, **-vv**, **-vvv**, **--verbose**
> Increase message verbosity (up to three levels).

**--color**
> Force colored output.

**--no-color**
> Disable colored output.

**--warm-autoload**
> Pre-load classes from Composer autoloader for better tab completion.

**--yolo**
> Run with minimal input validation (debugging only).

**-u**, **--self-update**
> Install newer version (PHAR installation only).

**--update-manual**
> Download the latest PHP manual for inline documentation.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**psysh** is a modern interactive PHP shell (REPL) that provides a powerful developer console with syntax highlighting, tab completion, and inline documentation. It allows executing PHP code interactively, inspecting variables, and testing snippets without creating script files.

PsySH also functions as a runtime debugger when integrated into applications. By calling `eval(\Psy\sh())` in code, developers can drop into an interactive debugging session with access to the current scope's variables and context. It serves as the foundation for Laravel's **tinker** command.

# CONFIGURATION

**~/.config/psysh/config.php**
> PHP configuration file for customizing the REPL behavior, including default includes, readline settings, and output pager.

# CAVEATS

Requires PHP. Installed via Composer or as a standalone PHAR.

# HISTORY

PsySH was created by **Justin Hileman** (bobthecow) as a **modern PHP REPL** with advanced features including inline documentation and runtime debugging.

# SEE ALSO

[php](/man/php)(1), [composer](/man/composer)(1), [artisan](/man/artisan)(1)
