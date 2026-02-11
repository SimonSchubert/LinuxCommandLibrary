# TAGLINE

Symfony PHP variable dump receiver

# TLDR

**Start server**

```var-dump-server```

**Custom port**

```var-dump-server --host=[127.0.0.1:9912]```

**HTML format**

```var-dump-server --format=html```

# SYNOPSIS

**var-dump-server** [_--host address_] [_--format fmt_] [_options_]

# PARAMETERS

**--host** _ADDR_
> Bind address.

**--format** _FMT_
> Output format.

**--help**
> Show help.

# DESCRIPTION

**var-dump-server** starts a server that collects and displays variable dumps from PHP applications using the Symfony VarDumper component. Instead of dumping variables directly into the browser or console output, the application sends them to this centralized server for structured display.

This approach keeps debug output separate from application responses, making it particularly useful for debugging API endpoints, AJAX requests, and command-line scripts. The server formats dumps with syntax highlighting and collapsible structures, providing a cleaner debugging experience than inline var_dump output.

# CAVEATS

Symfony/PHP specific. VarDumper required. Development tool.

# HISTORY

**var-dump-server** is part of **Symfony VarDumper** component for receiving and displaying variable dumps from PHP applications.

# SEE ALSO

[php](/man/php)(1), [symfony](/man/symfony)(1)
