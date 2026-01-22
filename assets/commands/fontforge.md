# TLDR

**Open FontForge GUI**

```fontforge```

**Open font file**

```fontforge [font.ttf]```

**Convert font format**

```fontforge -c 'Open($1); Generate($2)' [input.otf] [output.ttf]```

**Run script**

```fontforge -script [convert.pe]```

**Export to web** fonts

```fontforge -c 'Open($1); Generate($2)' [font.ttf] [font.woff2]```

# SYNOPSIS

**fontforge** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Font files to open.

**-c** _SCRIPT_
> Execute script command.

**-script** _FILE_
> Run script file.

**-lang** _LANGUAGE_
> Scripting language (ff, py).

**-nosplash**
> Start without splash screen.

**--help**
> Display help information.

# DESCRIPTION

**fontforge** is a comprehensive font editor supporting OpenType, TrueType, and many other formats. It provides tools for creating, editing, and converting fonts.

The application offers glyph editing, metrics adjustment, kerning, hinting, and OpenType feature development. Scripting support enables batch operations and automated font processing.

FontForge handles professional font development workflows from initial design to production-ready output.

# CAVEATS

Steep learning curve for font design. GUI can be complex. Some formats have limited support.

# HISTORY

FontForge (originally PfaEdit) was created by **George Williams** starting in 2000. It's the most capable open source font editor, used by type designers and font developers worldwide.

# SEE ALSO

[fc-query](/man/fc-query)(1), [ttx](/man/ttx)(1), [otfinfo](/man/otfinfo)(1)
