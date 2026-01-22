# TLDR

**List** all books

```kjv -l```

Open a specific **book**

```kjv [Genesis]```

Open a specific **chapter**

```kjv [Genesis] [2]```

Open a specific **verse**

```kjv [John] [3]:[16]```

Open a **range of verses**

```kjv [Proverbs] [3]:[1-6]```

Display verses across **multiple chapters**

```kjv [Matthew] [1]:[7]-[2]:[6]```

**Search** for a pattern

```kjv /[Plagues]```

Search within a **specific book**

```kjv [1Jn]/[antichrist]```

# SYNOPSIS

**kjv** [_options_] [_reference_]

# PARAMETERS

**-l**
> List all books

_BOOK_
> Display entire book

_BOOK CHAPTER_
> Display specific chapter

_BOOK CHAPTER:VERSE_
> Display specific verse

_BOOK CHAPTER:START-END_
> Display verse range

**/**_PATTERN_
> Search all text for pattern

_BOOK_**/**_PATTERN_
> Search within specific book

# DESCRIPTION

**kjv** is a command-line Bible reader providing access to the King James Version text. It supports flexible reference formats for looking up books, chapters, verses, and ranges.

The tool also includes search functionality to find verses containing specific words or patterns across the entire text or within specific books.

# CAVEATS

Only includes King James Version text. Book names can use various abbreviations. Search is case-insensitive by default.

# HISTORY

kjv was created as a simple, terminal-based Bible reader following Unix philosophy. It provides quick access to Biblical text without requiring a graphical interface or web browser.

# SEE ALSO

[less](/man/less)(1), [grep](/man/grep)(1)
