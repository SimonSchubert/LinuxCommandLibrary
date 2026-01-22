# TLDR

**Cut the first field** (tab-delimited)

```echo "[a\tb\tc]" | tuc -f 1```

**Cut fields 1 through 3**

```echo "[a:b:c:d]" | tuc -d ':' -f 1:3```

**Reorder fields**

```echo "[a,b,c]" | tuc -d ',' -f 3,1,2```

**Use negative indexing** (last field)

```echo "[a b c]" | tuc -d ' ' -f -1```

**Use regex as delimiter**

```echo "[a1b2c3]" | tuc -e '[0-9]' -f 1:```

**Replace delimiter** in output

```echo "[a:b:c]" | tuc -d ':' -r '-' -f 1:```

**Select specific characters**

```echo "[hello]" | tuc -c 1:3```

**Format output with template**

```echo "[a,b,c]" | tuc -d ',' -f '{1} - {2}'```

# SYNOPSIS

**tuc** [_flags_] [_options_] [_file_]

# PARAMETERS

**-f**, **--fields** _bounds_
> Fields to select (default: 1:)

**-b**, **--bytes** _bounds_
> Select specific bytes

**-c**, **--characters** _bounds_
> Select characters (UTF-8 aware)

**-l**, **--lines** _bounds_
> Select lines

**-d**, **--delimiter** _delim_
> Field delimiter (default: tab)

**-e**, **--regex** _pattern_
> Use regex as delimiter

**-r**, **--replace-delimiter** _text_
> Replace delimiter with custom text

**-t**, **--trim** _type_
> Trim delimiters: l (left), r (right), b (both)

**-g**, **--greedy-delimiter**
> Match consecutive delimiters as one

**-p**, **--compress-delimiter**
> Merge consecutive delimiters before cutting

**-s**, **--only-delimited**
> Show only lines containing the delimiter

**-m**, **--complement**
> Invert field selection

**-j**, **--join**
> Rejoin selected parts with the delimiter

**-z**, **--zero-terminated**
> Use NUL instead of newline as line terminator

**--json**
> Output fields as JSON array

# DESCRIPTION

**tuc** is a modern alternative to the classic **cut** command, written in Rust. It provides enhanced field selection with features like negative indexing, regex delimiters, multi-character delimiters, and field reordering.

Field syntax supports ranges (**1:3**), lists (**1,3,5**), negative indexes (**-1** for last), and combinations. Template formatting with **{1}**, **{2}** allows custom output formatting.

Unlike cut, tuc can reorder fields, use regex patterns for splitting, and handle Unicode characters correctly. The **-g** option treats consecutive delimiters as one, useful for whitespace-separated data with variable spacing.

# CAVEATS

Regex support increases binary size; build with **--no-default-features** for a smaller binary. Field numbering starts at 1, not 0. The default delimiter is tab, not whitespace.

# HISTORY

**tuc** was created by **Riccardo Attilio Galli** (riquito) as a Rust-based enhancement to the traditional cut utility. The name is a playful reversal of "cut." The project was motivated by cut's limitations with regex delimiters, field reordering, and negative indexing.

# SEE ALSO

[cut](/man/cut)(1), [awk](/man/awk)(1), [choose](/man/choose)(1), [sed](/man/sed)(1)
