# TAGLINE

source code browsing tool for C, C++, and Java

# TLDR

**Build database** for current directory

```cscope -b```

**Start interactive mode**

```cscope```

**Build database recursively** from subdirectories

```cscope -bR```

**Build with specific files**

```cscope -b -i [cscope.files]```

**Search for symbol**

```cscope -L0 [symbol]```

**Find function definition**

```cscope -L1 [function]```

**Find functions calling function**

```cscope -L3 [function]```

# SYNOPSIS

**cscope** [_options_] [_files_]

# DESCRIPTION

**cscope** is a source code browsing tool for C, C++, and Java. It builds a database of symbols, function definitions, and references, enabling fast navigation through large codebases.

The interactive interface allows searching for symbol definitions, function callers and callees, text strings, and file inclusions. It integrates with editors like vim and emacs for seamless code navigation.

# PARAMETERS

**-b**
> Build the cross-reference only; do not enter the interactive interface.

**-R**
> Recurse into subdirectories when searching for source files.

**-q**
> Build an inverted index for quicker symbol searches (produces cscope.in.out and cscope.po.out).

**-C**
> Ignore letter case when searching.

**-u**
> Unconditionally build the cross-reference (assume all files have changed).

**-d**
> Do not update the cross-reference.

**-i** _file_
> Read source file names from _file_ instead of the default cscope.files.

**-s** _dir_
> Look in _dir_ for additional source files.

**-I** _incdir_
> Look in _incdir_ before the standard system include directory for `#include` files.

**-f** _reffile_
> Use _reffile_ as the cross-reference file name instead of the default cscope.out.

**-L** _n_ _pattern_
> Line-oriented search. _n_ is the search type number (0–9). Prints matches and exits.

**-p** _n_
> Display the last _n_ path components in list entries (default 1).

**-T**
> Use only the first eight characters to match against C symbols.

**-V**
> Print the cscope version number.

# CONFIGURATION

**cscope.files**
> List of source files to include in the database (one path per line).

**cscope.out**
> Default cross-reference database file produced by cscope.

# SEARCH TYPES

**0**: Find this C symbol
**1**: Find this global definition
**2**: Find functions called by this function
**3**: Find functions calling this function
**4**: Find this text string
**5**: Change this text string
**6**: Find this egrep pattern
**7**: Find this file
**8**: Find files #including this file
**9**: Find assignments to this symbol

# CAVEATS

Database needs rebuilding after code changes (unless `-q` incremental mode is used). Works best with C-style languages. Large codebases may have slow initial indexing. Some modern C/C++ features may confuse the parser.

# HISTORY

**cscope** was developed at **Bell Labs** in the late 1970s by **Joe Steffen** and was distributed as part of AT&T's Programmer's Workbench. It was released as open source by SCO in 2000 and is now maintained on SourceForge. It remains popular for its speed and tight vim integration.

# SEE ALSO

[ctags](/man/ctags)(1), [vim](/man/vim)(1), [grep](/man/grep)(1)
