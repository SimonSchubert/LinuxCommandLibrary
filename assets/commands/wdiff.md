# TAGLINE

Word-by-word file comparison tool

# TLDR

**Compare files word-by-word**

```wdiff [file1.txt] [file2.txt]```

**Statistics only**

```wdiff -s [file1.txt] [file2.txt]```

**Ignore case**

```wdiff -i [file1.txt] [file2.txt]```

**Use color output**

```wdiff -w $'\033[1;31m' -x $'\033[0m' -y $'\033[1;32m' -z $'\033[0m' [file1] [file2]```

**Show only differences (suppress common words)**

```wdiff -3 [file1.txt] [file2.txt]```

**Avoid wrapping markers across lines**

```wdiff -n [file1.txt] [file2.txt]```

# SYNOPSIS

**wdiff** [_-s_] [_-i_] [_options_] _file1_ _file2_

# PARAMETERS

**-s**, **--statistics**
> Show word count statistics and percentage changes.

**-i**, **--ignore-case**
> Ignore case differences.

**-3**, **--no-common**
> Suppress common (unchanged) words; show only differences.

**-1**, **--no-deleted**
> Suppress deleted words from output.

**-2**, **--no-inserted**
> Suppress inserted words from output.

**-n**, **--avoid-wraps**
> Prevent markup from spanning line boundaries.

**-a**, **--auto-pager**
> Automatically pipe output through a pager.

**-t**, **--terminal**
> Use termcap strings for terminal emphasis.

**-l**, **--less-mode**
> Overstrike formatting optimized for the less pager.

**-p**, **--printer**
> Overstrike emphasis for printer output.

**-d**, **--diff-input**
> Accept unified diff format as input.

**-w** _STRING_
> Start delete marker (default `[-`).

**-x** _STRING_
> End delete marker (default `-]`).

**-y** _STRING_
> Start insert marker (default `{+`).

**-z** _STRING_
> End insert marker (default `+}`).

# DESCRIPTION

**wdiff** compares two files on a word-by-word basis rather than line-by-line like traditional diff. This makes it particularly useful for comparing prose and text documents where changes often involve individual words within paragraphs rather than entire lines.

By default, deleted words are enclosed in `[-...-]` markers and inserted words in `{+...+}` markers, making changes easy to spot in the output. These markers can be customized with ANSI escape codes to produce colored output highlighting additions and deletions visually.

The statistics mode shows counts of deleted, inserted, and common words along with percentage changes. Case-insensitive comparison is available for situations where capitalization differences should be ignored.

# CAVEATS

Large files may be slow. Complex formatting lost. Line structure ignored.

# HISTORY

**wdiff** was created as part of GNU and is maintained as a standalone GNU package. It provides word-level differences suited for prose and natural language text where line-based diff output is hard to read.

# SEE ALSO

[diff](/man/diff)(1), [colordiff](/man/colordiff)(1), [dwdiff](/man/dwdiff)(1)
