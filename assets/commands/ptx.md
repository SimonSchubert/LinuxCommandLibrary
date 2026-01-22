# TLDR

Generate index with **line references**

```ptx -r [file]```

Generate with **auto references**

```ptx -A [file]```

Set output **width**

```ptx -w [80] [file]```

Use **word filter**

```ptx -o [filter_file] [file]```

Use **SYSV** traditional mode

```ptx -G [file]```

# SYNOPSIS

**ptx** [**-A**] [**-r**] [**-w** _width_] [**-o** _file_] [**-G**] [_input_file_]

# PARAMETERS

**-A, --auto-reference**
> Generate automatic index references

**-r, --references**
> Use first field as index reference

**-w, --width _cols_**
> Output line width in columns

**-o, --only-file _file_**
> Read list of words to index

**-i, --ignore-file _file_**
> Read list of words to ignore

**-G, --traditional**
> SYSV-compatible behavior

# DESCRIPTION

**ptx** produces a permuted index (also known as KWIC - Key Word In Context) from text files. Each significant word appears as an index entry with surrounding context, allowing readers to locate topics by any word.

The output shows each word centered with its surrounding context, useful for creating concordances or keyword indexes for documentation.

# CAVEATS

Output format designed for old terminals. May need post-processing for modern use. Word filtering requires separate file. Large files produce extensive output.

# HISTORY

**ptx** is a traditional Unix text processing tool, part of GNU coreutils. Permuted indexes were important for printed documentation before full-text search became common.

# SEE ALSO

[sort](/man/sort)(1), [grep](/man/grep)(1), [awk](/man/awk)(1)
