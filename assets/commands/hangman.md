# TAGLINE

classic word-guessing game

# TLDR

**Start hangman game**

```hangman```

**Use custom word list**

```hangman -w [wordlist.txt]```

**Set word length**

```hangman -l [8]```

# SYNOPSIS

**hangman** [_options_]

# PARAMETERS

**-w** _FILE_
> Word list file.

**-l** _LEN_
> Minimum word length.

**-k**
> Show keyboard.

**--help**
> Display help information.

# DESCRIPTION

**hangman** is a classic word-guessing game. Players guess letters to reveal a hidden word before making too many wrong guesses.

The game displays the gallows and tracks incorrect guesses. It uses the system dictionary or a custom word list for challenges.

# CAVEATS

Part of BSD games. Requires /usr/share/dict/words or custom list. Terminal-based display.

# HISTORY

hangman has been part of **BSD games** collection since early Unix systems, providing terminal entertainment.

# SEE ALSO

[bsdgames](/man/bsdgames)(6), [words](/man/words)(4), [fortune](/man/fortune)(6)
