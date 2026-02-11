# TAGLINE

Terminal-based typing speed test

# TLDR

**Start typing test**

```toipe```

**Use specific wordlist**

```toipe -w [wordlist]```

**Set word count**

```toipe -n [50]```

**Show available wordlists**

```toipe --list```

# SYNOPSIS

**toipe** [_-w wordlist_] [_-n count_] [_options_]

# PARAMETERS

**-w** _WORDLIST_
> Word list to use.

**-n** _COUNT_
> Number of words.

**--list**
> Show wordlists.

**--help**
> Show help.

# DESCRIPTION

**toipe** is a terminal-based typing speed test that measures words per minute (WPM) and accuracy. It presents randomly selected words from configurable word lists and tracks errors as you type in a clean, distraction-free interface.

Multiple word lists are available for different skill levels and purposes, viewable with **--list**. The number of words per test can be adjusted with **-n** to create shorter practice sessions or longer endurance tests.

# CAVEATS

Terminal-based only. Rust implementation. Limited customization.

# HISTORY

**toipe** was created as a terminal-based typing test application written in Rust.

# SEE ALSO

[tt](/man/tt)(1), [typespeed](/man/typespeed)(1)
