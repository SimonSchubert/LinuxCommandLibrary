# TAGLINE

Side-by-side file comparison and merge

# TLDR

**Compare files side by side**

```sdiff [file1] [file2]```

**Interactive merge**

```sdiff -o [output] [file1] [file2]```

**Set output width**

```sdiff -w [120] [file1] [file2]```

**Suppress common lines**

```sdiff -s [file1] [file2]```

**Ignore case differences**

```sdiff -i [file1] [file2]```

**Ignore whitespace changes**

```sdiff -b [file1] [file2]```

**Ignore all whitespace**

```sdiff -W [file1] [file2]```

**Tab-expand output**

```sdiff -t [file1] [file2]```

# SYNOPSIS

**sdiff** [_-o output_] [_-w width_] [_-sbBiW_] [_options_] _file1_ _file2_

# PARAMETERS

**-o** _FILE_, **--output** _FILE_
> Interactive merge to output file.

**-w** _NUM_, **--width** _NUM_
> Output width in columns.

**-s**, **--suppress-common-lines**
> Don't show identical lines.

**-l**, **--left-column**
> Show only left column for common lines.

**-b**, **--ignore-space-change**
> Ignore changes in whitespace amount.

**-B**, **--ignore-blank-lines**
> Ignore blank line changes.

**-i**, **--ignore-case**
> Case-insensitive comparison.

**-W**, **--ignore-all-space**
> Ignore all whitespace.

**-t**, **--expand-tabs**
> Expand tabs to spaces.

**--strip-trailing-cr**
> Strip trailing carriage returns.

**-a**, **--text**
> Treat all files as text.

**-d**, **--minimal**
> Find minimal set of changes.

**-H**, **--speed-large-files**
> Heuristics for large files.

# DESCRIPTION

**sdiff** compares two files side by side. It displays corresponding lines in parallel columns, marking differences with symbols.

Output symbols indicate relationship: blank (identical), | (different), < (only in left), > (only in right). This visual format makes differences immediately apparent.

Interactive merge mode (-o) creates a combined file from the two inputs. At each difference, you choose: left (l), right (r), edit left (el), edit right (er), or both (b). This enables manual resolution of differences.

Width setting (-w) controls output columns. Narrow widths truncate lines; wider widths show more content. Terminal width is commonly used (e.g., -w 80 or -w $COLUMNS).

Suppressing common lines (-s) shows only differences, useful for focusing on changes in files that are mostly identical.

Whitespace and case options help compare files with formatting differences that aren't substantive.

# CAVEATS

Binary files display poorly. Very long lines may be truncated. Interactive mode requires terminal. Wide files need wide terminal or scrolling. Not as feature-rich as diff for scripting.

# HISTORY

**sdiff** is part of GNU diffutils, developed by the Free Software Foundation. Side-by-side diff originated in Unix research, providing visual comparison before graphical diff tools existed. The GNU version added interactive merge mode and various comparison options.

# SEE ALSO

[diff](/man/diff)(1), [diff3](/man/diff3)(1), [cmp](/man/cmp)(1), [vimdiff](/man/vimdiff)(1)
