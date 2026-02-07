# TAGLINE

simple text formatter that rewraps paragraphs

# TLDR

**Reformat a text file** to 75 columns (default)

```fmt [path/to/file.txt]```

**Reformat to a specific width**

```fmt -w [60] [path/to/file.txt]```

**Reformat text from stdin**

```echo "[long text here]" | fmt```

**Preserve paragraph indentation**

```fmt -p [prefix] [file.txt]```

**Split long lines only** (don't join short lines)

```fmt -s [file.txt]```

**Set goal and maximum width**

```fmt -g [70] -w [80] [file.txt]```

**Uniform spacing** (one space between words, two after sentences)

```fmt -u [file.txt]```

**Format multiple files**

```fmt [file1.txt] [file2.txt]```

# SYNOPSIS

**fmt** [_-csuw_] [_-g goal_] [_-p prefix_] [_-w width_] [_file ..._]

# PARAMETERS

**-w**, **--width** _n_
> Maximum line width (default: 75).

**-g**, **--goal** _n_
> Goal width (optimal line length, default: 93% of width).

**-s**, **--split-only**
> Split long lines but do not join short ones.

**-u**, **--uniform-spacing**
> One space between words, two after sentences.

**-c**, **--crown-margin**
> Preserve first two lines' indentation.

**-p**, **--prefix** _string_
> Only reformat lines starting with prefix.

**-t**, **--tagged-paragraph**
> Preserve indentation of first line.

**--help**
> Display help and exit.

**--version**
> Display version and exit.

# DESCRIPTION

**fmt** is a simple text formatter that rewraps paragraphs to fit within a specified line width. It reads text from files or stdin, reformats it, and outputs to stdout.

The tool intelligently handles paragraphs: consecutive non-blank lines are treated as a single paragraph and reflowed together. Blank lines, indentation changes, and other formatting cues mark paragraph boundaries.

The formatting algorithm aims for the goal width while staying under the maximum width. This produces more natural-looking text than simply breaking at exactly the maximum width. Words are never hyphenated or broken.

Common uses include formatting text for emails, documentation, code comments, and improving readability of text files. The **-s** option is useful when you only want to break overly long lines without affecting properly formatted text.

Unlike more complex formatters, fmt handles plain text only. It doesn't understand markup, code blocks, or special formatting. It's designed for simple prose paragraphs.

# CAVEATS

Does not preserve exact spacing or formatting. May break intentionally formatted text like code or tables. Does not handle markup languages. Very long words that exceed width are not broken. Different implementations may behave slightly differently.

# HISTORY

**fmt** originated in BSD Unix around **1979**, based on an earlier tool. It was designed as a simple text formatter for preparing documents and emails. The command has been included in GNU coreutils and remains part of standard Unix-like systems.

# SEE ALSO

[fold](/man/fold)(1), [pr](/man/pr)(1), [par](/man/par)(1), [nroff](/man/nroff)(1), [groff](/man/groff)(1)
