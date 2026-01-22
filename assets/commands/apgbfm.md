# TLDR

**Generate** bloom filter from dictionary

```apgbfm -d [dictionary.txt] -f [filter.bf]```

**Check** a word against filter

```apgbfm -f [filter.bf] -c [password]```

Create filter with **specific size**

```apgbfm -d [dictionary.txt] -f [filter.bf] -n [1000000]```

# SYNOPSIS

**apgbfm** [_-d dictfile_] [_-f filterfile_] [_-n size_] [_-c word_]

# DESCRIPTION

**apgbfm** (APG Bloom Filter Manager) creates and manages bloom filters for the apg password generator. Bloom filters enable fast dictionary checking without loading entire dictionaries into memory.

This tool is used to create filter files from word lists that apg can use to avoid generating passwords that appear in common password dictionaries.

# PARAMETERS

**-d** _file_
> Dictionary file (word list)

**-f** _file_
> Bloom filter file

**-n** _size_
> Number of elements (affects accuracy)

**-c** _word_
> Check if word might be in filter

**-v**
> Verbose output

# CAVEATS

Bloom filters have false positives but no false negatives. A rejected password might not actually be in the dictionary, but an accepted one definitely isn't. Filter size affects accuracy.

# HISTORY

**apgbfm** was created as a companion tool to apg, using bloom filters to efficiently check generated passwords against large dictionaries.

# SEE ALSO

[apg](/man/apg)(1)
