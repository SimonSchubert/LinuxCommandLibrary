# TAGLINE

Word search game on a grid of letter cubes

# TLDR

**Start a game of Boggle**

```boggle```

**Play with a custom time limit in seconds**

```boggle -t [180]```

**Set minimum word length**

```boggle -w [4]```

**Start with a specific board configuration**

```boggle [abcdefghijklmnop]```

**Allow cubes to be reused (not in succession)**

```boggle +```

# SYNOPSIS

**boggle** [**-bd**] [**-s** _seed_] [**-t** _time_] [**-w** _length_] [**+**] [**++**] [_boardspec_]

# DESCRIPTION

**boggle** is a word search game from the BSD games collection. The objective is to find as many words as possible on a 4x4 grid of letter cubes within a three-minute time limit.

Words are formed by connecting adjacent cubes horizontally, vertically, or diagonally. Each cube can only be used once per word, and words must be at least 3 letters long. The game checks found words against its dictionary.

Type **?** during play for help. Words containing 'q' must have 'u' immediately following.

# PARAMETERS

**-b**
> Batch mode. Requires a boardspec. Reads dictionary from stdin and outputs matching words to stdout

**-d**
> Enable debugging output

**-s** _seed_
> Use specified random seed instead of current time

**-t** _time_
> Set time limit in seconds (default: 180)

**-w** _length_
> Set minimum word length (default: 3)

**+**
> Allow cubes to be reused, but not consecutively

**++**
> Allow cubes to be considered adjacent to themselves

**boardspec**
> Specify starting board as 16 letters, left-to-right, top-to-bottom

# HISTORY

Boggle is a word game originally published by Parker Brothers in **1972**. The BSD games version is a terminal implementation included in the classic Unix games collection that originated from Berkeley Software Distribution.

# SEE ALSO

[hangman](/man/hangman)(6), [quiz](/man/quiz)(6)
