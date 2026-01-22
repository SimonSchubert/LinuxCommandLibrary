# TLDR

**Show tldr page for a command**

```tldr [command]```

**Update the local cache**

```tldr --update```

**List all available pages**

```tldr --list```

**Show page for specific platform**

```tldr --platform=[linux|osx|windows] [command]```

**Show a random page**

```tldr --random```

**Render a local markdown file**

```tldr --render [file.md]```

# SYNOPSIS

**tldr** [_options_] [_command_]

# PARAMETERS

**-u**, **--update**
> Update the local page cache

**-l**, **--list**
> List all available commands

**-p**, **--platform** _platform_
> Show page for specific platform (linux, osx, windows, sunos, android)

**-r**, **--random**
> Show a random page

**--render** _file_
> Render a local markdown file as tldr page

**-L**, **--language** _lang_
> Show page in specified language

**-v**, **--version**
> Display version

**-h**, **--help**
> Display help

# DESCRIPTION

**tldr** provides simplified, community-maintained man pages focused on practical examples. Instead of comprehensive documentation, tldr pages show common use cases with copy-paste ready commands.

The name stands for "Too Long; Didn't Read," reflecting its philosophy of brevity over completeness. Each page contains a brief description followed by example commands with explanations.

Pages are maintained by an open-source community and cover thousands of commands across multiple platforms. The cache is stored locally and can be updated with **--update**.

Multiple client implementations exist (Node.js, Python, Rust, Go, etc.) all using the same page repository. Install whichever client suits your environment.

# CAVEATS

Tldr pages are community-maintained and may not cover every option or edge case. For comprehensive documentation, consult **man** pages or official documentation.

Some commands have platform-specific pages. Use **--platform** to see pages for other operating systems.

The local cache must be updated periodically with **--update** to get new and updated pages.

# HISTORY

The tldr-pages project was started in **2013** to address the problem of overly complex man pages. It grew into a community project with thousands of contributors maintaining practical command examples across all major platforms.

# SEE ALSO

[man](/man/man)(1), [info](/man/info)(1), [cheat](/man/cheat)(1), [help](/man/help)(1)
