# TAGLINE

word-by-word file comparison

# TLDR

**Compare two files word by word**

```dwdiff [file1.txt] [file2.txt]```

**Use color output**

```dwdiff -c [file1.txt] [file2.txt]```

**Show only the changes**, suppressing words common to both files

```dwdiff -3 [file1.txt] [file2.txt]```

**Show line numbers**

```dwdiff -L [file1.txt] [file2.txt]```

**Ignore case** differences

```dwdiff -i [file1.txt] [file2.txt]```

**Treat punctuation as delimiters** so words are split more finely

```dwdiff -P [file1.txt] [file2.txt]```

**Print statistics** about how much changed

```dwdiff -s [file1.txt] [file2.txt]```

**Page the diff** with less-style highlighting

```dwdiff -l [file1.txt] [file2.txt] | less -R```

# SYNOPSIS

**dwdiff** [_options_] _file1_ _file2_

# PARAMETERS

**-c**[_spec_], **--color**[**=**_spec_]
> Color the output. An optional _spec_ overrides the delete and insert colors.

**-l**, **--less-mode**
> Use overstriking (underline for deletions, bold for insertions), suitable for piping to less -R.

**-L**[_width_], **--line-numbers**[**=**_width_]
> Show line numbers at the start of each line.

**-s**, **--statistics**
> Print word counts and change percentages when done.

**-i**, **--ignore-case**
> Ignore differences in case when comparing words.

**-I**, **--ignore-formatting**
> Ignore formatting changes such as bold or underline markup.

**-d** _chars_, **--delimiters=**_chars_
> Characters to treat as word delimiters.

**-P**, **--punctuation**
> Use punctuation characters as delimiters.

**-W** _chars_, **--white-space=**_chars_
> Characters to treat as whitespace.

**-1**, **--no-deleted**
> Suppress words deleted from the first file.

**-2**, **--no-inserted**
> Suppress words inserted in the second file.

**-3**, **--no-common**
> Suppress words common to both files, leaving only the changes.

**-C** _num_, **--context=**_num_
> Show _num_ lines of context around each change.

**-A** _algo_, **--algorithm=**_algo_
> Comparison algorithm: best, normal or fast.

**-w** _string_, **--start-delete=**_string_
> String marking the start of deleted text (default `[-`).

**-x** _string_, **--stop-delete=**_string_
> String marking the end of deleted text (default `-]`).

**-y** _string_, **--start-insert=**_string_
> String marking the start of inserted text (default `{+`).

**-z** _string_, **--stop-insert=**_string_
> String marking the end of inserted text (default `+}`).

**--diff-input**
> Read unified diff output instead of two files.

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

# INSTALL

```apt: sudo apt install dwdiff```

```brew: brew install dwdiff```

```nix: nix profile install nixpkgs#dwdiff```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[wdiff](/man/wdiff)(1), [diff](/man/diff)(1), [colordiff](/man/colordiff)(1), [vimdiff](/man/vimdiff)(1)

# RESOURCES

```[Homepage](https://os.ghalkes.nl/dwdiff.html)```

<!-- verified: 2026-07-14 -->
