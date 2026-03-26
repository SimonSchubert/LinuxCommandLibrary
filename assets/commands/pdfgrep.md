# TAGLINE

searches for text patterns in PDF files, similar to grep but for PDFs

# TLDR

**Search for pattern in PDF**

```pdfgrep "[pattern]" [file.pdf]```

**Case-insensitive search showing page numbers**

```pdfgrep -in "[pattern]" [file.pdf]```

**Search recursively in directory**

```pdfgrep -r "[pattern]" [/path/to/pdfs/]```

**Count matches per file**

```pdfgrep -c "[pattern]" [*.pdf]```

**Print only filenames with matches**

```pdfgrep -l "[pattern]" [*.pdf]```

**Search with multiple patterns**

```pdfgrep -e "[pattern1]" -e "[pattern2]" [file.pdf]```

**Limit search to a page range**

```pdfgrep --page-range=[1-10] "[pattern]" [file.pdf]```

**Print only the matched text**

```pdfgrep -o "[pattern]" [file.pdf]```

# SYNOPSIS

**pdfgrep** [_OPTIONS_] _PATTERN_ _FILE_...

**pdfgrep** [_OPTIONS_] {**-e** _PATTERN_|**-f** _FILE_}... _FILE_...

**pdfgrep** [_OPTIONS_] **-r**|**-R** _PATTERN_ [_FILE_|_DIR_...]

# PARAMETERS

**-e** _PATTERN_, **--regexp**=_PATTERN_
> Specify a search pattern. Can be used multiple times to match any of several patterns.

**-f** _FILE_, **--file**=_FILE_
> Read patterns from a file, one per line.

**-i**, **--ignore-case**
> Case-insensitive matching.

**-F**, **--fixed-strings**
> Treat the pattern as a fixed string (no regular expression interpretation).

**-P**, **--perl-regexp**
> Use Perl-compatible regular expressions (PCRE2).

**-n**, **--page-number**[=_TYPE_]
> Prefix each match with its page number. _TYPE_ is `index` (default) or `label`.

**-c**, **--count**
> Print match count per file instead of matched lines.

**-p**, **--page-count**
> Print match count per page (implies **-n**).

**-l**, **--files-with-matches**
> Print only filenames that contain a match.

**-L**, **--files-without-match**
> Print only filenames that contain no match.

**-o**, **--only-matching**
> Print only the matched portion of each line.

**-H**, **--with-filename**
> Print the filename with each match (default when searching multiple files).

**-h**, **--no-filename**
> Suppress filename prefix in output.

**-Z**, **--null**
> Use a null byte instead of a colon to separate the filename from the rest of the output line. Useful for filenames containing colons or spaces.

**--match-prefix-separator** _SEP_
> Use _SEP_ as the separator between the match prefix (filename, page number) and the matched line, instead of the default colon.

**-r**, **--recursive**
> Search all PDF files under each directory recursively. Symlinks are followed only when specified on the command line.

**-R**, **--dereference-recursive**
> Like **-r**, but follow all symlinks.

**--include**=_GLOB_
> Only search files whose names match _GLOB_ (default: `*.pdf`).

**--exclude**=_GLOB_
> Skip files whose names match _GLOB_.

**-A** _NUM_, **--after-context**=_NUM_
> Print _NUM_ lines of context after each match.

**-B** _NUM_, **--before-context**=_NUM_
> Print _NUM_ lines of context before each match.

**-C** _NUM_, **--context**=_NUM_
> Print _NUM_ lines of context before and after each match.

**--page-range**=_RANGE_
> Limit the search to the specified page range (e.g., `1-10,15`).

**-m** _NUM_, **--max-count**=_NUM_
> Stop after _NUM_ matches per file.

**--password**=_PASSWORD_
> Use _PASSWORD_ to decrypt a password-protected PDF.

**--color** _WHEN_
> Colorize output: `auto` (default), `always`, or `never`.

**--cache**
> Cache rendered page text to speed up repeated searches on the same files.

**--unac**
> Remove accents and ligatures from both the search pattern and the document text. Useful for matching words like "ae" against the ligature "æ".

**--warn-empty**
> Warn when a PDF contains no searchable text (e.g., scanned images without OCR).

**-q**, **--quiet**
> Suppress all output. Exit status indicates whether a match was found.

**-V**, **--version**
> Print version information.

# DESCRIPTION

**pdfgrep** searches for text patterns in PDF files using the Poppler library for text extraction. It provides a familiar grep-like interface for PDF documents.

Text is extracted from each page and matched against the given regular expression. By default pdfgrep uses PCRE2 for pattern matching. Fixed-string matching is available via **-F**.

Page number output (**-n**) helps locate matches within a document. Restricting the search to a page range (**--page-range**) speeds up searches on large files. Context lines (**-C**) show surrounding text to aid understanding of a match.

Recursive search (**-r**) processes entire directory trees. Combined with **--include** and **--exclude**, this enables targeted searches across document collections. Multiple patterns can be specified with repeated **-e** options or read from a file with **-f**.

The **--unac** option is useful when PDFs use typographic ligatures or accented characters that differ from the search term. The **--cache** option stores extracted text to accelerate repeated searches.

# EXIT STATUS

**0**
> One or more matches were found.

**1**
> No matches were found.

**2**
> An error occurred.

# CAVEATS

Text extraction quality depends on the PDF's internal structure. Scanned PDFs without embedded text require OCR preprocessing before pdfgrep can search them (use **--warn-empty** to detect such files). Complex multi-column layouts may not extract in reading order. Encrypted PDFs require the correct **--password**.

# HISTORY

**pdfgrep** was written by **Hans-Peter Deifel** starting around **2010**. It uses the Poppler library for PDF parsing and provides a grep-compatible interface for searching PDF text content.

# SEE ALSO

[grep](/man/grep)(1), [pdftotext](/man/pdftotext)(1), [ripgrep](/man/ripgrep)(1), [pdfinfo](/man/pdfinfo)(1)
