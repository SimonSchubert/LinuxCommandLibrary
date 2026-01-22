# TLDR

**View man page**

```man [command]```

**View specific section**

```man [5] [passwd]```

**Search descriptions**

```man -k [keyword]```

**Show all sections**

```man -a [command]```

**Show file path**

```man -w [command]```

**Format as text**

```man -t [command] | ps2pdf - [output.pdf]```

# SYNOPSIS

**man** [_options_] [_section_] _page_

# PARAMETERS

_PAGE_
> Manual page name.

_SECTION_
> Section number (1-9).

**-k** _KEYWORD_
> Search by keyword.

**-a**
> Show all matching pages.

**-w**
> Show file location.

**-f** _NAME_
> Display short description.

**--help**
> Display help information.

# DESCRIPTION

**man** displays manual pages. Man pages document commands, system calls, and configuration.

The tool is the primary Unix documentation system. Sections organize different types of documentation.

man shows manual pages.

# CAVEATS

Sections vary by system. Some commands lack man pages. Use info for GNU docs.

# HISTORY

man dates back to the first **Unix** system at Bell Labs, remaining the standard documentation format.

# SEE ALSO

[info](/man/info)(1), [apropos](/man/apropos)(1), [whatis](/man/whatis)(1)

