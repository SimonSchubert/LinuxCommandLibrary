# TAGLINE

command-line Bible reader providing access to the King James Version text

# TLDR

**List** the available books

```kjv -l```

Read an entire **book**

```kjv [Ruth]```

Read one **chapter**

```kjv [Genesis]:[2]```

Read a single **verse**

```kjv [John]:[3]:[16]```

Read **several individual verses**

```kjv [John]:[3]:[16],[17]```

Read a **range of verses**

```kjv [Proverbs]:[3]:[1-6]```

Read a **range of chapters**

```kjv [Psalms]:[120-134]```

Read a range that **crosses chapters**

```kjv [Matthew]:[1]:[7]-[2]:[6]```

**Search** the whole text for a pattern

```kjv /[lovingkindness]```

Search **within one book**

```kjv [Acts]/[Macedonia]```

Show each match **in the context of its chapter**

```kjv -C /[mustard seed]```

Show a fixed number of verses **before and after** each match

```kjv -B [2] -A [2] /[shibboleth]```

# SYNOPSIS

**kjv** [_options_] [_reference_]

# PARAMETERS

**-l**
> List all books

**-A** _num_
> Show _num_ verses of context after each matching verse

**-B** _num_
> Show _num_ verses of context before each matching verse

**-C**
> Show matching verses in the context of their whole chapter

**-e**
> Highlight chapter and verse numbers (default when output is a TTY)

**-p**
> Pipe output through **less** with grouping, indentation and line wrapping (default when output is a TTY)

**-h**
> Show help

_BOOK_
> Display an entire book

_BOOK_**:**_CHAPTER_
> Display a single chapter

_BOOK_**:**_CHAPTER_**:**_VERSE_[**,**_VERSE_]...
> Display one or more individual verses

_BOOK_**:**_CHAPTER_**-**_CHAPTER_
> Display a range of chapters

_BOOK_**:**_CHAPTER_**:**_VERSE_**-**_VERSE_
> Display a range of verses within a chapter

_BOOK_**:**_CHAPTER_**:**_VERSE_**-**_CHAPTER_**:**_VERSE_
> Display a range spanning several chapters

**/**_PATTERN_
> Show every verse matching a pattern

_BOOK_**/**_PATTERN_
> Search within a single book

_BOOK_**:**_CHAPTER_**/**_PATTERN_
> Search within a single chapter

# DESCRIPTION

**kjv** is a command-line Bible reader providing access to the King James Version text. It supports flexible reference formats for looking up books, chapters, verses, and ranges.

The tool also includes search functionality to find verses containing specific words or patterns across the entire text or within specific books.

# CAVEATS

Only includes King James Version text. Book names can use various abbreviations. Search is case-insensitive by default.

# HISTORY

kjv was created as a simple, terminal-based Bible reader following Unix philosophy. It provides quick access to Biblical text without requiring a graphical interface or web browser.

# INSTALL

```nix: nix profile install nixpkgs#kjv```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[less](/man/less)(1), [grep](/man/grep)(1)
