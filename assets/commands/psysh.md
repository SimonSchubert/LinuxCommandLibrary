# TAGLINE

Interactive PHP shell and runtime debugger

# TLDR

**Start PHP REPL**

```psysh```

**Start with specific config**

```psysh -c [config.php]```

**Execute code and exit**

```psysh -e "[code]"```

**Include file**

```psysh --include [file.php]```

# SYNOPSIS

**psysh** [_options_]

# PARAMETERS

**-c** _FILE_
> Configuration file.

**-e** _CODE_
> Execute code.

**--include** _FILE_
> Include file.

**-v**
> Verbose output.

# DESCRIPTION

**psysh** is a modern interactive PHP shell (REPL) that provides a powerful developer console with syntax highlighting, tab completion, and inline documentation. It allows executing PHP code interactively, inspecting variables, and testing snippets without creating script files.

PsySH also functions as a runtime debugger when integrated into applications. By calling `eval(\Psy\sh())` in code, developers can drop into an interactive debugging session with access to the current scope's variables and context. It serves as the foundation for Laravel's **tinker** command.

# CONFIGURATION

**~/.config/psysh/config.php**
> PHP configuration file for customizing the REPL behavior, including default includes, readline settings, and output pager.

# CAVEATS

Requires PHP. Installed via Composer.

# HISTORY

PsySH was created as a **modern PHP REPL** with advanced features.

# SEE ALSO

[php](/man/php)(1), [composer](/man/composer)(1)

