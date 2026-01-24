# TLDR

**Build database** for current directory

```cscope -b```

**Start interactive mode**

```cscope```

**Build database for C files** recursively

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
> Build database only (don't start interface).

**-R**
> Recurse directories for source files.

**-q**
> Build inverted index for faster searches.

**-i** _file_
> Read file list from file.

**-s** _dir_
> Search additional directories.

**-d**
> Don't update database.

**-L** _n_ _pattern_
> Line-oriented search (n=search type).

**-f** _file_
> Use specified database file.

**-p** _n_
> Display last n path components.

# SEARCH TYPES

**0**: Find symbol
**1**: Find definition
**2**: Find functions called by
**3**: Find functions calling
**4**: Find text string
**5**: Change text string (egrep)
**6**: Find file
**7**: Find files including

# CAVEATS

Database needs rebuilding after code changes. Works best with C-style languages. Large codebases may have slow initial indexing. Some modern features may confuse parser.

# HISTORY

**cscope** was developed at **Bell Labs** in the **1980s** by **Joe Steffen**. It was part of the Programmer's Workbench and became widely used for navigating Unix source code. Though older tools exist now, cscope remains popular for its speed and vim integration.

# SEE ALSO

[ctags](/man/ctags)(1), [vim](/man/vim)(1), [grep](/man/grep)(1), [global](/man/global)(1)
