# TLDR

**Start Espanso**

```espanso start```

**Stop Espanso**

```espanso stop```

**Restart service**

```espanso restart```

**Edit configuration**

```espanso edit```

**Search packages**

```espanso package search [keyword]```

**Install package**

```espanso package install [package_name]```

**Show status**

```espanso status```

# SYNOPSIS

**espanso** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: start, stop, restart, edit, package, etc.

**start**
> Start Espanso service.

**stop**
> Stop service.

**restart**
> Restart service.

**edit**
> Open config in editor.

**package search** _KEYWORD_
> Search packages.

**package install** _NAME_
> Install package.

**status**
> Show service status.

**--help**
> Display help information.

# DESCRIPTION

**Espanso** is a cross-platform text expander that replaces typed abbreviations with predefined text snippets. It runs in the background detecting trigger strings and expanding them system-wide.

Configuration files define matches between triggers and replacements. Replacements can include static text, dynamic content (dates, clipboard), or scripts. Packages add pre-configured expansions.

Espanso works across all applications, handling common typing patterns, boilerplate text, and frequently used phrases.

# CAVEATS

Requires background service. Needs accessibility permissions on macOS. Some applications may not support input injection. Trigger conflicts possible.

# HISTORY

Espanso was created by **Federico Terzi** as an open-source, cross-platform alternative to commercial text expanders. Written in Rust, it emphasizes privacy and performance.

# SEE ALSO

[xdotool](/man/xdotool)(1), [autokey](/man/autokey)(1)
