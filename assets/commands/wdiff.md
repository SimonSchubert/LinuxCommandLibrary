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

**Show common words too**

```wdiff -c [file1.txt] [file2.txt]```

**Avoid wrapping**

```wdiff -n [file1.txt] [file2.txt]```

# SYNOPSIS

**wdiff** [_-s_] [_-i_] [_options_] _file1_ _file2_

# PARAMETERS

**-s**, **--statistics**
> Show statistics.

**-i**, **--ignore-case**
> Case insensitive.

**-c**, **--common**
> Show common words.

**-n**, **--avoid-wrapping**
> No wrap markers.

**-w** _STRING_
> Start delete marker.

**-x** _STRING_
> End delete marker.

**-y** _STRING_
> Start insert marker.

**-z** _STRING_
> End insert marker.

# DESCRIPTION

**wdiff** compares two files on a word-by-word basis rather than line-by-line like traditional diff. This makes it particularly useful for comparing prose and text documents where changes often involve individual words within paragraphs rather than entire lines.

By default, deleted words are enclosed in `[-...-]` markers and inserted words in `{+...+}` markers, making changes easy to spot in the output. These markers can be customized with ANSI escape codes to produce colored output highlighting additions and deletions visually.

The statistics mode shows counts of deleted, inserted, and common words along with percentage changes. Case-insensitive comparison is available for situations where capitalization differences should be ignored.

# CAVEATS

Large files may be slow. Complex formatting lost. Line structure ignored.

# HISTORY

**wdiff** was written for comparing text documents. It provides human-readable differences for prose content.

# SEE ALSO

[diff](/man/diff)(1), [colordiff](/man/colordiff)(1), [dwdiff](/man/dwdiff)(1)
