# TLDR

**Search for pattern in PDF**

```pdfgrep "[pattern]" [file.pdf]```

**Search recursively in directory**

```pdfgrep -r "[pattern]" [/path/to/pdfs/]```

**Case-insensitive search**

```pdfgrep -i "[pattern]" [file.pdf]```

**Show page numbers**

```pdfgrep -n "[pattern]" [file.pdf]```

**Show context lines**

```pdfgrep -C [2] "[pattern]" [file.pdf]```

**Count matches**

```pdfgrep -c "[pattern]" [file.pdf]```

**Search with extended regex**

```pdfgrep -E "[pattern1|pattern2]" [file.pdf]```

**Print only filenames with matches**

```pdfgrep -l "[pattern]" [*.pdf]```

# SYNOPSIS

**pdfgrep** [_-inrcl_] [_-C num_] [_-p pages_] [_pattern_] _files_

# PARAMETERS

**-i**, **--ignore-case**
> Case-insensitive matching.

**-n**, **--page-number**
> Print page numbers.

**-c**, **--count**
> Print match count only.

**-l**, **--files-with-matches**
> Print only matching filenames.

**-L**, **--files-without-match**
> Print only non-matching filenames.

**-r**, **--recursive**
> Search directories recursively.

**-R**
> Follow symlinks when recursive.

**-E**, **--extended-regexp**
> Use extended regular expressions.

**-P**, **--perl-regexp**
> Use Perl-compatible regular expressions.

**-C** _NUM_, **--context** _NUM_
> Print NUM lines of context.

**-A** _NUM_, **--after-context** _NUM_
> Print NUM lines after match.

**-B** _NUM_, **--before-context** _NUM_
> Print NUM lines before match.

**-p** _RANGE_, **--page-range** _RANGE_
> Limit search to page range (e.g., 1-10,15).

**-m** _NUM_, **--max-count** _NUM_
> Stop after NUM matches.

**--include** _GLOB_
> Only search files matching pattern.

**--password** _PASS_
> PDF password.

**--color** _WHEN_
> Colorize output: auto, always, never.

**-q**, **--quiet**
> Suppress output.

# DESCRIPTION

**pdfgrep** searches for text patterns in PDF files, similar to grep but for PDFs. It extracts text from PDF content and applies regular expression matching.

The tool handles the complexity of PDF text extraction transparently. Text from multiple columns, pages, and formatting is processed into searchable strings. Results show the matching text with optional context.

Page number display (-n) helps locate matches in documents. Page range limiting (-p) speeds searches in large documents. Context lines (-C) show surrounding text for understanding matches.

Recursive search (-r) processes directory trees of PDFs. Combined with --include patterns, this enables searching document collections. Output modes include filenames only, counts, and quiet mode for scripting.

Regular expression support ranges from basic to Perl-compatible (PCRE). This enables complex pattern matching beyond simple string search.

# CAVEATS

Text extraction quality depends on PDF structure. Scanned PDFs require OCR preprocessing. Complex layouts may not extract cleanly. Large PDFs can be slow to process. Encrypted PDFs need password. Some PDF features may not be supported.

# HISTORY

**pdfgrep** was developed by **Hans-Peter Deifel** starting around **2010**. It fills the gap between general-purpose grep and PDF-specific tools, providing a familiar interface for PDF text search. The project uses the Poppler library for PDF handling.

# SEE ALSO

[grep](/man/grep)(1), [pdftotext](/man/pdftotext)(1), [ripgrep](/man/ripgrep)(1), [pdfinfo](/man/pdfinfo)(1)
