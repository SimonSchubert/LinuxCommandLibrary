# TAGLINE

word-by-word file comparison

# TLDR

**Compare two files word by word**

```dwdiff [file1.txt] [file2.txt]```

**Show only deletions and insertions**

```dwdiff -c [file1.txt] [file2.txt]```

**Use color output**

```dwdiff -c [file1.txt] [file2.txt]```

**Show line numbers**

```dwdiff -L [file1.txt] [file2.txt]```

**Ignore whitespace differences**

```dwdiff -w [file1.txt] [file2.txt]```

**Show statistics only**

```dwdiff -s [file1.txt] [file2.txt]```

# SYNOPSIS

**dwdiff** [_options_] _file1_ _file2_

# PARAMETERS

**-c**, **--color**
> Color output (default in terminals).

**-L**, **--line-numbers**
> Show line numbers.

**-s**, **--statistics**
> Print statistics at end.

**-w**, **--ignore-whitespace**
> Ignore whitespace differences.

**-i**, **--ignore-case**
> Case-insensitive comparison.

**-d** _delimiters_
> Characters that delimit words.

**-P**
> Use punctuation as delimiters.

**-1**
> Read old file from stdin.

**-2**
> Read new file from stdin.

**-3**
> Use pager for output.

**--wdiff-output**
> Produce wdiff-compatible output.

# DESCRIPTION

**dwdiff** compares files word-by-word rather than line-by-line, making it easier to spot small changes in prose or documentation. It highlights deleted words (from the first file) and inserted words (in the second file).

The tool is particularly useful for comparing text documents, translations, or any content where line-based diffs produce confusing output. It shows exactly which words changed between versions.

# OUTPUT FORMAT

```
[-removed-] {+added+}
```

Deleted text is shown in brackets with minus, inserted text in braces with plus.

# CAVEATS

Best suited for prose, not code. Large files may be slow to process. Word boundaries depend on delimiter settings. May need adjustment for non-English text or special characters.

# HISTORY

dwdiff was written by **G.P. Halkes** as an improved alternative to the older wdiff utility. It provides better handling of Unicode, color output, and more flexible word delimiting options.

# SEE ALSO

[wdiff](/man/wdiff)(1), [diff](/man/diff)(1), [colordiff](/man/colordiff)(1), [vimdiff](/man/vimdiff)(1)
