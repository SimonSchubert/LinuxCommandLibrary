# TAGLINE

Manage bloom filters for password checking

# TLDR

**Create** a new bloom filter from a dictionary file

```apgbfm -f [filter.bf] -d [dictionary.txt]```

**Create** an empty bloom filter for a specific number of words

```apgbfm -f [filter.bf] -n [50000]```

**Check** if a word exists in the filter

```apgbfm -f [filter.bf] -c [password]```

**Add** a single word to an existing filter

```apgbfm -f [filter.bf] -a [word]```

**Add** words from a dictionary file to an existing filter

```apgbfm -f [filter.bf] -A [dictionary.txt]```

**Display** filter information

```apgbfm -i [filter.bf]```

# SYNOPSIS

**apgbfm** **-f** _filter_ **-n** _numofwords_ [**-q**] [**-s**]
**apgbfm** **-f** _filter_ **-d** _dictfile_ [**-q**] [**-s**]
**apgbfm** **-f** _filter_ **-a** _word_ [**-q**]
**apgbfm** **-f** _filter_ **-A** _dictfile_ [**-q**]
**apgbfm** **-f** _filter_ **-c** _word_ [**-q**]
**apgbfm** **-f** _filter_ **-C** _dictfile_ [**-q**]
**apgbfm** **-i** _filter_
**apgbfm** [**-v**] [**-h**]

# DESCRIPTION

**apgbfm** (APG Bloom Filter Manager) creates and manages bloom filters for the apg password generator. Bloom filters enable fast dictionary checking without loading entire dictionaries into memory. It uses SHA-1 as its hash function.

This tool can be used standalone or with apg/apgd to avoid generating passwords that appear in common password dictionaries.

# PARAMETERS

**-f** _filter_
> Bloom filter filename to use

**-n** _numofwords_
> Create new empty filter for the specified number of words

**-d** _dictfile_
> Create new filter from dictionary file

**-a** _word_
> Add a single word to the filter

**-A** _dictfile_
> Add all words from dictionary file to the filter

**-c** _word_
> Check if a word exists in the filter

**-C** _dictfile_
> Check every word from dictionary file against the filter

**-i** _filter_
> Display filter information

**-s**
> Create filter in case-insensitive mode

**-q**
> Quiet mode

**-v**
> Print version information

**-h**
> Print help information

# CAVEATS

Bloom filters have false positives but no false negatives. A rejected password might not actually be in the dictionary, but an accepted one definitely isn't. Filter size affects accuracy.

# HISTORY

**apgbfm** was created as a companion tool to apg, using bloom filters to efficiently check generated passwords against large dictionaries.

# SEE ALSO

[apg](/man/apg)(1)
