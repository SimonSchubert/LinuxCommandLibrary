# TLDR

**Convert CSV to tab-delimited**

```csvformat -T [input.csv]```

**Change delimiter**

```csvformat -D "[;]" [input.csv]```

**Convert to specific quoting**

```csvformat -U [0|1|2|3] [input.csv]```

**Remove header**

```csvformat -K [1] [input.csv]```

# SYNOPSIS

**csvformat** [_options_] [_file_]

# PARAMETERS

**-T**
> Output tab-delimited.

**-D** _delimiter_
> Set output delimiter.

**-U** _style_
> Quoting style: 0=minimal, 1=all, 2=non-numeric, 3=none.

**-K** _n_
> Skip first n rows.

**-M** _char_
> Set output line terminator.

# DESCRIPTION

**csvformat** converts CSV files to different delimited formats. Part of csvkit, it handles delimiter changes, quoting styles, and line endings.

# SEE ALSO

[csvkit](/man/csvkit)(1), [csv-diff](/man/csv-diff)(1), [csvlook](/man/csvlook)(1)
