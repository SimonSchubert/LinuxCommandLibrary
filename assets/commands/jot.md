# TLDR

**Generate sequence**

```jot [10]```

**Generate range**

```jot [10] [1] [100]```

**Generate with step**

```jot - [1] [100] [5]```

**Random numbers**

```jot -r [5] [1] [100]```

**Repeated string**

```jot -b [string] [5]```

**Formatted output**

```jot -w "[%02d]" [10]```

# SYNOPSIS

**jot** [_options_] [_reps_ [_begin_ [_end_ [_step_]]]]

# PARAMETERS

_REPS_
> Number of repetitions.

_BEGIN_
> Starting value.

_END_
> Ending value.

_STEP_
> Increment.

**-r**
> Random values.

**-b** _STRING_
> Repeat string.

**-w** _FORMAT_
> Printf format.

**-s** _STRING_
> Separator.

**--help**
> Display help information.

# DESCRIPTION

**jot** generates sequential or random data. It produces numbers, characters, or formatted strings.

The tool is useful for generating test data and sequences. It supports various output formats.

jot generates data sequences.

# CAVEATS

BSD utility. Not in GNU coreutils. Use seq for portability.

# HISTORY

jot originated in **BSD Unix** as a data generator utility. It provides more flexibility than seq.

# SEE ALSO

[seq](/man/seq)(1), [yes](/man/yes)(1), [printf](/man/printf)(1)
