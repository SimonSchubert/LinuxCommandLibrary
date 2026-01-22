# TLDR

**Generate all combinations** of specified length using default charset

```crunch [4] [6]```

**Generate wordlist with custom** character set

```crunch [4] [4] [abc123]```

**Output wordlist to file**

```crunch [6] [8] -o [wordlist.txt]```

**Generate with pattern** (@ = lowercase, , = uppercase, % = number, ^ = symbol)

```crunch [8] [8] -t [@@@@%%%%]```

**Limit output file size** (e.g., 10MB per file)

```crunch [6] [6] -b [10mb] -o [START]```

**Generate using words** from a file

```crunch [4] [4] -p [word1] [word2] [word3]```

# SYNOPSIS

**crunch** _min-len_ _max-len_ [_charset_] [_options_]

# PARAMETERS

_MIN-LEN_
> Minimum length of generated strings.

_MAX-LEN_
> Maximum length of generated strings.

_CHARSET_
> Characters to use for generation (default: lowercase letters).

**-o** _FILE_
> Output to file instead of stdout.

**-t** _PATTERN_
> Specify pattern using placeholders (@ , % ^).

**-b** _SIZE_
> Split output into files of specified size.

**-c** _COUNT_
> Number of lines per output file.

**-p** _WORDS_
> Generate permutations of specified words.

**-d** _NUM_
> Limit duplicate characters.

**-s** _STRING_
> Start at specified string (for resuming).

**-z** _COMP_
> Compress output (gzip, bzip2, lzma).

# DESCRIPTION

**crunch** is a wordlist generator that creates lists of all possible combinations based on specified criteria. It's commonly used in authorized penetration testing for creating password lists, brute-force dictionaries, and testing security measures.

The tool generates combinations efficiently, supporting custom character sets, patterns, and size limits. Patterns allow mixing character types (letters, numbers, symbols) in specific positions. The permutation mode creates all arrangements of given words.

Output can be piped to other tools or split into manageable file sizes for large wordlists. Compression options help manage disk space for extensive generations.

# CAVEATS

Large wordlists can consume significant disk space and generation time. Use responsibly and only for authorized security testing. Ensure adequate storage before generating large lists. Consider the exponential growth of combinations with length.

# HISTORY

crunch was developed for the security community as a flexible wordlist generator. It became a standard tool in penetration testing distributions like Kali Linux. The tool enables security professionals to test password policies and authentication systems.

# SEE ALSO

[john](/man/john)(1), [hashcat](/man/hashcat)(1), [hydra](/man/hydra)(1)
