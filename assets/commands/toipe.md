# TAGLINE

Terminal-based typing speed test

# TLDR

**Start a typing test** with the default settings

```toipe```

**Choose a built-in wordlist**

```toipe -w [top1000]```

**Use a custom wordlist** file

```toipe -f [path/to/words.txt]```

**Set the number of words** per test

```toipe -n [50]```

**List built-in** wordlists

```toipe --list```

# SYNOPSIS

**toipe** [_-w wordlist_] [_-f file_] [_-n count_] [_options_]

# PARAMETERS

**-w** _WORDLIST_
> Built-in wordlist name (top250, top500, top1000, ...).

**-f** _FILE_
> Read words from a custom newline-separated file.

**-n** _COUNT_
> Number of words to include in the test.

**-p**, **--punctuation**
> Include punctuation in generated text.

**--list**
> List available built-in wordlists and exit.

**--help**
> Display help.

# DESCRIPTION

**toipe** is a terminal-based typing speed test written in Rust. It draws random words from a wordlist, presents them as a single paragraph in the terminal, and tracks per-character errors as you type. At the end of a run it prints words per minute (WPM), characters per minute (CPM), and accuracy.

Several built-in wordlists ship with the binary, grouped by difficulty. Custom lists can be loaded with **-f**, allowing practice on programming keywords, foreign-language vocabulary, or domain-specific text.

# CAVEATS

Terminal-based only; requires a terminal that supports raw mode. Performance reporting assumes a one-second resolution clock. The shipped wordlists are English-only, but **-f** accepts any UTF-8 file. Wordlists with characters outside the typical 7-bit ASCII range may not render correctly on legacy terminals.

# HISTORY

**toipe** was created as a terminal-based typing test application written in Rust.

# INSTALL

```zypper: sudo zypper install toipe```

```brew: brew install toipe```

```nix: nix profile install nixpkgs#toipe```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tt](/man/tt)(1), [typespeed](/man/typespeed)(1), [wpm](/man/wpm)(1)
