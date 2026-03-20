# TAGLINE

graphical dictionary application for the MATE desktop

# TLDR

**Open dictionary**

```mate-dictionary```

**Look up a word**

```mate-dictionary --look-up [word]```

**Look up a word using a specific database**

```mate-dictionary --database [wn] --look-up [word]```

**Look up a word and print to console without GUI**

```mate-dictionary --no-window --look-up [word]```

**Look up a word using a specific source**

```mate-dictionary --source [source_name] --look-up [word]```

# SYNOPSIS

**mate-dictionary** [_options_]

# PARAMETERS

**--look-up** _word_
> Look up the specified word using the pre-defined dictionary source.

**--match** _word_
> Find matching words using the pre-defined dictionary source.

**--source**, **-s** _source_
> Use the specified source for looking up words.

**--database**, **-D** _database_
> Use the specified database for looking up words.

**--no-window**, **-n**
> Print definitions to the console without launching the GUI.

# DESCRIPTION

**mate-dictionary** is a graphical dictionary application for the MATE desktop environment. It looks up words using DICT protocol servers and supports multiple dictionaries and search strategies. Results can be saved to file or printed.

# SEE ALSO

[dict](/man/dict)(1)

