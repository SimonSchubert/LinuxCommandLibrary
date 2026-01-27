# TLDR

**Start typing test with default words**

```ttyper```

**Limit to specific number of words**

```ttyper -w [25]```

**Practice with programming language**

```ttyper -l [rust]```

**Use custom word file**

```ttyper -c [/path/to/wordlist.txt]```

**Practice with specific language file**

```ttyper -l [python] -w [50]```

**Show available languages**

```ttyper --list-languages```

# SYNOPSIS

**ttyper** [_options_]

# PARAMETERS

**-w**, **--words** _count_
> Number of words to include in the test.

**-l**, **--language** _lang_
> Use words from specified programming language.

**-c**, **--contents** _file_
> Use custom file as word source.

**--list-languages**
> Display available built-in languages.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# LANGUAGES

Built-in language support includes: C, C#, Go, HTML, Java, JavaScript, Python, Ruby, Rust, and common English words.

# DESCRIPTION

**ttyper** is a terminal-based typing test built with Rust and Ratatui. It measures typing speed in words per minute (WPM) and accuracy, providing immediate visual feedback as you type.

The test highlights correct characters in green and incorrect ones in red. Statistics include raw WPM, adjusted WPM (accounting for errors), and accuracy percentage. Results are displayed upon completion.

Programming language modes include keywords and common identifiers from each language, making it useful for developers to practice language-specific typing patterns. Custom word lists allow personalized practice sets.

# CAVEATS

Requires a terminal with Unicode support. Configuration stored in ~/.config/ttyper/. Results are not persisted between sessions by default. Terminal size affects display layout.

# HISTORY

**ttyper** was created as a terminal-native alternative to web-based typing tests like Monkeytype. The developer wanted typing practice without leaving the terminal environment. Built with Rust, it showcases modern terminal UI capabilities using the Ratatui framework.

# SEE ALSO

[typespeed](/man/typespeed)(6), [wpm](/man/wpm)(1), [gtypist](/man/gtypist)(1)
