# TAGLINE

Source code formatter for C, C++, C#, and Java

# TLDR

**Format** C++ code

```astyle [file.cpp]```

Format with **specific style**

```astyle --style=google [file.cpp]```

Format **in place** (overwrite)

```astyle --suffix=none [file.cpp]```

Format **recursively**

```astyle --recursive "*.cpp,*.h"```

Format with **custom options**

```astyle --indent=spaces=4 --brackets=attach [file.cpp]```

# SYNOPSIS

**astyle** [_--style=name_] [_--indent=type_] [_options_] _files_

# DESCRIPTION

**astyle** (Artistic Style) is a source code indenter and formatter for C, C++, C++/CLI, Objective-C, C#, and Java. It reformats code to follow consistent style guidelines, improving readability and maintainability.

The tool supports various predefined styles (Google, Mozilla, GNU, etc.) and extensive customization.

# PARAMETERS

**--style=**_name_
> Predefined style: allman, google, kr, linux, mozilla, gnu, java

**--indent=**_type_
> Indentation: spaces=n, tab, force-tab=n

**--brackets=**_type_
> Bracket style: attach, linux, break

**--indent-classes**
> Indent class blocks

**--indent-switches**
> Indent switch blocks

**--pad-oper**
> Pad operators with spaces

**--pad-header**
> Pad headers (if, for, while)

**--unpad-paren**
> Remove padding inside parentheses

**--suffix=**_suffix_
> Backup file suffix (none to overwrite)

**--recursive**
> Process directories recursively

**-n**, **--suffix=none**
> Don't create backup files

**--dry-run**
> Show changes without applying

# CONFIGURATION

**~/.astylerc**
> User-level default options file. Each line contains one option (e.g., --style=google).

**.astylerc**
> Project-level options file in the current directory, overrides user defaults.

# CAVEATS

Always backup code before formatting entire projects. May conflict with version control diffs. Team should agree on style before applying. Some styles may clash with existing code conventions.

# HISTORY

**Artistic Style** was created by Tal Davidson and Jim Pattee, with the first release in **1998**. It has become a standard code formatting tool for C-family languages.

# SEE ALSO

[clang-format](/man/clang-format)(1), [indent](/man/indent)(1), [uncrustify](/man/uncrustify)(1)
