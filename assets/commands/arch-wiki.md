# TAGLINE

Search the Arch Linux Wiki from the terminal

# TLDR

**Search the Arch Wiki**

```arch-wiki [search_term]```

**Search and open result in browser**

```arch-wiki -o [search_term]```

**Search in a specific language**

```arch-wiki -l [de] [search_term]```

**Show raw search results without formatting**

```arch-wiki -r [search_term]```

**Limit number of results**

```arch-wiki -n [10] [search_term]```

# SYNOPSIS

**arch-wiki** [_options_] _search_term_

# PARAMETERS

**-o**, **--open**
> Open the first result in the default web browser.

**-l**, **--lang** _code_
> Search in a specific language (e.g., de, es, fr, ja).

**-n**, **--number** _count_
> Limit the number of results returned.

**-r**, **--raw**
> Output raw results without color formatting.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**arch-wiki** is a command-line tool for searching the Arch Linux Wiki directly from the terminal. It queries the wiki's API and presents results with titles and URLs, enabling quick access to documentation without leaving the command line.

The Arch Wiki is renowned for its comprehensive, well-maintained documentation covering not just Arch Linux but general Linux topics. This tool provides rapid access to that knowledge base during system administration and troubleshooting tasks.

Results are displayed with syntax highlighting by default, making them easy to scan. The **-o** flag opens the top result immediately, useful when you know exactly what you're looking for.

# CAVEATS

Requires an active internet connection. The tool queries the wiki API, so results depend on the wiki's search indexing. Some articles may have different names than expected; try alternative search terms if initial results are unhelpful.

# HISTORY

The **arch-wiki** tool was created to provide quick terminal access to the Arch Wiki, one of the most comprehensive Linux documentation resources. The Arch Wiki itself was established alongside Arch Linux in **2002** and has grown to include thousands of articles covering software configuration, troubleshooting, and best practices applicable across many Linux distributions.

# SEE ALSO

[man](/man/man)(1), [tldr](/man/tldr)(1), [howdoi](/man/howdoi)(1)
