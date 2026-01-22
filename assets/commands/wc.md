# TLDR

**Count lines, words, and bytes**

```wc [file]```

**Count only lines**

```wc -l [file]```

**Count only words**

```wc -w [file]```

**Count only characters**

```wc -m [file]```

**Count only bytes**

```wc -c [file]```

**Count lines in command output**

```[command] | wc -l```

**Count files in a directory**

```ls | wc -l```

**Count longest line length**

```wc -L [file]```

# SYNOPSIS

**wc** [_options_] [_file_...]

# PARAMETERS

**-l**, **--lines**
> Print line count

**-w**, **--words**
> Print word count

**-c**, **--bytes**
> Print byte count

**-m**, **--chars**
> Print character count

**-L**, **--max-line-length**
> Print length of longest line

**--files0-from**=_F_
> Read filenames from file F (NUL-terminated)

**--total**=_when_
> When to print total (auto, always, only, never)

# DESCRIPTION

**wc** (word count) prints newline, word, and byte counts for each file. With multiple files, it also prints totals. With no files or stdin, it reads standard input.

A word is defined as a sequence of non-whitespace characters delimited by whitespace or line boundaries. This matches most intuitive definitions of "word."

The default output shows lines, words, and bytes in that order. Options select which counts to display; if none are specified, all three are shown.

**wc -l** is extremely common for counting items in pipelines, such as counting files, matches, or log entries.

# CAVEATS

Byte count (**-c**) and character count (**-m**) differ for multi-byte encodings like UTF-8. Use **-m** for actual character counts.

For counting files, **ls | wc -l** fails if filenames contain newlines. Use **find -print0 | wc -l --files0-from=-** for robustness.

Empty files have 0 lines, 0 words, and 0 bytes. A file with just "hello" (no newline) has 0 lines but 1 word.

# SEE ALSO

[sort](/man/sort)(1), [uniq](/man/uniq)(1), [cut](/man/cut)(1), [awk](/man/awk)(1)
