# TAGLINE

Randomly shuffle input lines

# TLDR

**Shuffle lines of a file**

```shuf [file]```

**Pick N random lines**

```shuf -n [5] [file]```

**Generate random numbers in range**

```shuf -i [1-100]```

**Pick N random numbers from range**

```shuf -i [1-100] -n [10]```

**Shuffle command arguments**

```shuf -e [item1] [item2] [item3]```

**Output with custom delimiter**

```shuf -e -z [items] | xargs -0```

**Repeat output** (with replacement)

```shuf -r -n [10] -e [a] [b] [c]```

**Use specific random seed**

```shuf --random-source=[/dev/urandom] [file]```

# SYNOPSIS

**shuf** [_-n count_] [_-i range_] [_-e args_] [_-r_] [_options_] [_file_]

# PARAMETERS

**-n** _NUM_, **--head-count** _NUM_
> Output at most NUM lines.

**-i** _LO-HI_, **--input-range** _LO-HI_
> Generate numbers from LO to HI.

**-e**, **--echo**
> Treat arguments as input lines.

**-r**, **--repeat**
> Output can repeat (with replacement).

**-z**, **--zero-terminated**
> Use NUL as line delimiter.

**-o** _FILE_, **--output** _FILE_
> Write to file instead of stdout.

**--random-source** _FILE_
> Get random bytes from file.

# DESCRIPTION

**shuf** randomly permutes input lines. It reads input, shuffles the order, and outputs all lines in random sequence.

Without options, shuf outputs all input lines in random order. The -n option limits output to the first N lines after shuffling - effectively random sampling without replacement.

Input range mode (-i) generates sequential numbers and shuffles them. Combined with -n, this selects random numbers from a range. Useful for generating lottery numbers, random IDs, or sampling.

Echo mode (-e) shuffles command-line arguments instead of file lines. This enables shuffling small lists without creating temporary files.

Repeat mode (-r) enables sampling with replacement - the same line can appear multiple times in output. This is useful for bootstrap sampling or simulation.

The random source option ensures reproducible shuffling when given a deterministic source, useful for testing.

# CAVEATS

Loads entire input into memory. Very large files may cause memory issues. Default randomness is good but not cryptographic. Without -n, outputs entire input. Different from sort -R which may group identical lines.

# HISTORY

**shuf** is part of **GNU coreutils**, providing command-line random shuffling. While Unix systems had various random line selection tools, shuf provides comprehensive shuffling with range generation and sampling options.

# SEE ALSO

[sort](/man/sort)(1), [head](/man/head)(1), [tail](/man/tail)(1), [sample](/man/sample)(1)
